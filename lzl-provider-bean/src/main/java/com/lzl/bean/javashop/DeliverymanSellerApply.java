package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 申请成为某个商户的配送员
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:17
 */
public class DeliverymanSellerApply implements Serializable{

    private static final long serialVersionUID = 1L;

    /** 编号 */
    private java.lang.Integer id;

    /** 会员编号 */
    private java.lang.Integer memberId;

    /** 商户编号 */
    private java.lang.Integer sellerId;

    /** 申请说明 */
    private java.lang.String applyDescription;

    /** 1新建，2通过，3未通过，4超出范围禁用 */
    private Integer status;

    /** 申请日期 */
    private java.util.Date applyTime;

    /** 商户进行审核的日期时间 */
    private java.util.Date checkTime;


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
    public void setSellerId(java.lang.Integer sellerId) {
        this.sellerId = sellerId;
    }

    public java.lang.Integer getSellerId() {
        return this.sellerId;
    }
    public void setApplyDescription(java.lang.String applyDescription) {
        this.applyDescription = applyDescription;
    }

    public java.lang.String getApplyDescription() {
        return this.applyDescription;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return this.status;
    }
    public void setApplyTime(java.util.Date applyTime) {
        this.applyTime = applyTime;
    }

    public java.util.Date getApplyTime() {
        return this.applyTime;
    }
    public void setCheckTime(java.util.Date checkTime) {
        this.checkTime = checkTime;
    }

    public java.util.Date getCheckTime() {
        return this.checkTime;
    }
	
	@Override
    public String toString() {
		return  "Id="  + id +";"+  "MemberId="  + memberId +";"+  "SellerId="  + sellerId +";"+  "ApplyDescription="  + applyDescription +";"+  "Status="  + status +";"+  "ApplyTime="  + applyTime +";"+  "CheckTime="  + checkTime ; 
    }
}