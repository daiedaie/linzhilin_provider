package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 商家申请表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:21
 */
public class SellerApply implements Serializable{

    private static final long serialVersionUID = 1L;

    private java.lang.Integer id;

    /** 用户id */
    private java.lang.Integer userId;

    /** 用户名 */
    private java.lang.String name;

    /** 密码 */
    private java.lang.String password;

    /** 公司名称 */
    private java.lang.String company;

    /** 描述 */
    private java.lang.String description;

    /** 营业执照注册号 */
    private java.lang.String bussinessLicense;

    /** 税务登记号 */
    private java.lang.String taxLicense;

    /** 企业注册省 */
    private java.lang.String companyProvince;

    /** 企业注册市 */
    private java.lang.String companyCity;

    /** 所在地区 */
    private java.lang.String companyArea;

    /** 乡镇街道 */
    private java.lang.String companyTown;

    /** 坐标经度 */
    private java.lang.String longitude;

    /** 坐标纬度 */
    private java.lang.String latitude;

    /** 营业开始日期 */
    private java.util.Date companyStartTime;

    /** 营业结束日期 */
    private java.util.Date companyEndTime;

    /** 常用地址 */
    private java.lang.String companyAdd;

    /** 联系电话 */
    private java.lang.String telephone;

    /** 传真 */
    private java.lang.String fax;

    /** 营业执照扫描件 */
    private java.lang.String bussinessLicenseImage;

    /** 商家logo中间传递字段 */
    private java.lang.String organization;

    /** 开户行账户名称 */
    private java.lang.String bankUser;

    /** 开户行 */
    private java.lang.String bankName;

    /** 开户行支行名称 */
    private java.lang.String bankNameBranch;

    /** 开户行支行联行号 */
    private java.lang.String brandNameCode;

    /** 银行账号 */
    private java.lang.String bankCode;

    /** 开户行省 */
    private java.lang.String bankProvince;

    /** 开户行市 */
    private java.lang.String bankCity;

    private java.lang.String bankPic;

    /** 法定代表人 */
    private java.lang.String legalPerson;

    /** 法定代表人身份证 */
    private java.lang.String legalPersonCard;

    /** 身份证正面扫描件 */
    private java.lang.String idcardPic;

    /** 手机 */
    private java.lang.String personPhone;

    /** email */
    private java.lang.String email;

    /** 1、提交申请；2、审核通过；3、缴纳保证金；4、审核失败 */
    private Integer state;

    /** 1、平台自营；2、商家入驻 */
    private Integer type;

    /** 审核人ID */
    private java.lang.Integer optId;

    /** 是否有冷藏设备 */
    private Integer hasRefrigerater;

    /** 保证金额度 */
    private java.lang.Integer bond;

    /** 市场合伙人邀请码 */
    private java.lang.String inviteCode;

    /** 创建时间 */
    private java.util.Date createTime;

    /** 更新时间 */
    private java.util.Date updateTime;


    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Integer getId() {
        return this.id;
    }
    public void setUserId(java.lang.Integer userId) {
        this.userId = userId;
    }

    public java.lang.Integer getUserId() {
        return this.userId;
    }
    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getName() {
        return this.name;
    }
    public void setPassword(java.lang.String password) {
        this.password = password;
    }

    public java.lang.String getPassword() {
        return this.password;
    }
    public void setCompany(java.lang.String company) {
        this.company = company;
    }

    public java.lang.String getCompany() {
        return this.company;
    }
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    public java.lang.String getDescription() {
        return this.description;
    }
    public void setBussinessLicense(java.lang.String bussinessLicense) {
        this.bussinessLicense = bussinessLicense;
    }

    public java.lang.String getBussinessLicense() {
        return this.bussinessLicense;
    }
    public void setTaxLicense(java.lang.String taxLicense) {
        this.taxLicense = taxLicense;
    }

    public java.lang.String getTaxLicense() {
        return this.taxLicense;
    }
    public void setCompanyProvince(java.lang.String companyProvince) {
        this.companyProvince = companyProvince;
    }

    public java.lang.String getCompanyProvince() {
        return this.companyProvince;
    }
    public void setCompanyCity(java.lang.String companyCity) {
        this.companyCity = companyCity;
    }

    public java.lang.String getCompanyCity() {
        return this.companyCity;
    }
    public void setCompanyArea(java.lang.String companyArea) {
        this.companyArea = companyArea;
    }

    public java.lang.String getCompanyArea() {
        return this.companyArea;
    }
    public void setCompanyTown(java.lang.String companyTown) {
        this.companyTown = companyTown;
    }

    public java.lang.String getCompanyTown() {
        return this.companyTown;
    }
    public void setLongitude(java.lang.String longitude) {
        this.longitude = longitude;
    }

    public java.lang.String getLongitude() {
        return this.longitude;
    }
    public void setLatitude(java.lang.String latitude) {
        this.latitude = latitude;
    }

    public java.lang.String getLatitude() {
        return this.latitude;
    }
    public void setCompanyStartTime(java.util.Date companyStartTime) {
        this.companyStartTime = companyStartTime;
    }

    public java.util.Date getCompanyStartTime() {
        return this.companyStartTime;
    }
    public void setCompanyEndTime(java.util.Date companyEndTime) {
        this.companyEndTime = companyEndTime;
    }

    public java.util.Date getCompanyEndTime() {
        return this.companyEndTime;
    }
    public void setCompanyAdd(java.lang.String companyAdd) {
        this.companyAdd = companyAdd;
    }

