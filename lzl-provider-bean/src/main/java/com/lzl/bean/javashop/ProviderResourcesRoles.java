package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:04
 */
public class ProviderResourcesRoles implements Serializable{

    private static final long serialVersionUID = 1L;

    /** 编码 */
    private java.lang.Integer id;

    /**  资源ID */
    private java.lang.Integer systemResourcesId;

    /** 角色ID */
    private java.lang.Integer providerRolesId;

    /** 创建时间 */
    private java.util.Date createTime;

    /** 最后一次修改时间 */
    private java.util.Date modifyTime;


    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Integer getId() {
        return this.id;
    }
    public void setSystemResourcesId(java.lang.Integer systemResourcesId) {
        this.systemResourcesId = systemResourcesId;
    }

    public java.lang.Integer getSystemResourcesId() {
        return this.systemResourcesId;
    }
    public void setProviderRolesId(java.lang.Integer providerRolesId) {
        this.providerRolesId = providerRolesId;
    }

    public java.lang.Integer getProviderRolesId() {
        return this.providerRolesId;
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
		return  "Id="  + id +";"+  "SystemResourcesId="  + systemResourcesId +";"+  "ProviderRolesId="  + providerRolesId +";"+  "CreateTime="  + createTime +";"+  "ModifyTime="  + modifyTime ; 
    }
}