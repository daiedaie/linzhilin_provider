package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:19
 */
public class Partner implements Serializable{

    private static final long serialVersionUID = 1L;

    private java.lang.Integer partnerId;

    private java.lang.Integer memberId;

    /** 真实姓名 */
    private java.lang.String realName;

    /** 邀请码 */
    private java.lang.String inviteCode;

    /** 1：等待审核 2：审核通过 3：审核不通过 */
    private Integer partnerStatus;

    /** 更新时间 */
    private java.util.Date updateTime;

    /** 创建时间 */
    private java.util.Date createTime;


    public void setPartnerId(java.lang.Integer partnerId) {
        this.partnerId = partnerId;
    }

    public java.lang.Integer getPartnerId() {
        return this.partnerId;
    }
    public void setMemberId(java.lang.Integer memberId) {
        this.memberId = memberId;
    }

    public java.lang.Integer getMemberId() {
        return this.memberId;
    }
    public void setRealName(java.lang.String realName) {
        this.realName = realName;
    }

    public java.lang.String getRealName() {
        return this.realName;
    }
    public void setInviteCode(java.lang.String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public java.lang.String getInviteCode() {
        return this.inviteCode;
    }
    public void setPartnerStatus(Integer partnerStatus) {
        this.partnerStatus = partnerStatus;
    }

    public Integer getPartnerStatus() {
        return this.partnerStatus;
    }
    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }
	
	@Override
    public String toString() {
		return  "PartnerId="  + partnerId +";"+  "MemberId="  + memberId +";"+  "RealName="  + realName +";"+  "InviteCode="  + inviteCode +";"+  "PartnerStatus="  + partnerStatus +";"+  "UpdateTime="  + updateTime +";"+  "CreateTime="  + createTime ; 
    }
}