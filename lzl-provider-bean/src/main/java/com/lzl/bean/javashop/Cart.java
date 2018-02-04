package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 商城购物车
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:16
 */
public class Cart implements Serializable{

    private static final long serialVersionUID = 1L;

    private java.lang.Integer id;

    /** 创建时间 */
    private java.util.Date createTime;

    /** 会员ID */
    private java.lang.Integer memberId;

    /** 数量 */
    private java.lang.Integer count;

    /** 规格ID，多个规格用逗号分隔 */
    private java.lang.String specId;

    /** 规格详情 */
    private java.lang.String specInfo;

    /** 产品ID */
    private java.lang.Integer productId;

    /** 商家ID */
    private java.lang.Integer sellerId;

    /** 货品ID */
    private java.lang.Integer productGoodsId;

    /** 是否选中0未选中、1选中 */
    private Integer checked;


    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Integer getId() {
        return this.id;
    }
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }
    public void setMemberId(java.lang.Integer memberId) {
        this.memberId = memberId;
    }

    public java.lang.Integer getMemberId() {
        return this.memberId;
    }
    public void setCount(java.lang.Integer count) {
        this.count = count;
    }

    public java.lang.Integer getCount() {
        return this.count;
    }
    public void setSpecId(java.lang.String specId) {
        this.specId = specId;
    }

    public java.lang.String getSpecId() {
        return this.specId;
    }
    public void setSpecInfo(java.lang.String specInfo) {
        this.specInfo = specInfo;
    }

    public java.lang.String getSpecInfo() {
        return this.specInfo;
    }
    public void setProductId(java.lang.Integer productId) {
        this.productId = productId;
    }

    public java.lang.Integer getProductId() {
        return this.productId;
    }
    public void setSellerId(java.lang.Integer sellerId) {
        this.sellerId = sellerId;
    }

    public java.lang.Integer getSellerId() {
        return this.sellerId;
    }
    public void setProductGoodsId(java.lang.Integer productGoodsId) {
        this.productGoodsId = productGoodsId;
    }

    public java.lang.Integer getProductGoodsId() {
        return this.productGoodsId;
    }
    public void setChecked(Integer checked) {
        this.checked = checked;
    }

    public Integer getChecked() {
        return this.checked;
    }
	
	@Override
    public String toString() {
		return  "Id="  + id +";"+  "CreateTime="  + createTime +";"+  "MemberId="  + memberId +";"+  "Count="  + count +";"+  "SpecId="  + specId +";"+  "SpecInfo="  + specInfo +";"+  "ProductId="  + productId +";"+  "SellerId="  + sellerId +";"+  "ProductGoodsId="  + productGoodsId +";"+  "Checked="  + checked ; 
    }
}