/**
 * This file is part of mycollab-web.
 *
 * mycollab-web is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-web is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-web.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.esofthead.mycollab.module.project.view.settings;

import java.util.List;

import org.vaadin.dialogs.ConfirmDialog;

import com.esofthead.mycollab.common.GenericLinkUtils;
import com.esofthead.mycollab.common.i18n.GenericI18Enum;
import com.esofthead.mycollab.configuration.SiteConfiguration;
import com.esofthead.mycollab.core.arguments.SearchRequest;
import com.esofthead.mycollab.core.utils.DateTimeUtils;
import com.esofthead.mycollab.eventmanager.EventBusFactory;
import com.esofthead.mycollab.module.billing.RegisterStatusConstants;
import com.esofthead.mycollab.module.project.CurrentProjectVariables;
import com.esofthead.mycollab.module.project.ProjectLinkBuilder;
import com.esofthead.mycollab.module.project.ProjectLinkGenerator;
import com.esofthead.mycollab.module.project.ProjectMemberStatusConstants;
import com.esofthead.mycollab.module.project.ProjectRolePermissionCollections;
import com.esofthead.mycollab.module.project.dao.ProjectMemberMapper;
import com.esofthead.mycollab.module.project.domain.SimpleProjectMember;
import com.esofthead.mycollab.module.project.domain.criteria.ProjectMemberSearchCriteria;
import com.esofthead.mycollab.module.project.events.ProjectMemberEvent;
import com.esofthead.mycollab.module.project.i18n.ProjectMemberI18nEnum;
import com.esofthead.mycollab.module.project.service.ProjectMemberService;
import com.esofthead.mycollab.spring.ApplicationContextUtil;
import com.esofthead.mycollab.vaadin.AppContext;
import com.esofthead.mycollab.vaadin.mvp.AbstractPageView;
import com.esofthead.mycollab.vaadin.mvp.ViewComponent;
import com.esofthead.mycollab.vaadin.ui.ButtonLink;
import com.esofthead.mycollab.vaadin.ui.ConfirmDialogExt;
import com.esofthead.mycollab.vaadin.ui.LabelLink;
import com.esofthead.mycollab.vaadin.ui.MyCollabResource;
import com.esofthead.mycollab.vaadin.ui.UIConstants;
import com.esofthead.mycollab.vaadin.ui.UserAvatarControlFactory;
import com.esofthead.mycollab.vaadin.ui.WebResourceIds;
import com.vaadin.event.MouseEvents;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * 
 * @author MyCollab Ltd.
 * @since 1.0
 */
