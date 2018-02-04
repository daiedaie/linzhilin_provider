package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 促销活动预警记录
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:20
 */
public class PromotionAlarm implements Serializable{

    private static final long serialVersionUID = 1L;

    /** 促销活动预警记录主键 */
    private java.lang.Integer promotionAlarmId;

    /** 促销活动主键 */
    private java.lang.Integer promotionId;

    /** 商家id */
    private java.lang.Integer sellerId;

    /** 商品编码 */
    private java.lang.String productCode;

    /** 预警值 */
    private java.lang.Integer alarmValue;

    /** 创建时间 */
    private java.util.Date createTime;


    public void setPromotionAlarmId(java.lang.Integer promotionAlarmId) {
        this.promotionAlarmId = promotionAlarmId;
    }

    public java.lang.Integer getPromotionAlarmId() {
        return this.promotionAlarmId;
    }
    public void setPromotionId(java.lang.Integer promotionId) {
        this.promotionId = promotionId;
    }

    public java.lang.Integer getPromotionId() {
        return this.promotionId;
    }
    public void setSellerId(java.lang.Integer sellerId) {
        this.sellerId = sellerId;
    }

    public java.lang.Integer getSellerId() {
        return this.sellerId;
    }
    public void setProductCode(java.lang.String productCode) {
        this.productCode = productCode;
    }

    public java.lang.String getProductCode() {
        return this.productCode;
    }
    public void setAlarmValue(java.lang.Integer alarmValue) {
        this.alarmValue = alarmValue;
    }

    public java.lang.Integer getAlarmValue() {
        return this.alarmValue;
    }
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }
	
	@Override
    public String toString() {
		return  "PromotionAlarmId="  + promotionAlarmId +";"+  "PromotionId="  + promotionId +";"+  "SellerId="  + sellerId +";"+  "ProductCode="  + productCode +";"+  "AlarmValue="  + alarmValue +";"+  "CreateTime="  + createTime ; 
    }
}