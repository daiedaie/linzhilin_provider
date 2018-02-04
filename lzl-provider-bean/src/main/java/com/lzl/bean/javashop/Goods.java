package com.lzl.bean.javashop;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:01
 */
public class Goods implements Serializable{

    private static final long serialVersionUID = 1L;

    /** 编码 */
    private java.lang.Integer goodsId;

    /** 全称 */
    private java.lang.String fullName;

    /** 简称 */
    private java.lang.String shortName;

    /** 规格型号 */
    private java.lang.String detail;

    /** 条形码 */
    private java.lang.String barCode;

    /** 物品所属性质 */
    private java.lang.Integer goodsAttributeId;

    /** 物品所属类别 */
    private java.lang.Integer goodsTypeId;

    /** 商品状态 **/
    private java.lang.Integer status;
    
	/** 计量单位 */
    private java.lang.Integer measureId;

    /** 商品来源的常用仓库 */
    private java.lang.Integer repositoryId;

    /** 商品常用供应商 */
    private java.lang.Integer providerId;

    /** 最小库存量 */
    private java.lang.Integer minStock;

    /** 最大库存量 */
    private java.lang.Integer maxStock;

    /** 是否批号管理 */
    private Integer batchManage;

    /** 有效开始日期 */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    private java.util.Date beginDate;

    /** 失效日期 */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    private java.util.Date invalidDate;

    /** 创建时间 */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private java.util.Date createTime;

    /** 最后一次修改时间 */
    private java.util.Date modifyTime;


    public void setGoodsId(java.lang.Integer goodsId) {
        this.goodsId = goodsId;
    }

    public java.lang.Integer getGoodsId() {
        return this.goodsId;
    }
    public void setFullName(java.lang.String fullName) {
        this.fullName = fullName;
    }

    public java.lang.String getFullName() {
        return this.fullName;
    }
    public void setShortName(java.lang.String shortName) {
        this.shortName = shortName;
    }

    public java.lang.String getShortName() {
        return this.shortName;
    }
    public void setDetail(java.lang.String detail) {
        this.detail = detail;
    }

    public java.lang.String getDetail() {
        return this.detail;
    }
    public void setBarCode(java.lang.String barCode) {
        this.barCode = barCode;
    }

    public java.lang.String getBarCode() {
        return this.barCode;
    }
    public void setGoodsAttributeId(java.lang.Integer goodsAttributeId) {
        this.goodsAttributeId = goodsAttributeId;
    }

    public java.lang.Integer getGoodsAttributeId() {
        return this.goodsAttributeId;
    }
    public void setGoodsTypeId(java.lang.Integer goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public java.lang.Integer getGoodsTypeId() {
        return this.goodsTypeId;
    }
    
    public java.lang.Integer getStatus() {
		return status;
	}

	public void setStatus(java.lang.Integer status) {
		this.status = status;
	}
    
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }

    public java.lang.Integer getMeasureId() {
        return this.measureId;
    }
    public void setRepositoryId(java.lang.Integer repositoryId) {
        this.repositoryId = repositoryId;
    }

    public java.lang.Integer getRepositoryId() {
        return this.repositoryId;
    }
    public void setProviderId(java.lang.Integer providerId) {
        this.providerId = providerId;
    }

    public java.lang.Integer getProviderId() {
        return this.providerId;
    }
    public void setMinStock(java.lang.Integer minStock) {
        this.minStock = minStock;
    }

    public java.lang.Integer getMinStock() {
        return this.minStock;
    }
    public void setMaxStock(java.lang.Integer maxStock) {
        this.maxStock = maxStock;
    }

    public java.lang.Integer getMaxStock() {
        return this.maxStock;
    }
    public void setBatchManage(Integer batchManage) {
        this.batchManage = batchManage;
    }

    public Integer getBatchManage() {
        return this.batchManage;
    }
    public void setBeginDate(java.util.Date beginDate) {
        this.beginDate = beginDate;
    }

    public java.util.Date getBeginDate() {
        return this.beginDate;
    }
    public void setInvalidDate(java.util.Date invalidDate) {
        this.invalidDate = invalidDate;
    }

    public java.util.Date getInvalidDate() {
        return this.invalidDate;
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
		return "Goods [goodsId=" + goodsId + ", fullName=" + fullName + ", shortName=" + shortName + ", detail="
				+ detail + ", barCode=" + barCode + ", goodsAttributeId=" + goodsAttributeId + ", goodsTypeId="
				+ goodsTypeId + ", status=" + status + ", measureId=" + measureId + ", repositoryId=" + repositoryId
				+ ", providerId=" + providerId + ", minStock=" + minStock + ", maxStock=" + maxStock + ", batchManage="
				+ batchManage + ", beginDate=" + beginDate + ", invalidDate=" + invalidDate + ", createTime="
				+ createTime + ", modifyTime=" + modifyTime + "]";
	}
	
}