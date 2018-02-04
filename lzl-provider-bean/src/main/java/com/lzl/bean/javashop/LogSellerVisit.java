package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 用户访问商家
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:18
 */
public class LogSellerVisit implements Serializable{

    private static final long serialVersionUID = 1L;

    /** 用户id */
    private java.lang.Integer memberId;

    /** 商家id */
    private java.lang.Integer sellerId;

    /** 创建时间 */
    private java.util.Date createTime;


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
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }
	
	@Override
    public String toString() {
		return  "MemberId="  + memberId +";"+  "SellerId="  + sellerId +";"+  "CreateTime="  + createTime ; 
    }
}