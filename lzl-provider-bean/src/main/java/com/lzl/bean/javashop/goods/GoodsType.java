package com.lzl.bean.javashop.goods;

import java.io.Serializable;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:02
 */
public class GoodsType implements Serializable{

    private static final long serialVersionUID = 1L;

    /** 物品所属类别编码 */
    private java.lang.Integer goodsTypeId;

    /** 名称（类别分级次以小-区别级别，物品只属于最末级，如：01-01 是01的第二级 ） */
    private java.lang.String goodsTypeName;

    /** 创建时间 */
    private java.util.Date createTime;

    /** 最后一次修改时间 */
    private java.util.Date modifyTime;


    public void setGoodsTypeId(java.lang.Integer goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public java.lang.Integer getGoodsTypeId() {
        return this.goodsTypeId;
    }
    public void setGoodsTypeName(java.lang.String goodsTypeName) {
        this.goodsTypeName = goodsTypeName;
    }

    public java.lang.String getGoodsTypeName() {
        return this.goodsTypeName;
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
		return  "GoodsTypeId="  + goodsTypeId +";"+  "GoodsTypeName="  + goodsTypeName +";"+  "CreateTime="  + createTime +";"+  "ModifyTime="  + modifyTime ; 
    }
}