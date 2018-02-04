package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 商品详情点击
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:17
 */
public class LogProductClick implements Serializable{

    private static final long serialVersionUID = 1L;

    /** 商品id */
    private java.lang.Integer productId;

    /** 供应商id */
    private java.lang.Integer supplierId;

    /** 商家id */
    private java.lang.Integer sellerId;

    /** 用户id */
    private java.lang.Integer memberId;

    /** 创建时间 */
    private java.util.Date createTime;


    public void setProductId(java.lang.Integer productId) {
        this.productId = productId;
    }

    public java.lang.Integer getProductId() {
        return this.productId;
    }
    public void setSupplierId(java.lang.Integer supplierId) {
        this.supplierId = supplierId;
    }

    public java.lang.Integer getSupplierId() {
        return this.supplierId;
    }
    public void setSellerId(java.lang.Integer sellerId) {
        this.sellerId = sellerId;
    }

    public java.lang.Integer getSellerId() {
        return this.sellerId;
    }
    public void setMemberId(java.lang.Integer memberId) {
        this.memberId = memberId;
    }

    public java.lang.Integer getMemberId() {
        return this.memberId;
    }
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }
	
	@Override
    public String toString() {
		return  "ProductId="  + productId +";"+  "SupplierId="  + supplierId +";"+  "SellerId="  + sellerId +";"+  "MemberId="  + memberId +";"+  "CreateTime="  + createTime ; 
    }
}