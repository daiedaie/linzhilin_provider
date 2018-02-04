package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 活动操作记录
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:21
 */
public class PromotionOper implements Serializable{

    private static final long serialVersionUID = 1L;

    /** 活动操作记录主键 */
    private java.lang.Integer promotionOperId;

    /** 促销活动主键 */
    private java.lang.Integer promotionId;

    /** 操作类型  【1-20：  1:商家即将开始 （2：正在进行，3：已经结束）没有这状态但是前段有，需要逻辑通过时间控制 ，4 已经取消】 */
    private Integer type;

    /** 操作人类型 （1.商家，2.供应商，3.平台） */
    private Integer userType;

    /** 操作人主体 */
    private java.lang.Integer userId;

    /** 操作人id */
    private java.lang.Integer operUserId;

    /** 备注 */
    private java.lang.String remark;

    private java.util.Date createTime;


    public void setPromotionOperId(java.lang.Integer promotionOperId) {
        this.promotionOperId = promotionOperId;
    }

    public java.lang.Integer getPromotionOperId() {
        return this.promotionOperId;
    }
    public void setPromotionId(java.lang.Integer promotionId) {
        this.promotionId = promotionId;
    }

    public java.lang.Integer getPromotionId() {
        return this.promotionId;
    }
    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return this.type;
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
    public void setOperUserId(java.lang.Integer operUserId) {
        this.operUserId = operUserId;
    }

    public java.lang.Integer getOperUserId() {
        return this.operUserId;
    }
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    public java.lang.String getRemark() {
        return this.remark;
    }
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }
	
	@Override
    public String toString() {
		return  "PromotionOperId="  + promotionOperId +";"+  "PromotionId="  + promotionId +";"+  "Type="  + type +";"+  "UserType="  + userType +";"+  "UserId="  + userId +";"+  "OperUserId="  + operUserId +";"+  "Remark="  + remark +";"+  "CreateTime="  + createTime ; 
    }
}