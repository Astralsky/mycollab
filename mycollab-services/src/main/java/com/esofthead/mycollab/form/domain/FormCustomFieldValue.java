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
/*Domain class of table m_form_custom_field_value*/
package com.esofthead.mycollab.form.domain;

import com.esofthead.mycollab.core.arguments.ValuedBean;
import java.util.Date;

@SuppressWarnings("ucd")
@com.esofthead.mycollab.core.db.metadata.Table("m_form_custom_field_value")
class FormCustomFieldValue extends ValuedBean {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_custom_field_value.id
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("id")
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_custom_field_value.module
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    @org.hibernate.validator.constraints.Length(max=45, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("module")
    private String module;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_custom_field_value.typeid
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("typeid")
    private Integer typeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_custom_field_value.number1
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("number1")
    private Double number1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_custom_field_value.number2
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("number2")
    private Double number2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_custom_field_value.number3
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("number3")
    private Double number3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_custom_field_value.number4
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("number4")
    private Double number4;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_custom_field_value.number5
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("number5")
    private Double number5;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_custom_field_value.int1
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("int1")
    private Integer int1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_custom_field_value.int2
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("int2")
    private Integer int2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_custom_field_value.int3
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("int3")
    private Integer int3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_custom_field_value.int4
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("int4")
    private Integer int4;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_custom_field_value.int5
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("int5")
    private Integer int5;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_custom_field_value.date1
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("date1")
    private Date date1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_custom_field_value.date2
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("date2")
    private Date date2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_custom_field_value.date3
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("date3")
    private Date date3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_custom_field_value.date4
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("date4")
    private Date date4;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_custom_field_value.date5
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("date5")
    private Date date5;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_custom_field_value.bool1
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("bool1")
    private Boolean bool1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_custom_field_value.bool2
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("bool2")
    private Boolean bool2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_custom_field_value.bool3
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("bool3")
    private Boolean bool3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_custom_field_value.bool4
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("bool4")
    private Boolean bool4;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_custom_field_value.bool5
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("bool5")
    private Boolean bool5;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_custom_field_value.pick1
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    @org.hibernate.validator.constraints.Length(max=100, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("pick1")
    private String pick1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_custom_field_value.pick2
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    @org.hibernate.validator.constraints.Length(max=100, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("pick2")
    private String pick2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_custom_field_value.pick3
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    @org.hibernate.validator.constraints.Length(max=100, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("pick3")
    private String pick3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_custom_field_value.pick4
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    @org.hibernate.validator.constraints.Length(max=100, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("pick4")
    private String pick4;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_custom_field_value.pick5
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    @org.hibernate.validator.constraints.Length(max=100, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("pick5")
    private String pick5;

    private static final long serialVersionUID = 1;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_custom_field_value.id
     *
     * @return the value of m_form_custom_field_value.id
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_custom_field_value.id
     *
     * @param id the value for m_form_custom_field_value.id
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_custom_field_value.module
     *
     * @return the value of m_form_custom_field_value.module
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public String getModule() {
        return module;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_custom_field_value.module
     *
     * @param module the value for m_form_custom_field_value.module
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public void setModule(String module) {
        this.module = module;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_custom_field_value.typeid
     *
     * @return the value of m_form_custom_field_value.typeid
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public Integer getTypeid() {
        return typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_custom_field_value.typeid
     *
     * @param typeid the value for m_form_custom_field_value.typeid
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_custom_field_value.number1
     *
     * @return the value of m_form_custom_field_value.number1
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public Double getNumber1() {
        return number1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_custom_field_value.number1
     *
     * @param number1 the value for m_form_custom_field_value.number1
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public void setNumber1(Double number1) {
        this.number1 = number1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_custom_field_value.number2
     *
     * @return the value of m_form_custom_field_value.number2
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public Double getNumber2() {
        return number2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_custom_field_value.number2
     *
     * @param number2 the value for m_form_custom_field_value.number2
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public void setNumber2(Double number2) {
        this.number2 = number2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_custom_field_value.number3
     *
     * @return the value of m_form_custom_field_value.number3
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public Double getNumber3() {
        return number3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_custom_field_value.number3
     *
     * @param number3 the value for m_form_custom_field_value.number3
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public void setNumber3(Double number3) {
        this.number3 = number3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_custom_field_value.number4
     *
     * @return the value of m_form_custom_field_value.number4
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public Double getNumber4() {
        return number4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_custom_field_value.number4
     *
     * @param number4 the value for m_form_custom_field_value.number4
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public void setNumber4(Double number4) {
        this.number4 = number4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_custom_field_value.number5
     *
     * @return the value of m_form_custom_field_value.number5
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public Double getNumber5() {
        return number5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_custom_field_value.number5
     *
     * @param number5 the value for m_form_custom_field_value.number5
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public void setNumber5(Double number5) {
        this.number5 = number5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_custom_field_value.int1
     *
     * @return the value of m_form_custom_field_value.int1
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public Integer getInt1() {
        return int1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_custom_field_value.int1
     *
     * @param int1 the value for m_form_custom_field_value.int1
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public void setInt1(Integer int1) {
        this.int1 = int1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_custom_field_value.int2
     *
     * @return the value of m_form_custom_field_value.int2
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public Integer getInt2() {
        return int2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_custom_field_value.int2
     *
     * @param int2 the value for m_form_custom_field_value.int2
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public void setInt2(Integer int2) {
        this.int2 = int2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_custom_field_value.int3
     *
     * @return the value of m_form_custom_field_value.int3
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public Integer getInt3() {
        return int3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_custom_field_value.int3
     *
     * @param int3 the value for m_form_custom_field_value.int3
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public void setInt3(Integer int3) {
        this.int3 = int3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_custom_field_value.int4
     *
     * @return the value of m_form_custom_field_value.int4
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public Integer getInt4() {
        return int4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_custom_field_value.int4
     *
     * @param int4 the value for m_form_custom_field_value.int4
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public void setInt4(Integer int4) {
        this.int4 = int4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_custom_field_value.int5
     *
     * @return the value of m_form_custom_field_value.int5
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public Integer getInt5() {
        return int5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_custom_field_value.int5
     *
     * @param int5 the value for m_form_custom_field_value.int5
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public void setInt5(Integer int5) {
        this.int5 = int5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_custom_field_value.date1
     *
     * @return the value of m_form_custom_field_value.date1
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public Date getDate1() {
        return date1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_custom_field_value.date1
     *
     * @param date1 the value for m_form_custom_field_value.date1
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public void setDate1(Date date1) {
        this.date1 = date1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_custom_field_value.date2
     *
     * @return the value of m_form_custom_field_value.date2
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public Date getDate2() {
        return date2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_custom_field_value.date2
     *
     * @param date2 the value for m_form_custom_field_value.date2
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public void setDate2(Date date2) {
        this.date2 = date2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_custom_field_value.date3
     *
     * @return the value of m_form_custom_field_value.date3
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public Date getDate3() {
        return date3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_custom_field_value.date3
     *
     * @param date3 the value for m_form_custom_field_value.date3
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public void setDate3(Date date3) {
        this.date3 = date3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_custom_field_value.date4
     *
     * @return the value of m_form_custom_field_value.date4
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public Date getDate4() {
        return date4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_custom_field_value.date4
     *
     * @param date4 the value for m_form_custom_field_value.date4
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public void setDate4(Date date4) {
        this.date4 = date4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_custom_field_value.date5
     *
     * @return the value of m_form_custom_field_value.date5
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public Date getDate5() {
        return date5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_custom_field_value.date5
     *
     * @param date5 the value for m_form_custom_field_value.date5
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public void setDate5(Date date5) {
        this.date5 = date5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_custom_field_value.bool1
     *
     * @return the value of m_form_custom_field_value.bool1
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public Boolean getBool1() {
        return bool1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_custom_field_value.bool1
     *
     * @param bool1 the value for m_form_custom_field_value.bool1
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public void setBool1(Boolean bool1) {
        this.bool1 = bool1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_custom_field_value.bool2
     *
     * @return the value of m_form_custom_field_value.bool2
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public Boolean getBool2() {
        return bool2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_custom_field_value.bool2
     *
     * @param bool2 the value for m_form_custom_field_value.bool2
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public void setBool2(Boolean bool2) {
        this.bool2 = bool2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_custom_field_value.bool3
     *
     * @return the value of m_form_custom_field_value.bool3
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public Boolean getBool3() {
        return bool3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_custom_field_value.bool3
     *
     * @param bool3 the value for m_form_custom_field_value.bool3
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public void setBool3(Boolean bool3) {
        this.bool3 = bool3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_custom_field_value.bool4
     *
     * @return the value of m_form_custom_field_value.bool4
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public Boolean getBool4() {
        return bool4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_custom_field_value.bool4
     *
     * @param bool4 the value for m_form_custom_field_value.bool4
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public void setBool4(Boolean bool4) {
        this.bool4 = bool4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_custom_field_value.bool5
     *
     * @return the value of m_form_custom_field_value.bool5
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public Boolean getBool5() {
        return bool5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_custom_field_value.bool5
     *
     * @param bool5 the value for m_form_custom_field_value.bool5
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public void setBool5(Boolean bool5) {
        this.bool5 = bool5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_custom_field_value.pick1
     *
     * @return the value of m_form_custom_field_value.pick1
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public String getPick1() {
        return pick1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_custom_field_value.pick1
     *
     * @param pick1 the value for m_form_custom_field_value.pick1
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public void setPick1(String pick1) {
        this.pick1 = pick1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_custom_field_value.pick2
     *
     * @return the value of m_form_custom_field_value.pick2
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public String getPick2() {
        return pick2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_custom_field_value.pick2
     *
     * @param pick2 the value for m_form_custom_field_value.pick2
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public void setPick2(String pick2) {
        this.pick2 = pick2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_custom_field_value.pick3
     *
     * @return the value of m_form_custom_field_value.pick3
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public String getPick3() {
        return pick3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_custom_field_value.pick3
     *
     * @param pick3 the value for m_form_custom_field_value.pick3
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public void setPick3(String pick3) {
        this.pick3 = pick3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_custom_field_value.pick4
     *
     * @return the value of m_form_custom_field_value.pick4
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public String getPick4() {
        return pick4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_custom_field_value.pick4
     *
     * @param pick4 the value for m_form_custom_field_value.pick4
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public void setPick4(String pick4) {
        this.pick4 = pick4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_custom_field_value.pick5
     *
     * @return the value of m_form_custom_field_value.pick5
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public String getPick5() {
        return pick5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_custom_field_value.pick5
     *
     * @param pick5 the value for m_form_custom_field_value.pick5
     *
     * @mbggenerated Thu Nov 06 11:11:31 ICT 2014
     */
    public void setPick5(String pick5) {
        this.pick5 = pick5;
    }
}