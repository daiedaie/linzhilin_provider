package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 商家角色表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:22
 */
public class SellerRoles implements Serializable{

    private static final long serialVersionUID = 1L;

    private java.lang.Integer id;

    /** 商家ID */
    private java.lang.Integer sellerId;

    /** 角色名称 */
    private java.lang.String rolesName;

    /** 角色code,唯一 */
    private java.lang.String roleCode;

    /** 角色描述 */
    private java.lang.String content;

    /** 创建人 */
    private java.lang.Integer userId;

    private java.util.Date createTime;

    private java.util.Date updateTime;

    /** 1、未删除2、删除 */
    private Integer status;


    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Integer getId() {
        return this.id;
    }
    public void setSellerId(java.lang.Integer sellerId) {
        this.sellerId = sellerId;
    }

    public java.lang.Integer getSellerId() {
        return this.sellerId;
    }
    public void setRolesName(java.lang.String rolesName) {
        this.rolesName = rolesName;
    }

    public java.lang.String getRolesName() {
        return this.rolesName;
    }
    public void setRoleCode(java.lang.String roleCode) {
        this.roleCode = roleCode;
    }

    public java.lang.String getRoleCode() {
        return this.roleCode;
    }
    public void setContent(java.lang.String content) {
        this.content = content;
    }

    public java.lang.String getContent() {
        return this.content;
    }
    public void setUserId(java.lang.Integer userId) {
        this.userId = userId;
    }

    public java.lang.Integer getUserId() {
        return this.userId;
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
    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return this.status;
    }
	
	@Override
    public String toString() {
		return  "Id="  + id +";"+  "SellerId="  + sellerId +";"+  "RolesName="  + rolesName +";"+  "RoleCode="  + roleCode +";"+  "Content="  + content +";"+  "UserId="  + userId +";"+  "CreateTime="  + createTime +";"+  "UpdateTime="  + updateTime +";"+  "Status="  + status ; 
    }
}