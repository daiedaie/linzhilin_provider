package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:20
 */
public class PlatProduct implements Serializable{

    private static final long serialVersionUID = 1L;

    private java.lang.Integer id;

    /** 商品编码 */
    private java.lang.String productCode;

    /** 1 非模板 2 模板 */
    private Integer templateType;

    /** 分类ID */
    private java.lang.Integer productCateId;

    /** 商品名称建议50个字符 */
    private java.lang.String name1;

    /** 品牌ID */
    private java.lang.Integer productBrandId;

    /** 市场价 */
    private Long marketPrice;

    /** 商城价Mobile */
    private Long malMobilePrice;

    /** 商品库存 */
    private java.lang.Integer productStock;

    /** 规格属性值集合 空 */
    private java.lang.String normName;

    /** 生产厂家 */
    private java.lang.String manufacturer;

    /** 产地 */
    private java.lang.String origin;

    /** 单位（即、克、盒、等） */
    private java.lang.String sku;

    /** 1、刚创建；2、提交审核；3、审核通过；4、申请驳回；5、商品删除；6、上架；7、下架 */
    private Integer state;

    /** 商品描述信息 */
    private java.lang.String description;

    /** 包装清单 */
    private java.lang.String packing;

    /** 主图 */
    private java.lang.String masterImg;

    /** 更新时间 */
    private java.util.Date updateTime;

    /** 创建时间 */
    private java.util.Date createTime;


    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Integer getId() {
        return this.id;
    }
    public void setProductCode(java.lang.String productCode) {
        this.productCode = productCode;
    }

    public java.lang.String getProductCode() {
        return this.productCode;
    }
    public void setTemplateType(Integer templateType) {
        this.templateType = templateType;
    }

    public Integer getTemplateType() {
        return this.templateType;
    }
    public void setProductCateId(java.lang.Integer productCateId) {
        this.productCateId = productCateId;
    }

    public java.lang.Integer getProductCateId() {
        return this.productCateId;
    }
    public void setName1(java.lang.String name1) {
        this.name1 = name1;
    }

    public java.lang.String getName1() {
        return this.name1;
    }
    public void setProductBrandId(java.lang.Integer productBrandId) {
        this.productBrandId = productBrandId;
    }

    public java.lang.Integer getProductBrandId() {
        return this.productBrandId;
    }
    public void setMarketPrice(Long marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Long getMarketPrice() {
        return this.marketPrice;
    }
    public void setMalMobilePrice(Long malMobilePrice) {
        this.malMobilePrice = malMobilePrice;
    }

    public Long getMalMobilePrice() {
        return this.malMobilePrice;
    }
    public void setProductStock(java.lang.Integer productStock) {
        this.productStock = productStock;
    }

    public java.lang.Integer getProductStock() {
        return this.productStock;
    }
    public void setNormName(java.lang.String normName) {
        this.normName = normName;
    }

    public java.lang.String getNormName() {
        return this.normName;
    }
    public void setManufacturer(java.lang.String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public java.lang.String getManufacturer() {
        return this.manufacturer;
    }
    public void setOrigin(java.lang.String origin) {
        this.origin = origin;
    }

    public java.lang.String getOrigin() {
        return this.origin;
    }
    public void setSku(java.lang.String sku) {
        this.sku = sku;
    }

    public java.lang.String getSku() {
        return this.sku;
    }
    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getState() {
        return this.state;
    }
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    public java.lang.String getDescription() {
        return this.description;
    }
    public void setPacking(java.lang.String packing) {
        this.packing = packing;
    }

    public java.lang.String getPacking() {
        return this.packing;
    }
    public void setMasterImg(java.lang.String masterImg) {
        this.masterImg = masterImg;
    }

    public java.lang.String getMasterImg() {
        return this.masterImg;
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
		return  "Id="  + id +";"+  "ProductCode="  + productCode +";"+  "TemplateType="  + templateType +";"+  "ProductCateId="  + productCateId +";"+  "Name1="  + name1 +";"+  "ProductBrandId="  + productBrandId +";"+  "MarketPrice="  + marketPrice +";"+  "MalMobilePrice="  + malMobilePrice +";"+  "ProductStock="  + productStock +";"+  "NormName="  + normName +";"+  "Manufacturer="  + manufacturer +";"+  "Origin="  + origin +";"+  "Sku="  + sku +";"+  "State="  + state +";"+  "Description="  + description +";"+  "Packing="  + packing +";"+  "MasterImg="  + masterImg +";"+  "UpdateTime="  + updateTime +";"+  "CreateTime="  + createTime ; 
    }
}