package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 会员
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:18
 */
public class Member implements Serializable{

    private static final long serialVersionUID = 1L;

    private java.lang.Integer id;

    /** 用户名 */
    private java.lang.String name;

    /** 密码 */
    private java.lang.String password;

    /** 会员等级 */
    private java.lang.Integer grade;

    /** 会员经验值 */
    private java.lang.Integer gradeValue;

    /** 会员积分 */
    private java.lang.Integer integral;

    /** 注册时间 */
    private java.util.Date registerTime;

    /** 最后登录时间 */
    private java.util.Date lastLoginTime;

    /** 最后登录IP */
    private java.lang.String lastLoginIp;

    /** 登陆次数 */
    private java.lang.Integer loginNumber;

    /** 上次使用的地址 */
    private java.lang.Integer lastAddressId;

    /** 上次使用的支付方式 */
    private java.lang.Integer lastPaymentCode;

    /** 性别0、保密；1、男；2、女 */
    private Integer gender;

    /** 生日 */
    private java.util.Date birthday;

    /** 邮箱 */
    private java.lang.String email;

    /** qq */
    private java.lang.String qq;

    /** mobile */
    private java.lang.String mobile;

    /** 电话 */
    private java.lang.String phone;

    /** 密码输入错误次数 */
    private java.lang.Integer pwdErrCount;

    /** 会员来源1、pc；2、H5；3、Android；4、IOS ;5、微信商城 */
    private Integer source;

    /** 账户余额 */
    private Long balance;

    /** 账户支付密码 */
    private java.lang.String balancePwd;

    /** 是否验证邮箱0、未验证；1、验证 */
    private Integer isEmailVerify;

    /** 是否验证手机0、未验证；1、验证 */
    private Integer isSmsVerify;

    /** 短信验证码 */
    private java.lang.String smsVerifyCode;

    /** 邮件验证码 */
    private java.lang.String emailVerifyCode;

    /** 是否接受短信0、不接受；1、接受 */
    private Integer canReceiveSms;

    /** 是否接收邮件 */
    private Integer canReceiveEmail;

    /** 1、正常使用；2、停用 */
    private Integer status;

    private java.util.Date updateTime;

    /** 个人头像 */
    private java.lang.String avatar;

    /** 微信openid */
    private java.lang.String openId;

    /** 微信小程序openid */
    private java.lang.String sopenId;

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
    public void setGrade(java.lang.Integer grade) {
        this.grade = grade;
    }

    public java.lang.Integer getGrade() {
        return this.grade;
    }
    public void setGradeValue(java.lang.Integer gradeValue) {
        this.gradeValue = gradeValue;
    }

    public java.lang.Integer getGradeValue() {
        return this.gradeValue;
    }
    public void setIntegral(java.lang.Integer integral) {
        this.integral = integral;
    }

    public java.lang.Integer getIntegral() {
        return this.integral;
    }
    public void setRegisterTime(java.util.Date registerTime) {
        this.registerTime = registerTime;
    }

