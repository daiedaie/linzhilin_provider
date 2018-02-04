package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:04
 */
public class ProviderRoles implements Serializable{

    private static final long serialVersionUID = 1L;

    /** 角色ID（在系统角色资源表中为supplier_roles_id） */
    private java.lang.Integer providerRolesId;

    /** 商家ID */
    private java.lang.Integer providerId;

    /** 角色名称 */
    private java.lang.String providerRolesName;

    /** 角色code,唯一 */
    private java.lang.String providerRolesCode;

    /** 角色描述 */
    private java.lang.String content;

    /** 1、未删除2、删除 */
    private Integer status;

    /** 创建人（system_admin中的系统用户） */
    private java.lang.Integer createUserId;

    /** 创建时间 */
    private java.util.Date createTime;

    /** 修改人（system_admin中的系统用户） */
    private java.lang.Integer updateUserId;

    /** 修改时间 */
    private java.util.Date updateTime;

    /** 最后一次编辑时间 */
    private java.util.Date modifyTime;


    public void setProviderRolesId(java.lang.Integer providerRolesId) {
        this.providerRolesId = providerRolesId;
    }

    public java.lang.Integer getProviderRolesId() {
        return this.providerRolesId;
    }
    public void setProviderId(java.lang.Integer providerId) {
        this.providerId = providerId;
    }

    public java.lang.Integer getProviderId() {
        return this.providerId;
    }
    public void setProviderRolesName(java.lang.String providerRolesName) {
        this.providerRolesName = providerRolesName;
    }

    public java.lang.String getProviderRolesName() {
        return this.providerRolesName;
    }
    public void setProviderRolesCode(java.lang.String providerRolesCode) {
        this.providerRolesCode = providerRolesCode;
    }

    public java.lang.String getProviderRolesCode() {
        return this.providerRolesCode;
    }
    public void setContent(java.lang.String content) {
        this.content = content;
    }

    public java.lang.String getContent() {
        return this.content;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return this.status;
    }
    public void setCreateUserId(java.lang.Integer createUserId) {
        this.createUserId = createUserId;
    }

    public java.lang.Integer getCreateUserId() {
        return this.createUserId;
    }
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }
    public void setUpdateUserId(java.lang.Integer updateUserId) {
        this.updateUserId = updateUserId;
    }

    public java.lang.Integer getUpdateUserId() {
        return this.updateUserId;
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
		return  "ProviderRolesId="  + providerRolesId +";"+  "ProviderId="  + providerId +";"+  "ProviderRolesName="  + providerRolesName +";"+  "ProviderRolesCode="  + providerRolesCode +";"+  "Content="  + content +";"+  "Status="  + status +";"+  "CreateUserId="  + createUserId +";"+  "CreateTime="  + createTime +";"+  "UpdateUserId="  + updateUserId +";"+  "UpdateTime="  + updateTime +";"+  "ModifyTime="  + modifyTime ; 
    }
}