package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 会员登录日志
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:19
 */
public class MemberLoginLogs implements Serializable{

    private static final long serialVersionUID = 1L;

    private java.lang.Integer id;

    private java.lang.Integer memberId;

    private java.lang.String memberName;

    /** 登录IP */
    private java.lang.String loginIp;

    /** 登录时间 */
    private java.util.Date createTime;

    /** 会员来源1、pc；2、H5；3、Android；4、IOS ;5、微信商城 */
    private Integer source;


    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Integer getId() {
        return this.id;
    }
    public void setMemberId(java.lang.Integer memberId) {
        this.memberId = memberId;
    }

    public java.lang.Integer getMemberId() {
        return this.memberId;
    }
    public void setMemberName(java.lang.String memberName) {
        this.memberName = memberName;
    }

    public java.lang.String getMemberName() {
        return this.memberName;
    }
    public void setLoginIp(java.lang.String loginIp) {
        this.loginIp = loginIp;
    }

    public java.lang.String getLoginIp() {
        return this.loginIp;
    }
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }
    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getSource() {
        return this.source;
    }
	
	@Override
    public String toString() {
		return  "Id="  + id +";"+  "MemberId="  + memberId +";"+  "MemberName="  + memberName +";"+  "LoginIp="  + loginIp +";"+  "CreateTime="  + createTime +";"+  "Source="  + source ; 
    }
}