    public java.lang.String getCompanyAdd() {
        return this.companyAdd;
    }
    public void setTelephone(java.lang.String telephone) {
        this.telephone = telephone;
    }

    public java.lang.String getTelephone() {
        return this.telephone;
    }
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }

    public java.lang.String getFax() {
        return this.fax;
    }
    public void setBussinessLicenseImage(java.lang.String bussinessLicenseImage) {
        this.bussinessLicenseImage = bussinessLicenseImage;
    }

    public java.lang.String getBussinessLicenseImage() {
        return this.bussinessLicenseImage;
    }
    public void setOrganization(java.lang.String organization) {
        this.organization = organization;
    }

    public java.lang.String getOrganization() {
        return this.organization;
    }
    public void setBankUser(java.lang.String bankUser) {
        this.bankUser = bankUser;
    }

    public java.lang.String getBankUser() {
        return this.bankUser;
    }
    public void setBankName(java.lang.String bankName) {
        this.bankName = bankName;
    }

    public java.lang.String getBankName() {
        return this.bankName;
    }
    public void setBankNameBranch(java.lang.String bankNameBranch) {
        this.bankNameBranch = bankNameBranch;
    }

    public java.lang.String getBankNameBranch() {
        return this.bankNameBranch;
    }
    public void setBrandNameCode(java.lang.String brandNameCode) {
        this.brandNameCode = brandNameCode;
    }

    public java.lang.String getBrandNameCode() {
        return this.brandNameCode;
    }
    public void setBankCode(java.lang.String bankCode) {
        this.bankCode = bankCode;
    }

    public java.lang.String getBankCode() {
        return this.bankCode;
    }
    public void setBankProvince(java.lang.String bankProvince) {
        this.bankProvince = bankProvince;
    }

    public java.lang.String getBankProvince() {
        return this.bankProvince;
    }
    public void setBankCity(java.lang.String bankCity) {
        this.bankCity = bankCity;
    }

    public java.lang.String getBankCity() {
        return this.bankCity;
    }
    public void setBankPic(java.lang.String bankPic) {
        this.bankPic = bankPic;
    }

    public java.lang.String getBankPic() {
        return this.bankPic;
    }
    public void setLegalPerson(java.lang.String legalPerson) {
        this.legalPerson = legalPerson;
    }

    public java.lang.String getLegalPerson() {
        return this.legalPerson;
    }
    public void setLegalPersonCard(java.lang.String legalPersonCard) {
        this.legalPersonCard = legalPersonCard;
    }

    public java.lang.String getLegalPersonCard() {
        return this.legalPersonCard;
    }
    public void setIdcardPic(java.lang.String idcardPic) {
        this.idcardPic = idcardPic;
    }

    public java.lang.String getIdcardPic() {
        return this.idcardPic;
    }
    public void setPersonPhone(java.lang.String personPhone) {
        this.personPhone = personPhone;
    }

    public java.lang.String getPersonPhone() {
        return this.personPhone;
    }
    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    public java.lang.String getEmail() {
        return this.email;
    }
    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getState() {
        return this.state;
    }
    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return this.type;
    }
    public void setOptId(java.lang.Integer optId) {
        this.optId = optId;
    }

    public java.lang.Integer getOptId() {
        return this.optId;
    }
    public void setHasRefrigerater(Integer hasRefrigerater) {
        this.hasRefrigerater = hasRefrigerater;
    }

    public Integer getHasRefrigerater() {
        return this.hasRefrigerater;
    }
    public void setBond(java.lang.Integer bond) {
        this.bond = bond;
    }

    public java.lang.Integer getBond() {
        return this.bond;
    }
    public void setInviteCode(java.lang.String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public java.lang.String getInviteCode() {
        return this.inviteCode;
    }
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }
    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }
	
	@Override
    public String toString() {
		return  "Id="  + id +";"+  "UserId="  + userId +";"+  "Name="  + name +";"+  "Password="  + password +";"+  "Company="  + company +";"+  "Description="  + description +";"+  "BussinessLicense="  + bussinessLicense +";"+  "TaxLicense="  + taxLicense +";"+  "CompanyProvince="  + companyProvince +";"+  "CompanyCity="  + companyCity +";"+  "CompanyArea="  + companyArea +";"+  "CompanyTown="  + companyTown +";"+  "Longitude="  + longitude +";"+  "Latitude="  + latitude +";"+  "CompanyStartTime="  + companyStartTime +";"+  "CompanyEndTime="  + companyEndTime +";"+  "CompanyAdd="  + companyAdd +";"+  "Telephone="  + telephone +";"+  "Fax="  + fax +";"+  "BussinessLicenseImage="  + bussinessLicenseImage +";"+  "Organization="  + organization +";"+  "BankUser="  + bankUser +";"+  "BankName="  + bankName +";"+  "BankNameBranch="  + bankNameBranch +";"+  "BrandNameCode="  + brandNameCode +";"+  "BankCode="  + bankCode +";"+  "BankProvince="  + bankProvince +";"+  "BankCity="  + bankCity +";"+  "BankPic="  + bankPic +";"+  "LegalPerson="  + legalPerson +";"+  "LegalPersonCard="  + legalPersonCard +";"+  "IdcardPic="  + idcardPic +";"+  "PersonPhone="  + personPhone +";"+  "Email="  + email +";"+  "State="  + state +";"+  "Type="  + type +";"+  "OptId="  + optId +";"+  "HasRefrigerater="  + hasRefrigerater +";"+  "Bond="  + bond +";"+  "InviteCode="  + inviteCode +";"+  "CreateTime="  + createTime +";"+  "UpdateTime="  + updateTime ; 
    }
}