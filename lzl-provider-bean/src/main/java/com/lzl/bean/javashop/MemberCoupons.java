package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 活动：用户优惠券
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:18
 */
public class MemberCoupons implements Serializable{

    private static final long serialVersionUID = 1L;

    private java.lang.Integer id;

    /** 用户Id */
    private java.lang.Integer userId;

    /** 1:普通优惠券 2：新客立减优惠券 */
    private Integer type;

    /** 优惠券id */
    private java.lang.Integer promotionId;

    /** 优惠券名称 */
    private java.lang.String promotionName;

    /** 开始时间 */
    private java.util.Date startTime;

    /** 到期时间 */
    private java.util.Date endTime;

    private java.lang.String discount;

    private java.lang.String pic;

    /** 使用状态：0：未使用，1：已经使用 */
    private java.lang.Integer state;

    /** 商家Id */
    private java.lang.Integer sellerId;

    /** 优惠券获得时间 */
    private java.util.Date getTime;

    /** 使用时间 */
    private java.util.Date useTime;

    /** 使用订单号 */
    private java.lang.Integer orderId;


    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Integer getId() {
        return this.id;
    }
    public void setUserId(java.lang.Integer userId) {
        this.userId = userId;
    }

    public java.lang.Integer getUserId() {
        return this.userId;
    }
    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return this.type;
    }
    public void setPromotionId(java.lang.Integer promotionId) {
        this.promotionId = promotionId;
    }

    public java.lang.Integer getPromotionId() {
        return this.promotionId;
    }
    public void setPromotionName(java.lang.String promotionName) {
        this.promotionName = promotionName;
    }

    public java.lang.String getPromotionName() {
        return this.promotionName;
    }
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    public java.util.Date getStartTime() {
        return this.startTime;
    }
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    public java.util.Date getEndTime() {
        return this.endTime;
    }
    public void setDiscount(java.lang.String discount) {
        this.discount = discount;
    }

    public java.lang.String getDiscount() {
        return this.discount;
    }
    public void setPic(java.lang.String pic) {
        this.pic = pic;
    }

    public java.lang.String getPic() {
        return this.pic;
    }
    public void setState(java.lang.Integer state) {
        this.state = state;
    }

    public java.lang.Integer getState() {
        return this.state;
    }
    public void setSellerId(java.lang.Integer sellerId) {
        this.sellerId = sellerId;
    }

    public java.lang.Integer getSellerId() {
        return this.sellerId;
    }
    public void setGetTime(java.util.Date getTime) {
        this.getTime = getTime;
    }

    public java.util.Date getGetTime() {
        return this.getTime;
    }
    public void setUseTime(java.util.Date useTime) {
        this.useTime = useTime;
    }

    public java.util.Date getUseTime() {
        return this.useTime;
    }
    public void setOrderId(java.lang.Integer orderId) {
        this.orderId = orderId;
    }

    public java.lang.Integer getOrderId() {
        return this.orderId;
    }
	
	@Override
    public String toString() {
		return  "Id="  + id +";"+  "UserId="  + userId +";"+  "Type="  + type +";"+  "PromotionId="  + promotionId +";"+  "PromotionName="  + promotionName +";"+  "StartTime="  + startTime +";"+  "EndTime="  + endTime +";"+  "Discount="  + discount +";"+  "Pic="  + pic +";"+  "State="  + state +";"+  "SellerId="  + sellerId +";"+  "GetTime="  + getTime +";"+  "UseTime="  + useTime +";"+  "OrderId="  + orderId ; 
    }
}