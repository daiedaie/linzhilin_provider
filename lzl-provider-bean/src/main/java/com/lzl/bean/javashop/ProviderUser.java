package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:04
 */
public class ProviderUser implements Serializable{

    private static final long serialVersionUID = 1L;

    /** 操作员ID */
    private java.lang.Integer userId;

    /** 操作员名称 */
    private java.lang.String username;

    /** 密码 */
    private java.lang.String password;

    /** 确认密码 */
    private java.lang.String pwdConfirm;

    /** 员工号 */
    private java.lang.String code;

    /** 真实姓名 */
    private java.lang.String realName;

    /** 联系电话 */
    private java.lang.String phone;

    /** 职务 */
    private java.lang.String job;

    /** 所属供应商 */
    private java.lang.Integer providerId;

    /** 所拥有的角色ID */
    private java.lang.Integer providerRolesId;

    /** 状态 1-正常 2-冻结 3-删除 */
    private Integer state;

    /** 创建人（system_admin中的系统用户） */
    private java.lang.Integer createAdminId;

    /** 创建时间 */
    private java.util.Date createTime;

    /** 修改人（system_admin中的系统用户） */
    private java.lang.Integer updateAdminId;

    /** 修改时间（最后一次登陆时间） */
    private java.util.Date updateTime;

    /** 最后一次编辑时间 */
    private java.util.Date modifyTime;

    /****************************************************************************/
    /**用户资源路径*/
    private String urls;

    
    public String getUrls() {
		return urls;
	}

	public void setUrls(String urls) {
		this.urls = urls;
	}

    public void setUserId(java.lang.Integer userId) {
        this.userId = userId;
    }

    public java.lang.Integer getUserId() {
        return this.userId;
    }
    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    public java.lang.String getUsername() {
        return this.username;
    }
    public void setPassword(java.lang.String password) {
        this.password = password;
    }

    public java.lang.String getPassword() {
        return this.password;
    }
    public void setPwdConfirm(java.lang.String pwdConfirm) {
        this.pwdConfirm = pwdConfirm;
    }

    public java.lang.String getPwdConfirm() {
        return this.pwdConfirm;
    }
    public void setCode(java.lang.String code) {
        this.code = code;
    }

    public java.lang.String getCode() {
        return this.code;
    }
    public void setRealName(java.lang.String realName) {
        this.realName = realName;
    }

    public java.lang.String getRealName() {
        return this.realName;
    }
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }

    public java.lang.String getPhone() {
        return this.phone;
    }
    public void setJob(java.lang.String job) {
        this.job = job;
    }

    public java.lang.String getJob() {
        return this.job;
    }
    public void setProviderId(java.lang.Integer providerId) {
        this.providerId = providerId;
    }

    public java.lang.Integer getProviderId() {
        return this.providerId;
    }
    public void setProviderRolesId(java.lang.Integer providerRolesId) {
        this.providerRolesId = providerRolesId;
    }

    public java.lang.Integer getProviderRolesId() {
        return this.providerRolesId;
    }
    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getState() {
        return this.state;
    }
    public void setCreateAdminId(java.lang.Integer createAdminId) {
        this.createAdminId = createAdminId;
    }

    public java.lang.Integer getCreateAdminId() {
        return this.createAdminId;
    }
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }
    public void setUpdateAdminId(java.lang.Integer updateAdminId) {
        this.updateAdminId = updateAdminId;
    }

    public java.lang.Integer getUpdateAdminId() {
        return this.updateAdminId;
    }
    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }
    public void setModifyTime(java.util.Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public java.util.Date getModifyTime() {
        return this.modifyTime;
    }
	
	@Override
    public String toString() {
		return  "UserId="  + userId +";"+  "Username="  + username +";"+  "Password="  + password +";"+  "PwdConfirm="  + pwdConfirm +";"+  "Code="  + code +";"+  "RealName="  + realName +";"+  "Phone="  + phone +";"+  "Job="  + job +";"+  "ProviderId="  + providerId +";"+  "ProviderRolesId="  + providerRolesId +";"+  "State="  + state +";"+  "CreateAdminId="  + createAdminId +";"+  "CreateTime="  + createTime +";"+  "UpdateAdminId="  + updateAdminId +";"+  "UpdateTime="  + updateTime +";"+  "ModifyTime="  + modifyTime ; 
    }
}