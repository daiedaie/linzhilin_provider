package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 商品评论管理
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:20
 */
public class ProductComments implements Serializable{

    private static final long serialVersionUID = 1L;

    private java.lang.Integer id;

    /** 评价人ID */
    private java.lang.Integer userId;

    /** 评价人账号 */
    private java.lang.String userName;

    /** 图片 */
    private java.lang.String pic;

    /** 商品评分(1到5) */
    private Integer grade;

    /** 评价内容 */
    private java.lang.String content;

    /** 评价商品 */
    private java.lang.Integer productId;

    /** 货品ID */
    private java.lang.Integer productGoodsId;

    /** 所属商家 */
    private java.lang.Integer sellerId;

    /** 回复人ID */
    private java.lang.Integer replyId;

    /** 回复人名称 */
    private java.lang.String replyName;

    /** 回复内容 */
    private java.lang.String replyContent;

    /** 1、评价；2、审核通过，前台显示；3、删除 */
    private Integer state;

    private java.util.Date updateTime;

    /** 评价时间 */
    private java.util.Date createTime;


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
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }

    public java.lang.String getUserName() {
        return this.userName;
    }
    public void setPic(java.lang.String pic) {
        this.pic = pic;
    }

    public java.lang.String getPic() {
        return this.pic;
    }
    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getGrade() {
        return this.grade;
    }
    public void setContent(java.lang.String content) {
        this.content = content;
    }

    public java.lang.String getContent() {
        return this.content;
    }
    public void setProductId(java.lang.Integer productId) {
        this.productId = productId;
    }

    public java.lang.Integer getProductId() {
        return this.productId;
    }
    public void setProductGoodsId(java.lang.Integer productGoodsId) {
        this.productGoodsId = productGoodsId;
    }

    public java.lang.Integer getProductGoodsId() {
        return this.productGoodsId;
    }
    public void setSellerId(java.lang.Integer sellerId) {
        this.sellerId = sellerId;
    }

    public java.lang.Integer getSellerId() {
        return this.sellerId;
    }
    public void setReplyId(java.lang.Integer replyId) {
        this.replyId = replyId;
    }

    public java.lang.Integer getReplyId() {
        return this.replyId;
    }
    public void setReplyName(java.lang.String replyName) {
        this.replyName = replyName;
    }

    public java.lang.String getReplyName() {
        return this.replyName;
    }
    public void setReplyContent(java.lang.String replyContent) {
        this.replyContent = replyContent;
    }

    public java.lang.String getReplyContent() {
        return this.replyContent;
    }
    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getState() {
        return this.state;
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
		return  "Id="  + id +";"+  "UserId="  + userId +";"+  "UserName="  + userName +";"+  "Pic="  + pic +";"+  "Grade="  + grade +";"+  "Content="  + content +";"+  "ProductId="  + productId +";"+  "ProductGoodsId="  + productGoodsId +";"+  "SellerId="  + sellerId +";"+  "ReplyId="  + replyId +";"+  "ReplyName="  + replyName +";"+  "ReplyContent="  + replyContent +";"+  "State="  + state +";"+  "UpdateTime="  + updateTime +";"+  "CreateTime="  + createTime ; 
    }
}