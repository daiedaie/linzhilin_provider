package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 供应商角色资源对应表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:23
 */
public class SupplierResourcesRoles implements Serializable{

    private static final long serialVersionUID = 1L;

    private java.lang.Integer id;

    private java.lang.Integer resourcesId;

    private java.lang.Integer supplierRolesId;

    private java.util.Date createTime;


    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Integer getId() {
        return this.id;
    }
    public void setResourcesId(java.lang.Integer resourcesId) {
        this.resourcesId = resourcesId;
    }

    public java.lang.Integer getResourcesId() {
        return this.resourcesId;
    }
    public void setSupplierRolesId(java.lang.Integer supplierRolesId) {
        this.supplierRolesId = supplierRolesId;
    }

    public java.lang.Integer getSupplierRolesId() {
        return this.supplierRolesId;
    }
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }
	
	@Override
    public String toString() {
		return  "Id="  + id +";"+  "ResourcesId="  + resourcesId +";"+  "SupplierRolesId="  + supplierRolesId +";"+  "CreateTime="  + createTime ; 
    }
}