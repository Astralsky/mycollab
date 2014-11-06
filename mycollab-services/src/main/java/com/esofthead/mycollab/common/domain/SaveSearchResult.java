/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
/*Domain class of table s_save_search_result*/
package com.esofthead.mycollab.common.domain;

import com.esofthead.mycollab.core.arguments.ValuedBean;
import java.util.Date;

@SuppressWarnings("ucd")
@com.esofthead.mycollab.core.db.metadata.Table("s_save_search_result")
class SaveSearchResult extends ValuedBean {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_save_search_result.id
     *
     * @mbggenerated Thu Nov 06 11:11:29 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("id")
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_save_search_result.saveUser
     *
     * @mbggenerated Thu Nov 06 11:11:29 ICT 2014
     */
    @org.hibernate.validator.constraints.Length(max=45, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("saveUser")
    private String saveuser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_save_search_result.sAccountId
     *
     * @mbggenerated Thu Nov 06 11:11:29 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("sAccountId")
    private Integer saccountid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_save_search_result.type
     *
     * @mbggenerated Thu Nov 06 11:11:29 ICT 2014
     */
    @org.hibernate.validator.constraints.Length(max=45, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("type")
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_save_search_result.createdTime
     *
     * @mbggenerated Thu Nov 06 11:11:29 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("createdTime")
    private Date createdtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_save_search_result.lastUpdatedTime
     *
     * @mbggenerated Thu Nov 06 11:11:29 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("lastUpdatedTime")
    private Date lastupdatedtime;

    private static final long serialVersionUID = 1;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_save_search_result.id
     *
     * @return the value of s_save_search_result.id
     *
     * @mbggenerated Thu Nov 06 11:11:29 ICT 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_save_search_result.id
     *
     * @param id the value for s_save_search_result.id
     *
     * @mbggenerated Thu Nov 06 11:11:29 ICT 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_save_search_result.saveUser
     *
     * @return the value of s_save_search_result.saveUser
     *
     * @mbggenerated Thu Nov 06 11:11:29 ICT 2014
     */
    public String getSaveuser() {
        return saveuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_save_search_result.saveUser
     *
     * @param saveuser the value for s_save_search_result.saveUser
     *
     * @mbggenerated Thu Nov 06 11:11:29 ICT 2014
     */
    public void setSaveuser(String saveuser) {
        this.saveuser = saveuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_save_search_result.sAccountId
     *
     * @return the value of s_save_search_result.sAccountId
     *
     * @mbggenerated Thu Nov 06 11:11:29 ICT 2014
     */
    public Integer getSaccountid() {
        return saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_save_search_result.sAccountId
     *
     * @param saccountid the value for s_save_search_result.sAccountId
     *
     * @mbggenerated Thu Nov 06 11:11:29 ICT 2014
     */
    public void setSaccountid(Integer saccountid) {
        this.saccountid = saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_save_search_result.type
     *
     * @return the value of s_save_search_result.type
     *
     * @mbggenerated Thu Nov 06 11:11:29 ICT 2014
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_save_search_result.type
     *
     * @param type the value for s_save_search_result.type
     *
     * @mbggenerated Thu Nov 06 11:11:29 ICT 2014
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_save_search_result.createdTime
     *
     * @return the value of s_save_search_result.createdTime
     *
     * @mbggenerated Thu Nov 06 11:11:29 ICT 2014
     */
    public Date getCreatedtime() {
        return createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_save_search_result.createdTime
     *
     * @param createdtime the value for s_save_search_result.createdTime
     *
     * @mbggenerated Thu Nov 06 11:11:29 ICT 2014
     */
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_save_search_result.lastUpdatedTime
     *
     * @return the value of s_save_search_result.lastUpdatedTime
     *
     * @mbggenerated Thu Nov 06 11:11:29 ICT 2014
     */
    public Date getLastupdatedtime() {
        return lastupdatedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_save_search_result.lastUpdatedTime
     *
     * @param lastupdatedtime the value for s_save_search_result.lastUpdatedTime
     *
     * @mbggenerated Thu Nov 06 11:11:29 ICT 2014
     */
    public void setLastupdatedtime(Date lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }
}