package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 操作申请
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:19
 */
public class OperateApply implements Serializable{

    private static final long serialVersionUID = 1L;

    /** 操作申请id */
    private java.lang.Integer operateApplyId;

    /** 角色类型（1.商家） */
    private Integer userType;

    /** 申请操作用户id */
    private java.lang.Integer applyUserId;

    /** 1.商家银行卡修改 2.商家营业执照 */
    private Integer operateType;

    /** 操作内容(根据具体类型有对应的json字符串） */
    private java.lang.String content;

    /** 1:提交申请 2：通过 3：拒绝 */
    private Integer status;

    /** 反馈 */
    private java.lang.String feedback;

    /** 更新时间 */
    private java.util.Date updateTime;

    /** 创建时间 */
    private java.util.Date createTime;


    public void setOperateApplyId(java.lang.Integer operateApplyId) {
        this.operateApplyId = operateApplyId;
    }

    public java.lang.Integer getOperateApplyId() {
        return this.operateApplyId;
    }
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getUserType() {
        return this.userType;
    }
    public void setApplyUserId(java.lang.Integer applyUserId) {
        this.applyUserId = applyUserId;
    }

    public java.lang.Integer getApplyUserId() {
        return this.applyUserId;
    }
    public void setOperateType(Integer operateType) {
        this.operateType = operateType;
    }

    public Integer getOperateType() {
        return this.operateType;
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
    public void setFeedback(java.lang.String feedback) {
        this.feedback = feedback;
    }

    public java.lang.String getFeedback() {
        return this.feedback;
    }
    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }
	
	@Override
    public String toString() {
		return  "OperateApplyId="  + operateApplyId +";"+  "UserType="  + userType +";"+  "ApplyUserId="  + applyUserId +";"+  "OperateType="  + operateType +";"+  "Content="  + content +";"+  "Status="  + status +";"+  "Feedback="  + feedback +";"+  "UpdateTime="  + updateTime +";"+  "CreateTime="  + createTime ; 
    }
}