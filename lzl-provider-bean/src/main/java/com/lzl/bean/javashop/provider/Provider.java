package com.lzl.bean.javashop.provider;

import java.io.Serializable;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:03
 */
public class Provider implements Serializable{

    private static final long serialVersionUID = 1L;

    /** 编码 */
    private java.lang.Integer providerId;

    /** 供应商名称 */
    private java.lang.String providerName;

    /** 供应商所属单位类型 */
    private java.lang.Integer providerTypeId;

    /** 地区ID（省、市、区） */
    private java.lang.String locationId;

    /** 联系人 */
    private java.lang.String linkman;

    /** 电话 */
    private java.lang.String telephone;

    /** 税号 */
    private java.lang.Integer taxRateId;

    /** 供应商详细地址 */
    private java.lang.String address;

    /** 邮编 */
    private java.lang.String postCode;

    /** 电子邮件 */
    private java.lang.String email;

    /** 微信 */
    private java.lang.String wechat;

    /** 营业执照 */
    private java.lang.String businessLicence;

    /** 备注 */
    private java.lang.String remark;

    /** 申请日期 */
    private java.util.Date applyDate;

    /** 创建时间 */
    private java.util.Date createTime;

    /** 最后一次修改时间 */
    private java.util.Date modifyTime;


    public void setProviderId(java.lang.Integer providerId) {
        this.providerId = providerId;
    }

    public java.lang.Integer getProviderId() {
        return this.providerId;
    }
    public void setProviderName(java.lang.String providerName) {
        this.providerName = providerName;
    }

    public java.lang.String getProviderName() {
        return this.providerName;
    }
    public void setProviderTypeId(java.lang.Integer providerTypeId) {
        this.providerTypeId = providerTypeId;
    }

    public java.lang.Integer getProviderTypeId() {
        return this.providerTypeId;
    }
    public void setLocationId(java.lang.String locationId) {
        this.locationId = locationId;
    }

    public java.lang.String getLocationId() {
        return this.locationId;
    }
    public void setLinkman(java.lang.String linkman) {
        this.linkman = linkman;
    }

    public java.lang.String getLinkman() {
        return this.linkman;
    }
    public void setTelephone(java.lang.String telephone) {
        this.telephone = telephone;
    }

    public java.lang.String getTelephone() {
        return this.telephone;
    }
    public void setTaxRateId(java.lang.Integer taxRateId) {
        this.taxRateId = taxRateId;
    }

    public java.lang.Integer getTaxRateId() {
        return this.taxRateId;
    }
    public void setAddress(java.lang.String address) {
        this.address = address;
    }

    public java.lang.String getAddress() {
        return this.address;
    }
    public void setPostCode(java.lang.String postCode) {
        this.postCode = postCode;
    }

    public java.lang.String getPostCode() {
        return this.postCode;
    }
    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    public java.lang.String getEmail() {
        return this.email;
    }
    public void setWechat(java.lang.String wechat) {
        this.wechat = wechat;
    }

    public java.lang.String getWechat() {
        return this.wechat;
    }
    public void setBusinessLicence(java.lang.String businessLicence) {
        this.businessLicence = businessLicence;
    }

    public java.lang.String getBusinessLicence() {
        return this.businessLicence;
    }
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    public java.lang.String getRemark() {
        return this.remark;
    }
    public void setApplyDate(java.util.Date applyDate) {
        this.applyDate = applyDate;
    }

    public java.util.Date getApplyDate() {
        return this.applyDate;
    }
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }
    public void setModifyTime(java.util.Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public java.util.Date getModifyTime() {
        return this.modifyTime;
    }
	
	@Override
    public String toString() {
		return  "ProviderId="  + providerId +";"+  "ProviderName="  + providerName +";"+  "ProviderTypeId="  + providerTypeId +";"+  "LocationId="  + locationId +";"+  "Linkman="  + linkman +";"+  "Telephone="  + telephone +";"+  "TaxRateId="  + taxRateId +";"+  "Address="  + address +";"+  "PostCode="  + postCode +";"+  "Email="  + email +";"+  "Wechat="  + wechat +";"+  "BusinessLicence="  + businessLicence +";"+  "Remark="  + remark +";"+  "ApplyDate="  + applyDate +";"+  "CreateTime="  + createTime +";"+  "ModifyTime="  + modifyTime ; 
    }
}