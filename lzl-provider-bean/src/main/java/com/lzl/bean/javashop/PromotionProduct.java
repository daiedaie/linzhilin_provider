package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 活动商品
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:21
 */
public class PromotionProduct implements Serializable{

    private static final long serialVersionUID = 1L;

    /** 活动商品主键 */
    private java.lang.Integer promotionProductId;

    /** 促销活动主键 */
    private java.lang.Integer promotionId;

    /** 参与人类型 （1.商家，2.供应商） */
    private Integer userType;

    /** 操作人主体id */
    private java.lang.Integer userId;

    /** 活动商品范围（1：单品，2：全部 ，3：分类，4：品牌） */
    private Integer productRange;

    /** 活动商品内容(参照product_range  如果单品就是商品code 分类就是分类Id) */
    private java.lang.String productContent;

    /** 预警值 */
    private java.lang.Integer alarmValue;

    /** 是否有效 0：无效  1：有效  */
    private Integer isValid;

    /** 创建时间 */
    private java.util.Date createTime;


    public void setPromotionProductId(java.lang.Integer promotionProductId) {
        this.promotionProductId = promotionProductId;
    }

    public java.lang.Integer getPromotionProductId() {
        return this.promotionProductId;
    }
    public void setPromotionId(java.lang.Integer promotionId) {
        this.promotionId = promotionId;
    }

    public java.lang.Integer getPromotionId() {
        return this.promotionId;
    }
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getUserType() {
        return this.userType;
    }
    public void setUserId(java.lang.Integer userId) {
        this.userId = userId;
    }

    public java.lang.Integer getUserId() {
        return this.userId;
    }
    public void setProductRange(Integer productRange) {
        this.productRange = productRange;
    }

    public Integer getProductRange() {
        return this.productRange;
    }
    public void setProductContent(java.lang.String productContent) {
        this.productContent = productContent;
    }

    public java.lang.String getProductContent() {
        return this.productContent;
    }
    public void setAlarmValue(java.lang.Integer alarmValue) {
        this.alarmValue = alarmValue;
    }

    public java.lang.Integer getAlarmValue() {
        return this.alarmValue;
    }
    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    public Integer getIsValid() {
        return this.isValid;
    }
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }
	
	@Override
    public String toString() {
		return  "PromotionProductId="  + promotionProductId +";"+  "PromotionId="  + promotionId +";"+  "UserType="  + userType +";"+  "UserId="  + userId +";"+  "ProductRange="  + productRange +";"+  "ProductContent="  + productContent +";"+  "AlarmValue="  + alarmValue +";"+  "IsValid="  + isValid +";"+  "CreateTime="  + createTime ; 
    }
}