@ViewComponent
public class ProjectMemberListViewImpl extends AbstractPageView implements
		ProjectMemberListView {
	private static final long serialVersionUID = 1L;
	private CssLayout contentLayout;

	public ProjectMemberListViewImpl() {
		super();
		this.setMargin(new MarginInfo(false, true, false, true));
		HorizontalLayout viewHeader = new HorizontalLayout();
		viewHeader.setStyleName("hdr-view");
		viewHeader.setMargin(new MarginInfo(true, false, true, false));
		viewHeader.setSpacing(true);
		viewHeader.setWidth("100%");
		viewHeader.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);

		viewHeader.addComponent(new Image(null, MyCollabResource
				.newResource("icons/24/project/user.png")));

		Label headerText = new Label(
				AppContext.getMessage(ProjectMemberI18nEnum.VIEW_LIST_TITLE));
		headerText.setStyleName("hdr-text");

		viewHeader.addComponent(headerText);
		viewHeader.setExpandRatio(headerText, 1.0f);

		Button createBtn = new Button(
				AppContext
						.getMessage(ProjectMemberI18nEnum.BUTTON_NEW_INVITEES),
				new Button.ClickListener() {
					private static final long serialVersionUID = 1L;

					@Override
					public void buttonClick(Button.ClickEvent event) {
						EventBusFactory.getInstance().post(
								new ProjectMemberEvent.GotoInviteMembers(this,
										null));
					}
				});
		createBtn.setEnabled(CurrentProjectVariables
				.canWrite(ProjectRolePermissionCollections.USERS));
		createBtn.setStyleName(UIConstants.THEME_GREEN_LINK);
		createBtn.setIcon(MyCollabResource
				.newResource(WebResourceIds._16_addRecord));

		viewHeader.addComponent(createBtn);

		this.addComponent(viewHeader);

		contentLayout = new CssLayout();
		contentLayout.setWidth("100%");
		contentLayout.setStyleName("view-content");

		this.addComponent(contentLayout);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void setSearchCriteria(ProjectMemberSearchCriteria searchCriteria) {
		ProjectMemberService prjMemberService = ApplicationContextUtil
				.getSpringBean(ProjectMemberService.class);
		List<SimpleProjectMember> memberLists = prjMemberService
				.findPagableListByCriteria(new SearchRequest<ProjectMemberSearchCriteria>(
						searchCriteria, 0, Integer.MAX_VALUE));

		contentLayout.removeAllComponents();
		for (SimpleProjectMember member : memberLists) {
			contentLayout.addComponent(generateMemberBlock(member));
		}
	}

	private Component generateMemberBlock(final SimpleProjectMember member) {
		CssLayout memberBlock = new CssLayout();
		memberBlock.addStyleName("member-block");

		VerticalLayout blockContent = new VerticalLayout();
		HorizontalLayout blockTop = new HorizontalLayout();
		blockTop.setSpacing(true);
		Image memberAvatar = UserAvatarControlFactory
				.createUserAvatarEmbeddedComponent(member.getMemberAvatarId(),
						100);
		blockTop.addComponent(memberAvatar);

		VerticalLayout memberInfo = new VerticalLayout();

		Image btnDelete = new Image(null,
				MyCollabResource.newResource(WebResourceIds._12_project_icon_x));
		btnDelete.addClickListener(new MouseEvents.ClickListener() {
			private static final long serialVersionUID = 1L;

			@Override
			public void click(MouseEvents.ClickEvent event) {
				ConfirmDialogExt.show(
						UI.getCurrent(),
						AppContext.getMessage(
								GenericI18Enum.DIALOG_DELETE_TITLE,
								SiteConfiguration.getSiteName()),
						AppContext
								.getMessage(GenericI18Enum.DIALOG_DELETE_SINGLE_ITEM_MESSAGE),
						AppContext.getMessage(GenericI18Enum.BUTTON_YES),
						AppContext.getMessage(GenericI18Enum.BUTTON_NO),
						new ConfirmDialog.Listener() {
							private static final long serialVersionUID = 1L;

							@Override
							public void onClose(ConfirmDialog dialog) {
								if (dialog.isConfirmed()) {
									ProjectMemberService prjMemberService = ApplicationContextUtil
											.getSpringBean(ProjectMemberService.class);
									member.setStatus(ProjectMemberStatusConstants.INACTIVE);
									prjMemberService.updateWithSession(member,
											AppContext.getUsername());

									EventBusFactory
											.getInstance()
											.post(new ProjectMemberEvent.GotoList(
													ProjectMemberListViewImpl.this,
													null));
								}
							}
						});
			}
		});
		btnDelete.addStyleName("icon-btn");

		blockContent.addComponent(btnDelete);
		btnDelete.setVisible(CurrentProjectVariables
				.canWrite(ProjectRolePermissionCollections.USERS));
		blockContent.setComponentAlignment(btnDelete, Alignment.TOP_RIGHT);

		LabelLink memberLink = new LabelLink(member.getMemberFullName(),
				ProjectLinkBuilder.generateProjectMemberFullLink(
						member.getProjectid(), member.getUsername()));

		memberLink.setWidth("100%");
		memberLink.addStyleName("member-name");

		memberInfo.addComponent(memberLink);

		String memerRoleLinkPrefix = "<a href=\""
				+ AppContext.getSiteUrl()
				+ GenericLinkUtils.URL_PREFIX_PARAM
				+ ProjectLinkGenerator.generateRolePreviewLink(
						member.getProjectid(), member.getProjectRoleId())
				+ "\"";
		Label memberRole = new Label();
		memberRole.setContentMode(ContentMode.HTML);
		memberRole.setStyleName("member-role");
		if (member.getIsadmin() != null && member.getIsadmin() == Boolean.TRUE
				|| member.getProjectroleid() == null) {
			memberRole.setValue(memerRoleLinkPrefix
					+ "style=\"color: #B00000;\">" + "Project Admin" + "</a>");
		} else {
			memberRole.setValue(memerRoleLinkPrefix
					+ "style=\"color:gray;font-size:12px;\">"
					+ member.getRoleName() + "</a>");
		}
		memberRole.setSizeUndefined();
		memberInfo.addComponent(memberRole);

		Label memberEmailLabel = new Label("<a href='mailto:"
				+ member.getUsername() + "'>" + member.getUsername() + "</a>",
				ContentMode.HTML);
		memberEmailLabel.addStyleName("member-email");
		memberEmailLabel.setWidth("100%");
		memberInfo.addComponent(memberEmailLabel);

		Label memberSinceLabel = new Label("Member since: "
				+ AppContext.formatDate(member.getJoindate()));
		memberSinceLabel.addStyleName("member-email");
		memberSinceLabel.setWidth("100%");
		memberInfo.addComponent(memberSinceLabel);

		if (RegisterStatusConstants.SENT_VERIFICATION_EMAIL.equals(member
				.getStatus())) {
			final VerticalLayout waitingNotLayout = new VerticalLayout();
			Label infoStatus = new Label(
					AppContext
							.getMessage(ProjectMemberI18nEnum.WAITING_ACCEPT_INVITATION));
			infoStatus.addStyleName("member-email");
			waitingNotLayout.addComponent(infoStatus);

			ButtonLink resendInvitationLink = new ButtonLink(
					AppContext
							.getMessage(ProjectMemberI18nEnum.BUTTON_RESEND_INVITATION),
					new Button.ClickListener() {
						private static final long serialVersionUID = 1L;

						@Override
						public void buttonClick(ClickEvent event) {
							ProjectMemberMapper projectMemberMapper = ApplicationContextUtil
									.getSpringBean(ProjectMemberMapper.class);
							member.setStatus(RegisterStatusConstants.VERIFICATING);
							projectMemberMapper
									.updateByPrimaryKeySelective(member);
							waitingNotLayout.removeAllComponents();
							Label statusEmail = new Label(
									AppContext
											.getMessage(ProjectMemberI18nEnum.SENDING_EMAIL_INVITATION));
							statusEmail.addStyleName("member-email");
							waitingNotLayout.addComponent(statusEmail);
						}
					});
			resendInvitationLink.setStyleName("link");
			resendInvitationLink.addStyleName("member-email");
			waitingNotLayout.addComponent(resendInvitationLink);
			memberInfo.addComponent(waitingNotLayout);
		} else if (RegisterStatusConstants.ACTIVE.equals(member.getStatus())) {
			Label lastAccessTimeLbl = new Label("Logged in "
					+ DateTimeUtils.getPrettyDateValue(
							member.getLastAccessTime(),
							AppContext.getUserLocale()));
			lastAccessTimeLbl.addStyleName("member-email");
			memberInfo.addComponent(lastAccessTimeLbl);
		} else if (RegisterStatusConstants.VERIFICATING.equals(member
				.getStatus())) {
			Label infoStatus = new Label(
					AppContext
							.getMessage(ProjectMemberI18nEnum.SENDING_EMAIL_INVITATION));
			infoStatus.addStyleName("member-email");
			memberInfo.addComponent(infoStatus);
		}

		String bugStatus = member.getNumOpenBugs() + " open bug";
		if (member.getNumOpenBugs() > 1) {
			bugStatus += "s";
		}

		String taskStatus = member.getNumOpenTasks() + " open task";
		if (member.getNumOpenTasks() > 1) {
			taskStatus += "s";
		}

		Label memberWorkStatus = new Label(bugStatus + " - " + taskStatus);
		memberInfo.addComponent(memberWorkStatus);
		memberInfo.setWidth("100%");

		blockTop.addComponent(memberInfo);
		blockTop.setExpandRatio(memberInfo, 1.0f);
		blockTop.setWidth("100%");
		blockContent.addComponent(blockTop);

		blockContent.setWidth("100%");

		memberBlock.addComponent(blockContent);
		return memberBlock;
	}
}