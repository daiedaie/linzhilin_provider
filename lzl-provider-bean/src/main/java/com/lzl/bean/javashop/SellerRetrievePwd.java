package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 商家重置密码申请(可以废弃，整理代码后删掉)
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:21
 */
public class SellerRetrievePwd implements Serializable{

    private static final long serialVersionUID = 1L;

    /** 主键 */
    private java.lang.Integer id;

    /** 商家手机号或者用户名 */
    private java.lang.String name;

    /** 营业执照图片 */
    private java.lang.String silverLicenseImage;

    /** 状态：0：刚创建，1:审核通过 2：审核不通过 3:修改完成 */
    private java.lang.Integer state;

    /** 拒绝原因 */
    private java.lang.String refuseReason;

    /** 审核时间 */
    private java.util.Date auditTime;

    /** 创建时间 */
    private java.util.Date createTime;

    /** 验证码 */
    private java.lang.String code;


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
    public void setSilverLicenseImage(java.lang.String silverLicenseImage) {
        this.silverLicenseImage = silverLicenseImage;
    }

    public java.lang.String getSilverLicenseImage() {
        return this.silverLicenseImage;
    }
    public void setState(java.lang.Integer state) {
        this.state = state;
    }

    public java.lang.Integer getState() {
        return this.state;
    }
    public void setRefuseReason(java.lang.String refuseReason) {
        this.refuseReason = refuseReason;
    }

    public java.lang.String getRefuseReason() {
        return this.refuseReason;
    }
    public void setAuditTime(java.util.Date auditTime) {
        this.auditTime = auditTime;
    }

    public java.util.Date getAuditTime() {
        return this.auditTime;
    }
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }
    public void setCode(java.lang.String code) {
        this.code = code;
    }

    public java.lang.String getCode() {
        return this.code;
    }
	
	@Override
    public String toString() {
		return  "Id="  + id +";"+  "Name="  + name +";"+  "SilverLicenseImage="  + silverLicenseImage +";"+  "State="  + state +";"+  "RefuseReason="  + refuseReason +";"+  "AuditTime="  + auditTime +";"+  "CreateTime="  + createTime +";"+  "Code="  + code ; 
    }
}