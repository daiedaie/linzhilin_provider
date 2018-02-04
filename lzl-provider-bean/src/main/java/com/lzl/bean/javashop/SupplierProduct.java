package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 供应商商品表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:23
 */
public class SupplierProduct implements Serializable{

    private static final long serialVersionUID = 1L;

    private java.lang.Integer id;

    /** 分类ID */
    private java.lang.Integer productCateId;

    /** 商品名称建议50个字符 */
    private java.lang.String name1;

    /** 商品促销信息（建议100个字符） */
    private java.lang.String name2;

    /** 商品关键字，用于检索商品，用逗号分隔 */
    private java.lang.String keyword;

    /** 品牌ID */
    private java.lang.Integer productBrandId;

    /** 1、自营；2、商家 */
    private Integer isSelf;

    /** 成本价 */
    private Long costPrice;

    /** 保护价，最低价格不能低于 */
    private Long protectedPrice;

    /** 市场价 */
    private Long marketPrice;

    /** 商城价 */
    private Long mallPcPrice;

    /** 商城价Mobile */
    private Long malMobilePrice;

    /** 虚拟销量 */
    private java.lang.Integer virtualSales;

    /** 实际销量 */
    private java.lang.Integer actualSales;

    /** 商品库存 */
    private java.lang.Integer productStock;

    /** 1、没有启用规格；2、启用规格 */
    private Integer isNorm;

    /** 规格ID集合 */
    private java.lang.String normIds;

    /** 规格属性值集合 空 */
    private java.lang.String normName;

    /** 1、刚创建；2、提交审核；3、审核通过；4、申请驳回；5、商品删除；6、上架；7、下架 */
    private Integer state;

    /** 1、不推荐；2、推荐 */
    private Integer isTop;

    /** 商品上架时间 */
    private java.util.Date upTime;

    /** 商品描述信息 */
    private java.lang.String description;

    /** 包装清单 */
    private java.lang.String packing;

    /** 商家ID */
    private java.lang.Integer sellerId;

    /** 创建人 */
    private java.lang.Integer createId;

    /** 创建时间 */
    private java.util.Date createTime;

    /** 更新时间 */
    private java.util.Date updateTime;

    /** 商家分类ID */
    private java.lang.Integer sellerCateId;

    /** 商品推荐，1、不推荐；2、推荐  推荐的商品会显示到店铺的首页 */
    private Integer sellerIsTop;

    /** 店铺状态：1、店铺正常；2、店铺关闭 默认1 */
    private Integer sellerState;

    /** 评价总数 */
    private java.lang.Integer commentsNumber;

    /** 平台商品分类状态：1、分类正常；2、分类关闭 默认1 */
    private Integer productCateState;

    /** 是否是虚拟商品：1、实物商品；2、虚拟商品 */
    private Integer isInventedProduct;

    /** 运费模板id */
    private java.lang.Integer transportId;

    /** 主图 */
    private java.lang.String masterImg;

    /** 商品编码 */
    private java.lang.String productCode;

