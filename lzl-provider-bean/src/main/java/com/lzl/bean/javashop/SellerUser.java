package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 商家用户表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:22
 */
public class SellerUser implements Serializable{

    private static final long serialVersionUID = 1L;

    private java.lang.Integer id;

    private java.lang.String name;

    private java.lang.String password;

    /** 员工号 */
    private java.lang.String code;

    /** 真实姓名 */
    private java.lang.String realName;

    /** 联系电话 */
    private java.lang.String phone;

    /** 职务 */
    private java.lang.String job;

    /** 所属商家 */
    private java.lang.Integer sellerId;

    /** 商家角色ID */
    private java.lang.Integer roleId;

    /** 状态 1-正常 2-冻结 3-删除 */
    private Integer state;

    /** 创建人 */
    private java.lang.Integer createId;

    /** 创建时间 */
    private java.util.Date createTime;

    /** 修改人 */
    private java.lang.Integer updateId;

    /** 更新时间（最后一次登陆时间） */
    private java.util.Date updateTime;

    /** 会员来源1、pc；2、H5；3、Android；4、IOS ;5、微信商城 */
    private Integer source;

    private java.lang.String sessionId;

    private java.lang.String pushId;


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
    public void setSellerId(java.lang.Integer sellerId) {
        this.sellerId = sellerId;
    }

    public java.lang.Integer getSellerId() {
        return this.sellerId;
    }
    public void setRoleId(java.lang.Integer roleId) {
        this.roleId = roleId;
    }

    public java.lang.Integer getRoleId() {
        return this.roleId;
    }
    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getState() {
        return this.state;
    }
    public void setCreateId(java.lang.Integer createId) {
        this.createId = createId;
    }

    public java.lang.Integer getCreateId() {
        return this.createId;
    }
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }
    public void setUpdateId(java.lang.Integer updateId) {
        this.updateId = updateId;
    }

    public java.lang.Integer getUpdateId() {
        return this.updateId;
    }
    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }
    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getSource() {
        return this.source;
    }
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }

    public java.lang.String getSessionId() {
        return this.sessionId;
    }
    public void setPushId(java.lang.String pushId) {
        this.pushId = pushId;
    }

    public java.lang.String getPushId() {
        return this.pushId;
    }
	
	@Override
    public String toString() {
		return  "Id="  + id +";"+  "Name="  + name +";"+  "Password="  + password +";"+  "Code="  + code +";"+  "RealName="  + realName +";"+  "Phone="  + phone +";"+  "Job="  + job +";"+  "SellerId="  + sellerId +";"+  "RoleId="  + roleId +";"+  "State="  + state +";"+  "CreateId="  + createId +";"+  "CreateTime="  + createTime +";"+  "UpdateId="  + updateId +";"+  "UpdateTime="  + updateTime +";"+  "Source="  + source +";"+  "SessionId="  + sessionId +";"+  "PushId="  + pushId ; 
    }
}