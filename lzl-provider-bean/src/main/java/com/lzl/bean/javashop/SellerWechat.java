package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 商家微信
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:22
 */
public class SellerWechat implements Serializable{

    private static final long serialVersionUID = 1L;

    /** 商家id */
    private java.lang.Integer sellerId;

    /** 微信唯一标识 */
    private java.lang.String unionId;

    private java.lang.String openId;

    /** 转账次数 */
    private Integer num;

    /** 微信logo */
    private java.lang.String wechatLogo;

    /** 微信昵称 */
    private java.lang.String wechatName;

    /** 上次绑定账号修改时间 */
    private java.util.Date updateTime;

    /** 创建时间 */
    private java.util.Date createTime;


    public void setSellerId(java.lang.Integer sellerId) {
        this.sellerId = sellerId;
    }

    public java.lang.Integer getSellerId() {
        return this.sellerId;
    }
    public void setUnionId(java.lang.String unionId) {
        this.unionId = unionId;
    }

    public java.lang.String getUnionId() {
        return this.unionId;
    }
    public void setOpenId(java.lang.String openId) {
        this.openId = openId;
    }

    public java.lang.String getOpenId() {
        return this.openId;
    }
    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return this.num;
    }
    public void setWechatLogo(java.lang.String wechatLogo) {
        this.wechatLogo = wechatLogo;
    }

    public java.lang.String getWechatLogo() {
        return this.wechatLogo;
    }
    public void setWechatName(java.lang.String wechatName) {
        this.wechatName = wechatName;
    }

    public java.lang.String getWechatName() {
        return this.wechatName;
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
		return  "SellerId="  + sellerId +";"+  "UnionId="  + unionId +";"+  "OpenId="  + openId +";"+  "Num="  + num +";"+  "WechatLogo="  + wechatLogo +";"+  "WechatName="  + wechatName +";"+  "UpdateTime="  + updateTime +";"+  "CreateTime="  + createTime ; 
    }
}