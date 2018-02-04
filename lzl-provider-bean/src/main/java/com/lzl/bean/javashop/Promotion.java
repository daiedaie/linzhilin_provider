package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 促销活动
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:20
 */
public class Promotion implements Serializable{

    private static final long serialVersionUID = 1L;

    /** 促销活动主键 */
    private java.lang.Integer promotionId;

    /** 父级促销活动主键(没有父类为0) */
    private java.lang.Integer parentId;

    /** 商家ID */
    private java.lang.Integer sellerId;

    /** 促销活动名称 */
    private java.lang.String name;

    /** 促销活动类型(1:折扣，2:满送满赠 ,3:满减，4：优惠券  5：新客立减) */
    private Integer type;

    /** 活动详情 */
    private java.lang.String content;

    /** 状态  1.正在报名、3.审核通过(4.即将开始，5.正在进行，6.已经结束)、13.已经取消、15.驳回活动 */
    private Integer status;

    /** 活动开始时间 */
    private java.util.Date startTime;

    /** 活动结束时间 */
    private java.util.Date endTime;

    /** 报名截止时间 */
    private java.util.Date regDeadline;

    /** 创建人类型   （1.商家，2.供应商，3.平台） */
    private Integer userType;

    /** 创建人主体id */
    private java.lang.Integer userId;

    /** 活动描述 */
    private java.lang.String description;

    /** 活动创建时间 */
    private java.util.Date createTime;


    public void setPromotionId(java.lang.Integer promotionId) {
        this.promotionId = promotionId;
    }

    public java.lang.Integer getPromotionId() {
        return this.promotionId;
    }
    public void setParentId(java.lang.Integer parentId) {
        this.parentId = parentId;
    }

    public java.lang.Integer getParentId() {
        return this.parentId;
    }
    public void setSellerId(java.lang.Integer sellerId) {
        this.sellerId = sellerId;
    }

    public java.lang.Integer getSellerId() {
        return this.sellerId;
    }
    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getName() {
        return this.name;
    }
    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return this.type;
    }
    public void setContent(java.lang.String content) {
        this.content = content;
    }

    public java.lang.String getContent() {
        return this.content;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return this.status;
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
    public void setRegDeadline(java.util.Date regDeadline) {
        this.regDeadline = regDeadline;
    }

    public java.util.Date getRegDeadline() {
        return this.regDeadline;
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
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    public java.lang.String getDescription() {
        return this.description;
    }
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }
	
	@Override
    public String toString() {
		return  "PromotionId="  + promotionId +";"+  "ParentId="  + parentId +";"+  "SellerId="  + sellerId +";"+  "Name="  + name +";"+  "Type="  + type +";"+  "Content="  + content +";"+  "Status="  + status +";"+  "StartTime="  + startTime +";"+  "EndTime="  + endTime +";"+  "RegDeadline="  + regDeadline +";"+  "UserType="  + userType +";"+  "UserId="  + userId +";"+  "Description="  + description +";"+  "CreateTime="  + createTime ; 
    }
}