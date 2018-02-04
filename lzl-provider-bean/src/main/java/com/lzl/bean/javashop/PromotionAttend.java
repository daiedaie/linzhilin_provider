package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 促销活动用户购买商品记录
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:20
 */
public class PromotionAttend implements Serializable{

    private static final long serialVersionUID = 1L;

    /** 活动参与记录主键 */
    private java.lang.Integer promotionAttendId;

    /** 活动主键 */
    private java.lang.Integer promotionId;

    /** 商品编码 */
    private java.lang.String productCode;

    /** 商家id */
    private java.lang.Integer sellerId;

    /** 用户id */
    private java.lang.Integer memberId;

    /** 数量 */
    private java.lang.Integer num;

    /** 是否有效 0：无效  1：有效  */
    private Integer isValid;

    /** 订单编号 */
    private java.lang.String orderSn;

    private java.util.Date createTime;


    public void setPromotionAttendId(java.lang.Integer promotionAttendId) {
        this.promotionAttendId = promotionAttendId;
    }

    public java.lang.Integer getPromotionAttendId() {
        return this.promotionAttendId;
    }
    public void setPromotionId(java.lang.Integer promotionId) {
        this.promotionId = promotionId;
    }

    public java.lang.Integer getPromotionId() {
        return this.promotionId;
    }
    public void setProductCode(java.lang.String productCode) {
        this.productCode = productCode;
    }

    public java.lang.String getProductCode() {
        return this.productCode;
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
    public void setNum(java.lang.Integer num) {
        this.num = num;
    }

    public java.lang.Integer getNum() {
        return this.num;
    }
    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    public Integer getIsValid() {
        return this.isValid;
    }
    public void setOrderSn(java.lang.String orderSn) {
        this.orderSn = orderSn;
    }

    public java.lang.String getOrderSn() {
        return this.orderSn;
    }
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }
	
	@Override
    public String toString() {
		return  "PromotionAttendId="  + promotionAttendId +";"+  "PromotionId="  + promotionId +";"+  "ProductCode="  + productCode +";"+  "SellerId="  + sellerId +";"+  "MemberId="  + memberId +";"+  "Num="  + num +";"+  "IsValid="  + isValid +";"+  "OrderSn="  + orderSn +";"+  "CreateTime="  + createTime ; 
    }
}