package com.lzl.bean.javashop;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
/**
 * 角色表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:24
 */
public class SystemRoles implements Serializable{

    private static final long serialVersionUID = 1L;
    
    public static final int NORMAL = 1;
    
    public static final int DELETE = 2;
    
    /******************************************************************************/

    private java.lang.Integer id;

    /** 角色名称 */
    private java.lang.String rolesName;

    /** 角色描述 */
    private java.lang.String content;

    /** 创建人 */
    private java.lang.Integer userId;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm",timezone="GMT+8")
    private java.util.Date createTime;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm",timezone="GMT+8")
    private java.util.Date updateTime;

    /** 1、未删除2、删除 */
    private Integer status;

    /** 角色code,唯一 */
    private java.lang.String roleCode;


    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Integer getId() {
        return this.id;
    }
    public void setRolesName(java.lang.String rolesName) {
        this.rolesName = rolesName;
    }

    public java.lang.String getRolesName() {
        return this.rolesName;
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
    public void setRoleCode(java.lang.String roleCode) {
        this.roleCode = roleCode;
    }

    public java.lang.String getRoleCode() {
        return this.roleCode;
    }
	
	@Override
    public String toString() {
		return  "Id="  + id +";"+  "RolesName="  + rolesName +";"+  "Content="  + content +";"+  "UserId="  + userId +";"+  "CreateTime="  + createTime +";"+  "UpdateTime="  + updateTime +";"+  "Status="  + status +";"+  "RoleCode="  + roleCode ; 
    }
}