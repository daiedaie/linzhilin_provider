package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 商家角色资源对应表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:21
 */
public class SellerResourcesRoles implements Serializable{

    private static final long serialVersionUID = 1L;

    private java.lang.Integer id;

    private java.lang.Integer resourcesId;

    private java.lang.Integer sellerRolesId;

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
    public void setSellerRolesId(java.lang.Integer sellerRolesId) {
        this.sellerRolesId = sellerRolesId;
    }

    public java.lang.Integer getSellerRolesId() {
        return this.sellerRolesId;
    }
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }
	
	@Override
    public String toString() {
		return  "Id="  + id +";"+  "ResourcesId="  + resourcesId +";"+  "SellerRolesId="  + sellerRolesId +";"+  "CreateTime="  + createTime ; 
    }
}