    public java.util.Date getRegisterTime() {
        return this.registerTime;
    }
    public void setLastLoginTime(java.util.Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public java.util.Date getLastLoginTime() {
        return this.lastLoginTime;
    }
    public void setLastLoginIp(java.lang.String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public java.lang.String getLastLoginIp() {
        return this.lastLoginIp;
    }
    public void setLoginNumber(java.lang.Integer loginNumber) {
        this.loginNumber = loginNumber;
    }

    public java.lang.Integer getLoginNumber() {
        return this.loginNumber;
    }
    public void setLastAddressId(java.lang.Integer lastAddressId) {
        this.lastAddressId = lastAddressId;
    }

    public java.lang.Integer getLastAddressId() {
        return this.lastAddressId;
    }
    public void setLastPaymentCode(java.lang.Integer lastPaymentCode) {
        this.lastPaymentCode = lastPaymentCode;
    }

    public java.lang.Integer getLastPaymentCode() {
        return this.lastPaymentCode;
    }
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getGender() {
        return this.gender;
    }
    public void setBirthday(java.util.Date birthday) {
        this.birthday = birthday;
    }

    public java.util.Date getBirthday() {
        return this.birthday;
    }
    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    public java.lang.String getEmail() {
        return this.email;
    }
    public void setQq(java.lang.String qq) {
        this.qq = qq;
    }

    public java.lang.String getQq() {
        return this.qq;
    }
    public void setMobile(java.lang.String mobile) {
        this.mobile = mobile;
    }

    public java.lang.String getMobile() {
        return this.mobile;
    }
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }

    public java.lang.String getPhone() {
        return this.phone;
    }
    public void setPwdErrCount(java.lang.Integer pwdErrCount) {
        this.pwdErrCount = pwdErrCount;
    }

    public java.lang.Integer getPwdErrCount() {
        return this.pwdErrCount;
    }
    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getSource() {
        return this.source;
    }
    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public Long getBalance() {
        return this.balance;
    }
    public void setBalancePwd(java.lang.String balancePwd) {
        this.balancePwd = balancePwd;
    }

    public java.lang.String getBalancePwd() {
        return this.balancePwd;
    }
    public void setIsEmailVerify(Integer isEmailVerify) {
        this.isEmailVerify = isEmailVerify;
    }

    public Integer getIsEmailVerify() {
        return this.isEmailVerify;
    }
    public void setIsSmsVerify(Integer isSmsVerify) {
        this.isSmsVerify = isSmsVerify;
    }

    public Integer getIsSmsVerify() {
        return this.isSmsVerify;
    }
    public void setSmsVerifyCode(java.lang.String smsVerifyCode) {
        this.smsVerifyCode = smsVerifyCode;
    }

    public java.lang.String getSmsVerifyCode() {
        return this.smsVerifyCode;
    }
    public void setEmailVerifyCode(java.lang.String emailVerifyCode) {
        this.emailVerifyCode = emailVerifyCode;
    }

    public java.lang.String getEmailVerifyCode() {
        return this.emailVerifyCode;
    }
    public void setCanReceiveSms(Integer canReceiveSms) {
        this.canReceiveSms = canReceiveSms;
    }

    public Integer getCanReceiveSms() {
        return this.canReceiveSms;
    }
    public void setCanReceiveEmail(Integer canReceiveEmail) {
        this.canReceiveEmail = canReceiveEmail;
    }

    public Integer getCanReceiveEmail() {
        return this.canReceiveEmail;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return this.status;
    }
    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }
    public void setAvatar(java.lang.String avatar) {
        this.avatar = avatar;
    }

    public java.lang.String getAvatar() {
        return this.avatar;
    }
    public void setOpenId(java.lang.String openId) {
        this.openId = openId;
    }

    public java.lang.String getOpenId() {
        return this.openId;
    }
    public void setSopenId(java.lang.String sopenId) {
        this.sopenId = sopenId;
    }

    public java.lang.String getSopenId() {
        return this.sopenId;
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
		return  "Id="  + id +";"+  "Name="  + name +";"+  "Password="  + password +";"+  "Grade="  + grade +";"+  "GradeValue="  + gradeValue +";"+  "Integral="  + integral +";"+  "RegisterTime="  + registerTime +";"+  "LastLoginTime="  + lastLoginTime +";"+  "LastLoginIp="  + lastLoginIp +";"+  "LoginNumber="  + loginNumber +";"+  "LastAddressId="  + lastAddressId +";"+  "LastPaymentCode="  + lastPaymentCode +";"+  "Gender="  + gender +";"+  "Birthday="  + birthday +";"+  "Email="  + email +";"+  "Qq="  + qq +";"+  "Mobile="  + mobile +";"+  "Phone="  + phone +";"+  "PwdErrCount="  + pwdErrCount +";"+  "Source="  + source +";"+  "Balance="  + balance +";"+  "BalancePwd="  + balancePwd +";"+  "IsEmailVerify="  + isEmailVerify +";"+  "IsSmsVerify="  + isSmsVerify +";"+  "SmsVerifyCode="  + smsVerifyCode +";"+  "EmailVerifyCode="  + emailVerifyCode +";"+  "CanReceiveSms="  + canReceiveSms +";"+  "CanReceiveEmail="  + canReceiveEmail +";"+  "Status="  + status +";"+  "UpdateTime="  + updateTime +";"+  "Avatar="  + avatar +";"+  "OpenId="  + openId +";"+  "SopenId="  + sopenId +";"+  "SessionId="  + sessionId +";"+  "PushId="  + pushId ; 
    }
}