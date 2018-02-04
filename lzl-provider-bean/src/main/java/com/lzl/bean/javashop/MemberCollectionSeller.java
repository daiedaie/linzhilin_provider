package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 会员收藏商铺表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:18
 */
public class MemberCollectionSeller implements Serializable{

    private static final long serialVersionUID = 1L;

    private java.lang.Integer id;

    /** 会员ID */
    private java.lang.Integer memberId;

    /** 商铺ID */
    private java.lang.Integer sellerId;

    /** 收藏时间 */
    private java.util.Date createTime;

    /** 删除时间 */
    private java.util.Date updateTime;

    /** 1、显示；2、删除 */
    private Integer state;


    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Integer getId() {
        return this.id;
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
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }
    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }
    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getState() {
        return this.state;
    }
	
	@Override
    public String toString() {
		return  "Id="  + id +";"+  "MemberId="  + memberId +";"+  "SellerId="  + sellerId +";"+  "CreateTime="  + createTime +";"+  "UpdateTime="  + updateTime +";"+  "State="  + state ; 
    }
}