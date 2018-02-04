package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 订单商品表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:19
 */
public class OrdersProduct implements Serializable{

    private static final long serialVersionUID = 1L;

    private java.lang.Integer id;

    /** 订单ID */
    private java.lang.Integer ordersId;

    /** 订单号 */
    private java.lang.String ordersSn;

    /** 商家ID */
    private java.lang.Integer sellerId;

    /** 供应商id */
    private java.lang.Integer supplierId;

    private java.lang.String pic;

    /** 商品分类ID */
    private java.lang.Integer productCateId;

    /** 品牌id */
    private java.lang.Integer productBrandId;

    /** 商品id */
    private java.lang.Integer productId;

    /** 货品ID */
    private java.lang.Integer productGoodsId;

    /** 规格详情 */
    private java.lang.String specInfo;

    /** 商品名称 */
    private java.lang.String productName;

    /** 抽象商品sku */
    private java.lang.String productSku;

    /** 促销套装0、不是促销套装；大于0，促销套装ID，价格是促销套装的ID */
    private java.lang.Integer packageGroupsId;

    /** 商城套装0，不是上次套装；大于0商城套装ID */
    private java.lang.Integer mallGroupsId;

    /** 赠品ID 0:不是赠品；大于0：是赠品，存赠品的ID */
    private java.lang.Integer giftId;

    /** 是否是赠品，0、不是；1、是； */
    private Integer isGift;

    /** 商品单价(打完折的) */
    private Long moneyPrice;

    /** 商品数量 */
    private java.lang.Integer number;

    /** 网单金额（减去立减优惠后的金额和） */
    private Long moneyAmount;

    /** 立减优惠金额和 */
    private Long moneyActSingle;

    /** 单品立减活动act_single_count的ID，无设置0 */
    private java.lang.Integer actSingleId;

    /** 团购ID，为0正常购买 */
    private java.lang.Integer activityId;

    /** 限时抢购ID，为0正常购买 */
    private java.lang.Integer actFlashSaleId;

    /** 限时抢购活动商品ID */
    private java.lang.Integer actFlashSaleProductId;

    /** 物流 */
    private java.lang.Integer logisticsId;

    /** 物流name */
    private java.lang.String logisticsName;

    /** 发票快递单号 */
    private java.lang.String logisticsNumber;

    /** 发货时间 */
    private java.util.Date shippingTime;

    /** 网单完成关闭或取消关闭时间 */
    private java.util.Date closeTime;

    /** 系统备注，不给用户显示 */
    private java.lang.String systemRemark;

    /** 退货ID，默认为0 */
    private java.lang.Integer memberProductBackId;

    /** 换货ID，默认为0 */
    private java.lang.Integer memberProductExchangeId;

    /** 1:未付款 2：商家已确认 5:已完成 */
    private Integer status;

    private java.util.Date createTime;

    private java.util.Date updateTime;


    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Integer getId() {
        return this.id;
    }
    public void setOrdersId(java.lang.Integer ordersId) {
        this.ordersId = ordersId;
    }

    public java.lang.Integer getOrdersId() {
        return this.ordersId;
    }
    public void setOrdersSn(java.lang.String ordersSn) {
        this.ordersSn = ordersSn;
    }

    public java.lang.String getOrdersSn() {
        return this.ordersSn;
    }
    public void setSellerId(java.lang.Integer sellerId) {
        this.sellerId = sellerId;
    }

    public java.lang.Integer getSellerId() {
        return this.sellerId;
    }
    public void setSupplierId(java.lang.Integer supplierId) {
        this.supplierId = supplierId;
    }

    public java.lang.Integer getSupplierId() {
        return this.supplierId;
    }
    public void setPic(java.lang.String pic) {
        this.pic = pic;
    }

    public java.lang.String getPic() {
        return this.pic;
    }
    public void setProductCateId(java.lang.Integer productCateId) {
        this.productCateId = productCateId;
    }

    public java.lang.Integer getProductCateId() {
        return this.productCateId;
    }
    public void setProductBrandId(java.lang.Integer productBrandId) {
        this.productBrandId = productBrandId;
    }

