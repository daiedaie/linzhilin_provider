package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 单品立减活动参加日志表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:16
 */
public class ActSingleLog implements Serializable{

    private static final long serialVersionUID = 1L;

    private java.lang.Integer id;

    /** 单品立减活动id */
    private java.lang.Integer actSingleId;

    /** 会员id */
    private java.lang.Integer memberId;

    /** 所属商家id */
    private java.lang.Integer sellerId;

    /** 订单id */
    private java.lang.Integer orderId;

    /** 网单id */
    private java.lang.Integer orderProductId;

    /** 商品id */
    private java.lang.Integer productId;

    private java.lang.Integer createUserId;

    private java.lang.String createUserName;

    private java.util.Date createTime;


    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Integer getId() {
        return this.id;
    }
    public void setActSingleId(java.lang.Integer actSingleId) {
        this.actSingleId = actSingleId;
    }

    public java.lang.Integer getActSingleId() {
        return this.actSingleId;
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
    public void setOrderId(java.lang.Integer orderId) {
        this.orderId = orderId;
    }

    public java.lang.Integer getOrderId() {
        return this.orderId;
    }
    public void setOrderProductId(java.lang.Integer orderProductId) {
        this.orderProductId = orderProductId;
    }

    public java.lang.Integer getOrderProductId() {
        return this.orderProductId;
    }
    public void setProductId(java.lang.Integer productId) {
        this.productId = productId;
    }

    public java.lang.Integer getProductId() {
        return this.productId;
    }
    public void setCreateUserId(java.lang.Integer createUserId) {
        this.createUserId = createUserId;
    }

    public java.lang.Integer getCreateUserId() {
        return this.createUserId;
    }
    public void setCreateUserName(java.lang.String createUserName) {
        this.createUserName = createUserName;
    }

    public java.lang.String getCreateUserName() {
        return this.createUserName;
    }
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }
	
	@Override
    public String toString() {
		return  "Id="  + id +";"+  "ActSingleId="  + actSingleId +";"+  "MemberId="  + memberId +";"+  "SellerId="  + sellerId +";"+  "OrderId="  + orderId +";"+  "OrderProductId="  + orderProductId +";"+  "ProductId="  + productId +";"+  "CreateUserId="  + createUserId +";"+  "CreateUserName="  + createUserName +";"+  "CreateTime="  + createTime ; 
    }
}