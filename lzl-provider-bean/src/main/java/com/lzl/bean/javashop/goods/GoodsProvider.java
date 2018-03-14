package com.lzl.bean.javashop.goods;

import java.io.Serializable;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:02
 */
public class GoodsProvider implements Serializable{

    private static final long serialVersionUID = 1L;

    /** 编码 */
    private java.lang.Integer goodsProviderId;

    /** 物品ID */
    private java.lang.Integer goodsId;

    /** 供应商ID  */
    private java.lang.Integer providerId;

    /** 创建时间 */
    private java.util.Date createTime;

    /** 最后一次修改时间 */
    private java.util.Date modifyTime;


    public void setGoodsProviderId(java.lang.Integer goodsProviderId) {
        this.goodsProviderId = goodsProviderId;
    }

    public java.lang.Integer getGoodsProviderId() {
        return this.goodsProviderId;
    }
    public void setGoodsId(java.lang.Integer goodsId) {
        this.goodsId = goodsId;
    }

    public java.lang.Integer getGoodsId() {
        return this.goodsId;
    }
    public void setProviderId(java.lang.Integer providerId) {
        this.providerId = providerId;
    }

    public java.lang.Integer getProviderId() {
        return this.providerId;
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
		return  "GoodsProviderId="  + goodsProviderId +";"+  "GoodsId="  + goodsId +";"+  "ProviderId="  + providerId +";"+  "CreateTime="  + createTime +";"+  "ModifyTime="  + modifyTime ; 
    }
}