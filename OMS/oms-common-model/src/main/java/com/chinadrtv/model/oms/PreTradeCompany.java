package com.chinadrtv.model.oms;

import java.math.BigDecimal;

public class PreTradeCompany {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACOAPP_OMS.PRE_TRADE_COMPANY.ID
     *
     * @mbggenerated Wed Oct 30 13:54:38 CST 2013
     */
    private BigDecimal id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACOAPP_OMS.PRE_TRADE_COMPANY.TRADE_TYPE
     *
     * @mbggenerated Wed Oct 30 13:54:38 CST 2013
     */
    private String tradeType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACOAPP_OMS.PRE_TRADE_COMPANY.COMPANY_ID
     *
     * @mbggenerated Wed Oct 30 13:54:38 CST 2013
     */
    private BigDecimal companyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACOAPP_OMS.PRE_TRADE_COMPANY.COMPANY_NAME
     *
     * @mbggenerated Wed Oct 30 13:54:38 CST 2013
     */
    private String companyName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACOAPP_OMS.PRE_TRADE_COMPANY.COMPANY_ALIAS
     *
     * @mbggenerated Wed Oct 30 13:54:38 CST 2013
     */
    private String companyAlias;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACOAPP_OMS.PRE_TRADE_COMPANY.SOURCE_ID
     *
     * @mbggenerated Wed Oct 30 13:54:38 CST 2013
     */
    private Long sourceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACOAPP_OMS.PRE_TRADE_COMPANY.REMARK
     *
     * @mbggenerated Wed Oct 30 13:54:38 CST 2013
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACOAPP_OMS.PRE_TRADE_COMPANY.ISTRANSLATED
     *
     * @mbggenerated Wed Oct 30 13:54:38 CST 2013
     */
    private Short istranslated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACOAPP_OMS.PRE_TRADE_COMPANY.PAYTYPE
     *
     * @mbggenerated Wed Oct 30 13:54:38 CST 2013
     */
    private String paytype;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACOAPP_OMS.PRE_TRADE_COMPANY.ID
     *
     * @return the value of ACOAPP_OMS.PRE_TRADE_COMPANY.ID
     *
     * @mbggenerated Wed Oct 30 13:54:38 CST 2013
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACOAPP_OMS.PRE_TRADE_COMPANY.ID
     *
     * @param id the value for ACOAPP_OMS.PRE_TRADE_COMPANY.ID
     *
     * @mbggenerated Wed Oct 30 13:54:38 CST 2013
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACOAPP_OMS.PRE_TRADE_COMPANY.TRADE_TYPE
     *
     * @return the value of ACOAPP_OMS.PRE_TRADE_COMPANY.TRADE_TYPE
     *
     * @mbggenerated Wed Oct 30 13:54:38 CST 2013
     */
    public String getTradeType() {
        return tradeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACOAPP_OMS.PRE_TRADE_COMPANY.TRADE_TYPE
     *
     * @param tradeType the value for ACOAPP_OMS.PRE_TRADE_COMPANY.TRADE_TYPE
     *
     * @mbggenerated Wed Oct 30 13:54:38 CST 2013
     */
    public void setTradeType(String tradeType) {
        this.tradeType = tradeType == null ? null : tradeType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACOAPP_OMS.PRE_TRADE_COMPANY.COMPANY_ID
     *
     * @return the value of ACOAPP_OMS.PRE_TRADE_COMPANY.COMPANY_ID
     *
     * @mbggenerated Wed Oct 30 13:54:38 CST 2013
     */
    public BigDecimal getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACOAPP_OMS.PRE_TRADE_COMPANY.COMPANY_ID
     *
     * @param companyId the value for ACOAPP_OMS.PRE_TRADE_COMPANY.COMPANY_ID
     *
     * @mbggenerated Wed Oct 30 13:54:38 CST 2013
     */
    public void setCompanyId(BigDecimal companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACOAPP_OMS.PRE_TRADE_COMPANY.COMPANY_NAME
     *
     * @return the value of ACOAPP_OMS.PRE_TRADE_COMPANY.COMPANY_NAME
     *
     * @mbggenerated Wed Oct 30 13:54:38 CST 2013
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACOAPP_OMS.PRE_TRADE_COMPANY.COMPANY_NAME
     *
     * @param companyName the value for ACOAPP_OMS.PRE_TRADE_COMPANY.COMPANY_NAME
     *
     * @mbggenerated Wed Oct 30 13:54:38 CST 2013
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACOAPP_OMS.PRE_TRADE_COMPANY.COMPANY_ALIAS
     *
     * @return the value of ACOAPP_OMS.PRE_TRADE_COMPANY.COMPANY_ALIAS
     *
     * @mbggenerated Wed Oct 30 13:54:38 CST 2013
     */
    public String getCompanyAlias() {
        return companyAlias;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACOAPP_OMS.PRE_TRADE_COMPANY.COMPANY_ALIAS
     *
     * @param companyAlias the value for ACOAPP_OMS.PRE_TRADE_COMPANY.COMPANY_ALIAS
     *
     * @mbggenerated Wed Oct 30 13:54:38 CST 2013
     */
    public void setCompanyAlias(String companyAlias) {
        this.companyAlias = companyAlias == null ? null : companyAlias.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACOAPP_OMS.PRE_TRADE_COMPANY.SOURCE_ID
     *
     * @return the value of ACOAPP_OMS.PRE_TRADE_COMPANY.SOURCE_ID
     *
     * @mbggenerated Wed Oct 30 13:54:38 CST 2013
     */
    public Long getSourceId() {
        return sourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACOAPP_OMS.PRE_TRADE_COMPANY.SOURCE_ID
     *
     * @param sourceId the value for ACOAPP_OMS.PRE_TRADE_COMPANY.SOURCE_ID
     *
     * @mbggenerated Wed Oct 30 13:54:38 CST 2013
     */
    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACOAPP_OMS.PRE_TRADE_COMPANY.REMARK
     *
     * @return the value of ACOAPP_OMS.PRE_TRADE_COMPANY.REMARK
     *
     * @mbggenerated Wed Oct 30 13:54:38 CST 2013
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACOAPP_OMS.PRE_TRADE_COMPANY.REMARK
     *
     * @param remark the value for ACOAPP_OMS.PRE_TRADE_COMPANY.REMARK
     *
     * @mbggenerated Wed Oct 30 13:54:38 CST 2013
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACOAPP_OMS.PRE_TRADE_COMPANY.ISTRANSLATED
     *
     * @return the value of ACOAPP_OMS.PRE_TRADE_COMPANY.ISTRANSLATED
     *
     * @mbggenerated Wed Oct 30 13:54:38 CST 2013
     */
    public Short getIstranslated() {
        return istranslated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACOAPP_OMS.PRE_TRADE_COMPANY.ISTRANSLATED
     *
     * @param istranslated the value for ACOAPP_OMS.PRE_TRADE_COMPANY.ISTRANSLATED
     *
     * @mbggenerated Wed Oct 30 13:54:38 CST 2013
     */
    public void setIstranslated(Short istranslated) {
        this.istranslated = istranslated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACOAPP_OMS.PRE_TRADE_COMPANY.PAYTYPE
     *
     * @return the value of ACOAPP_OMS.PRE_TRADE_COMPANY.PAYTYPE
     *
     * @mbggenerated Wed Oct 30 13:54:38 CST 2013
     */
    public String getPaytype() {
        return paytype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACOAPP_OMS.PRE_TRADE_COMPANY.PAYTYPE
     *
     * @param paytype the value for ACOAPP_OMS.PRE_TRADE_COMPANY.PAYTYPE
     *
     * @mbggenerated Wed Oct 30 13:54:38 CST 2013
     */
    public void setPaytype(String paytype) {
        this.paytype = paytype == null ? null : paytype.trim();
    }
}