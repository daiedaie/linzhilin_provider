package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:22
 */
public class Sms implements Serializable{

    private static final long serialVersionUID = 1L;

    /** 手机号码 */
    private java.lang.String mobile;

    /** 验证码 */
    private java.lang.String code;

    /** 验证码发送时间 */
    private java.util.Date lastTime;


    public void setMobile(java.lang.String mobile) {
        this.mobile = mobile;
    }

    public java.lang.String getMobile() {
        return this.mobile;
    }
    public void setCode(java.lang.String code) {
        this.code = code;
    }

    public java.lang.String getCode() {
        return this.code;
    }
    public void setLastTime(java.util.Date lastTime) {
        this.lastTime = lastTime;
    }

    public java.util.Date getLastTime() {
        return this.lastTime;
    }
	
	@Override
    public String toString() {
		return  "Mobile="  + mobile +";"+  "Code="  + code +";"+  "LastTime="  + lastTime ; 
    }
}