    /** 商品最小单位 */
    private java.lang.String sku;


    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Integer getId() {
        return this.id;
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
    public void setName2(java.lang.String name2) {
        this.name2 = name2;
    }

    public java.lang.String getName2() {
        return this.name2;
    }
    public void setKeyword(java.lang.String keyword) {
        this.keyword = keyword;
    }

    public java.lang.String getKeyword() {
        return this.keyword;
    }
    public void setProductBrandId(java.lang.Integer productBrandId) {
        this.productBrandId = productBrandId;
    }

    public java.lang.Integer getProductBrandId() {
        return this.productBrandId;
    }
    public void setIsSelf(Integer isSelf) {
        this.isSelf = isSelf;
    }

    public Integer getIsSelf() {
        return this.isSelf;
    }
    public void setCostPrice(Long costPrice) {
        this.costPrice = costPrice;
    }

    public Long getCostPrice() {
        return this.costPrice;
    }
    public void setProtectedPrice(Long protectedPrice) {
        this.protectedPrice = protectedPrice;
    }

    public Long getProtectedPrice() {
        return this.protectedPrice;
    }
    public void setMarketPrice(Long marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Long getMarketPrice() {
        return this.marketPrice;
    }
    public void setMallPcPrice(Long mallPcPrice) {
        this.mallPcPrice = mallPcPrice;
    }

    public Long getMallPcPrice() {
        return this.mallPcPrice;
    }
    public void setMalMobilePrice(Long malMobilePrice) {
        this.malMobilePrice = malMobilePrice;
    }

    public Long getMalMobilePrice() {
        return this.malMobilePrice;
    }
    public void setVirtualSales(java.lang.Integer virtualSales) {
        this.virtualSales = virtualSales;
    }

    public java.lang.Integer getVirtualSales() {
        return this.virtualSales;
    }
    public void setActualSales(java.lang.Integer actualSales) {
        this.actualSales = actualSales;
    }

    public java.lang.Integer getActualSales() {
        return this.actualSales;
    }
    public void setProductStock(java.lang.Integer productStock) {
        this.productStock = productStock;
    }

    public java.lang.Integer getProductStock() {
        return this.productStock;
    }
    public void setIsNorm(Integer isNorm) {
        this.isNorm = isNorm;
    }

    public Integer getIsNorm() {
        return this.isNorm;
    }
    public void setNormIds(java.lang.String normIds) {
        this.normIds = normIds;
    }

    public java.lang.String getNormIds() {
        return this.normIds;
    }
    public void setNormName(java.lang.String normName) {
        this.normName = normName;
    }

    public java.lang.String getNormName() {
        return this.normName;
    }
    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getState() {
        return this.state;
    }
    public void setIsTop(Integer isTop) {
        this.isTop = isTop;
    }

    public Integer getIsTop() {
        return this.isTop;
    }
    public void setUpTime(java.util.Date upTime) {
        this.upTime = upTime;
    }

    public java.util.Date getUpTime() {
        return this.upTime;
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
    public void setSellerId(java.lang.Integer sellerId) {
        this.sellerId = sellerId;
    }

    public java.lang.Integer getSellerId() {
        return this.sellerId;
    }
    public void setCreateId(java.lang.Integer createId) {
        this.createId = createId;
    }

    public java.lang.Integer getCreateId() {
        return this.createId;
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
    public void setSellerCateId(java.lang.Integer sellerCateId) {
        this.sellerCateId = sellerCateId;
    }

    public java.lang.Integer getSellerCateId() {
        return this.sellerCateId;
    }
    public void setSellerIsTop(Integer sellerIsTop) {
        this.sellerIsTop = sellerIsTop;
    }

    public Integer getSellerIsTop() {
        return this.sellerIsTop;
    }
    public void setSellerState(Integer sellerState) {
        this.sellerState = sellerState;
    }

    public Integer getSellerState() {
        return this.sellerState;
    }
    public void setCommentsNumber(java.lang.Integer commentsNumber) {
        this.commentsNumber = commentsNumber;
    }

    public java.lang.Integer getCommentsNumber() {
        return this.commentsNumber;
    }
    public void setProductCateState(Integer productCateState) {
        this.productCateState = productCateState;
    }

    public Integer getProductCateState() {
        return this.productCateState;
    }
    public void setIsInventedProduct(Integer isInventedProduct) {
        this.isInventedProduct = isInventedProduct;
    }

    public Integer getIsInventedProduct() {
        return this.isInventedProduct;
    }
    public void setTransportId(java.lang.Integer transportId) {
        this.transportId = transportId;
    }

    public java.lang.Integer getTransportId() {
        return this.transportId;
    }
    public void setMasterImg(java.lang.String masterImg) {
        this.masterImg = masterImg;
    }

    public java.lang.String getMasterImg() {
        return this.masterImg;
    }
    public void setProductCode(java.lang.String productCode) {
        this.productCode = productCode;
    }

    public java.lang.String getProductCode() {
        return this.productCode;
    }
    public void setSku(java.lang.String sku) {
        this.sku = sku;
    }

    public java.lang.String getSku() {
        return this.sku;
    }
	
	@Override
    public String toString() {
		return  "Id="  + id +";"+  "ProductCateId="  + productCateId +";"+  "Name1="  + name1 +";"+  "Name2="  + name2 +";"+  "Keyword="  + keyword +";"+  "ProductBrandId="  + productBrandId +";"+  "IsSelf="  + isSelf +";"+  "CostPrice="  + costPrice +";"+  "ProtectedPrice="  + protectedPrice +";"+  "MarketPrice="  + marketPrice +";"+  "MallPcPrice="  + mallPcPrice +";"+  "MalMobilePrice="  + malMobilePrice +";"+  "VirtualSales="  + virtualSales +";"+  "ActualSales="  + actualSales +";"+  "ProductStock="  + productStock +";"+  "IsNorm="  + isNorm +";"+  "NormIds="  + normIds +";"+  "NormName="  + normName +";"+  "State="  + state +";"+  "IsTop="  + isTop +";"+  "UpTime="  + upTime +";"+  "Description="  + description +";"+  "Packing="  + packing +";"+  "SellerId="  + sellerId +";"+  "CreateId="  + createId +";"+  "CreateTime="  + createTime +";"+  "UpdateTime="  + updateTime +";"+  "SellerCateId="  + sellerCateId +";"+  "SellerIsTop="  + sellerIsTop +";"+  "SellerState="  + sellerState +";"+  "CommentsNumber="  + commentsNumber +";"+  "ProductCateState="  + productCateState +";"+  "IsInventedProduct="  + isInventedProduct +";"+  "TransportId="  + transportId +";"+  "MasterImg="  + masterImg +";"+  "ProductCode="  + productCode +";"+  "Sku="  + sku ; 
    }
}