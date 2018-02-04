package com.lzl.bean.javashop;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
/**
 * 系统管理员表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:24
 */
public class SystemAdmin implements Serializable{

    private static final long serialVersionUID = 1L;
    
    public static final int DELETE = 3;
    
    /****************************************************************************/

    private java.lang.Integer id;

    /** 登录名 */
    private java.lang.String name;

    /** 密码 */
    private java.lang.String password;

    /** 角色id */
    private java.lang.Integer roleId;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm",timezone="GMT+8")
    private java.util.Date createTime;

    /** 创建人 只能是管理员 */
    private java.lang.Integer createUser;

    /** 电话 */
    private java.lang.String tel;

    /** 状态 1-正常 2-冻结 3-删除 */
    private Integer status;

    /****************************************************************************/
    /**用户资源路径*/
    private String urls;
    /**角色名称*/
    private String roleName;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getUrls() {
        return urls;
    }

    public void setUrls(String urls) {
        this.urls = urls;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Integer getId() {
        return this.id;
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
    public void setRoleId(java.lang.Integer roleId) {
        this.roleId = roleId;
    }

    public java.lang.Integer getRoleId() {
        return this.roleId;
    }
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }
    public void setCreateUser(java.lang.Integer createUser) {
        this.createUser = createUser;
    }

    public java.lang.Integer getCreateUser() {
        return this.createUser;
    }
    public void setTel(java.lang.String tel) {
        this.tel = tel;
    }

    public java.lang.String getTel() {
        return this.tel;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return this.status;
    }
	
	@Override
    public String toString() {
		return  "Id="  + id +";"+  "Name="  + name +";"+  "Password="  + password +";"+  "RoleId="  + roleId +";"+  "CreateTime="  + createTime +";"+  "CreateUser="  + createUser +";"+  "Tel="  + tel +";"+  "Status="  + status +";"+  "Urls="  + urls ; 
    }
}