package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:02
 */
public class GoodsAttribute implements Serializable{

    private static final long serialVersionUID = 1L;

    /** 商品性质编码 */
    private java.lang.Integer goodsAttributeId;

    /** 商品性质名称 */
    private java.lang.String goodsAttributeName;

    /** 物品所属类别 */
    private java.lang.Integer goodsTypeId;

    /** 成本计算方法 */
    private Integer costCalculateMethod;

    /** 税率ID */
    private java.lang.Integer taxRateId;

    /** 创建时间 */
    private java.util.Date createTime;

    /** 最后一次修改时间 */
    private java.util.Date modifyTime;


    public void setGoodsAttributeId(java.lang.Integer goodsAttributeId) {
        this.goodsAttributeId = goodsAttributeId;
    }

    public java.lang.Integer getGoodsAttributeId() {
        return this.goodsAttributeId;
    }
    public void setGoodsAttributeName(java.lang.String goodsAttributeName) {
        this.goodsAttributeName = goodsAttributeName;
    }

    public java.lang.String getGoodsAttributeName() {
        return this.goodsAttributeName;
    }
    public void setGoodsTypeId(java.lang.Integer goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public java.lang.Integer getGoodsTypeId() {
        return this.goodsTypeId;
    }
    public void setCostCalculateMethod(Integer costCalculateMethod) {
        this.costCalculateMethod = costCalculateMethod;
    }

    public Integer getCostCalculateMethod() {
        return this.costCalculateMethod;
    }
    public void setTaxRateId(java.lang.Integer taxRateId) {
        this.taxRateId = taxRateId;
    }

    public java.lang.Integer getTaxRateId() {
        return this.taxRateId;
    }
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }
    public void setModifyTime(java.util.Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public java.util.Date getModifyTime() {
        return this.modifyTime;
    }
	
	@Override
    public String toString() {
		return  "GoodsAttributeId="  + goodsAttributeId +";"+  "GoodsAttributeName="  + goodsAttributeName +";"+  "GoodsTypeId="  + goodsTypeId +";"+  "CostCalculateMethod="  + costCalculateMethod +";"+  "TaxRateId="  + taxRateId +";"+  "CreateTime="  + createTime +";"+  "ModifyTime="  + modifyTime ; 
    }
}