    public java.lang.Integer getProductBrandId() {
        return this.productBrandId;
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
    public void setSpecInfo(java.lang.String specInfo) {
        this.specInfo = specInfo;
    }

    public java.lang.String getSpecInfo() {
        return this.specInfo;
    }
    public void setProductName(java.lang.String productName) {
        this.productName = productName;
    }

    public java.lang.String getProductName() {
        return this.productName;
    }
    public void setProductSku(java.lang.String productSku) {
        this.productSku = productSku;
    }

    public java.lang.String getProductSku() {
        return this.productSku;
    }
    public void setPackageGroupsId(java.lang.Integer packageGroupsId) {
        this.packageGroupsId = packageGroupsId;
    }

    public java.lang.Integer getPackageGroupsId() {
        return this.packageGroupsId;
    }
    public void setMallGroupsId(java.lang.Integer mallGroupsId) {
        this.mallGroupsId = mallGroupsId;
    }

    public java.lang.Integer getMallGroupsId() {
        return this.mallGroupsId;
    }
    public void setGiftId(java.lang.Integer giftId) {
        this.giftId = giftId;
    }

    public java.lang.Integer getGiftId() {
        return this.giftId;
    }
    public void setIsGift(Integer isGift) {
        this.isGift = isGift;
    }

    public Integer getIsGift() {
        return this.isGift;
    }
    public void setMoneyPrice(Long moneyPrice) {
        this.moneyPrice = moneyPrice;
    }

    public Long getMoneyPrice() {
        return this.moneyPrice;
    }
    public void setNumber(java.lang.Integer number) {
        this.number = number;
    }

    public java.lang.Integer getNumber() {
        return this.number;
    }
    public void setMoneyAmount(Long moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public Long getMoneyAmount() {
        return this.moneyAmount;
    }
    public void setMoneyActSingle(Long moneyActSingle) {
        this.moneyActSingle = moneyActSingle;
    }

    public Long getMoneyActSingle() {
        return this.moneyActSingle;
    }
    public void setActSingleId(java.lang.Integer actSingleId) {
        this.actSingleId = actSingleId;
    }

    public java.lang.Integer getActSingleId() {
        return this.actSingleId;
    }
    public void setActivityId(java.lang.Integer activityId) {
        this.activityId = activityId;
    }

    public java.lang.Integer getActivityId() {
        return this.activityId;
    }
    public void setActFlashSaleId(java.lang.Integer actFlashSaleId) {
        this.actFlashSaleId = actFlashSaleId;
    }

    public java.lang.Integer getActFlashSaleId() {
        return this.actFlashSaleId;
    }
    public void setActFlashSaleProductId(java.lang.Integer actFlashSaleProductId) {
        this.actFlashSaleProductId = actFlashSaleProductId;
    }

    public java.lang.Integer getActFlashSaleProductId() {
        return this.actFlashSaleProductId;
    }
    public void setLogisticsId(java.lang.Integer logisticsId) {
        this.logisticsId = logisticsId;
    }

    public java.lang.Integer getLogisticsId() {
        return this.logisticsId;
    }
    public void setLogisticsName(java.lang.String logisticsName) {
        this.logisticsName = logisticsName;
    }

    public java.lang.String getLogisticsName() {
        return this.logisticsName;
    }
    public void setLogisticsNumber(java.lang.String logisticsNumber) {
        this.logisticsNumber = logisticsNumber;
    }

    public java.lang.String getLogisticsNumber() {
        return this.logisticsNumber;
    }
    public void setShippingTime(java.util.Date shippingTime) {
        this.shippingTime = shippingTime;
    }

    public java.util.Date getShippingTime() {
        return this.shippingTime;
    }
    public void setCloseTime(java.util.Date closeTime) {
        this.closeTime = closeTime;
    }

    public java.util.Date getCloseTime() {
        return this.closeTime;
    }
    public void setSystemRemark(java.lang.String systemRemark) {
        this.systemRemark = systemRemark;
    }

    public java.lang.String getSystemRemark() {
        return this.systemRemark;
    }
    public void setMemberProductBackId(java.lang.Integer memberProductBackId) {
        this.memberProductBackId = memberProductBackId;
    }

    public java.lang.Integer getMemberProductBackId() {
        return this.memberProductBackId;
    }
    public void setMemberProductExchangeId(java.lang.Integer memberProductExchangeId) {
        this.memberProductExchangeId = memberProductExchangeId;
    }

    public java.lang.Integer getMemberProductExchangeId() {
        return this.memberProductExchangeId;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return this.status;
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
	
	@Override
    public String toString() {
		return  "Id="  + id +";"+  "OrdersId="  + ordersId +";"+  "OrdersSn="  + ordersSn +";"+  "SellerId="  + sellerId +";"+  "SupplierId="  + supplierId +";"+  "Pic="  + pic +";"+  "ProductCateId="  + productCateId +";"+  "ProductBrandId="  + productBrandId +";"+  "ProductId="  + productId +";"+  "ProductGoodsId="  + productGoodsId +";"+  "SpecInfo="  + specInfo +";"+  "ProductName="  + productName +";"+  "ProductSku="  + productSku +";"+  "PackageGroupsId="  + packageGroupsId +";"+  "MallGroupsId="  + mallGroupsId +";"+  "GiftId="  + giftId +";"+  "IsGift="  + isGift +";"+  "MoneyPrice="  + moneyPrice +";"+  "Number="  + number +";"+  "MoneyAmount="  + moneyAmount +";"+  "MoneyActSingle="  + moneyActSingle +";"+  "ActSingleId="  + actSingleId +";"+  "ActivityId="  + activityId +";"+  "ActFlashSaleId="  + actFlashSaleId +";"+  "ActFlashSaleProductId="  + actFlashSaleProductId +";"+  "LogisticsId="  + logisticsId +";"+  "LogisticsName="  + logisticsName +";"+  "LogisticsNumber="  + logisticsNumber +";"+  "ShippingTime="  + shippingTime +";"+  "CloseTime="  + closeTime +";"+  "SystemRemark="  + systemRemark +";"+  "MemberProductBackId="  + memberProductBackId +";"+  "MemberProductExchangeId="  + memberProductExchangeId +";"+  "Status="  + status +";"+  "CreateTime="  + createTime +";"+  "UpdateTime="  + updateTime ; 
    }
}