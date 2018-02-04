package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 商家表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:21
 */
public class Seller implements Serializable{

    private static final long serialVersionUID = 1L;

    private java.lang.Integer id;

    /** 用户ID */
    private java.lang.Integer memberId;

    /** 用户名 */
    private java.lang.String name;

    /** 店铺名称 */
    private java.lang.String sellerName;

    /** 店铺logo */
    private java.lang.String sellerLogo;

    /** 店铺等级 */
    private java.lang.Integer sellerGrade;

    /** 店铺评分服务 */
    private java.lang.String scoreService;

    /** 店铺评分发货 */
    private java.lang.String scoreDeliverGoods;

    /** 店铺评分描述 */
    private java.lang.String scoreDescription;

    /** 商品数量 */
    private java.lang.Integer productNumber;

    /** 店铺收藏 */
    private java.lang.Integer collectionNumber;

    /** 创建时间 */
    private java.util.Date createTime;

    /** 店铺总销售金额 */
    private Double saleMoney;

    /** 店铺总订单量 */
    private java.lang.Integer orderCount;

    /** 店铺完成订单量 */
    private java.lang.Integer orderCountOver;

    /** SEO关键字 */
    private java.lang.String sellerKeyword;

    /** SEO店铺描述 */
    private java.lang.String sellerDes;

    /** 审核状态 1、待审核；2、审核通过；3、冻结 */
    private Integer auditStatus;

    /** 店铺轮播图  */
    private java.lang.String storeSlide;

    /** 店铺二维码 */
    private java.lang.String qrcode;

    /** 商户配送时间，分上下午时段，时间点以逗号分隔，时间段以分号分隔 */
    private java.lang.String deliveryTime;

    /** 1:支持配送 2：不支持配送 */
    private Integer isDelivery;

    /** 满多少免配送费用 */
    private Double initialFee;

    /** 废弃 */
    private Double deliveryFee;

    /** 配送单基础配送费 */
    private Double initialDeliveryFee;

    /** 一键推送时间 */
    private java.util.Date pushTime;

    /** 微信openId */
    private java.lang.String openId;

    /** 支付宝账号 */
    private java.lang.String alipay;

    /** 支付宝账号对应真实姓名 */
    private java.lang.String alipayName;


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
    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getName() {
        return this.name;
    }
    public void setSellerName(java.lang.String sellerName) {
        this.sellerName = sellerName;
    }

    public java.lang.String getSellerName() {
        return this.sellerName;
    }
    public void setSellerLogo(java.lang.String sellerLogo) {
        this.sellerLogo = sellerLogo;
    }

    public java.lang.String getSellerLogo() {
        return this.sellerLogo;
    }
    public void setSellerGrade(java.lang.Integer sellerGrade) {
        this.sellerGrade = sellerGrade;
    }

    public java.lang.Integer getSellerGrade() {
        return this.sellerGrade;
    }
    public void setScoreService(java.lang.String scoreService) {
        this.scoreService = scoreService;
    }

    public java.lang.String getScoreService() {
        return this.scoreService;
    }
    public void setScoreDeliverGoods(java.lang.String scoreDeliverGoods) {
        this.scoreDeliverGoods = scoreDeliverGoods;
    }

    public java.lang.String getScoreDeliverGoods() {
        return this.scoreDeliverGoods;
    }
    public void setScoreDescription(java.lang.String scoreDescription) {
        this.scoreDescription = scoreDescription;
    }

    public java.lang.String getScoreDescription() {
        return this.scoreDescription;
    }
    public void setProductNumber(java.lang.Integer productNumber) {
        this.productNumber = productNumber;
    }

    public java.lang.Integer getProductNumber() {
        return this.productNumber;
    }
    public void setCollectionNumber(java.lang.Integer collectionNumber) {
        this.collectionNumber = collectionNumber;
    }

    public java.lang.Integer getCollectionNumber() {
        return this.collectionNumber;
    }
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }
    public void setSaleMoney(Double saleMoney) {
        this.saleMoney = saleMoney;
    }

    public Double getSaleMoney() {
        return this.saleMoney;
    }
    public void setOrderCount(java.lang.Integer orderCount) {
        this.orderCount = orderCount;
    }

    public java.lang.Integer getOrderCount() {
        return this.orderCount;
    }
    public void setOrderCountOver(java.lang.Integer orderCountOver) {
        this.orderCountOver = orderCountOver;
    }

    public java.lang.Integer getOrderCountOver() {
        return this.orderCountOver;
    }
    public void setSellerKeyword(java.lang.String sellerKeyword) {
        this.sellerKeyword = sellerKeyword;
    }

    public java.lang.String getSellerKeyword() {
        return this.sellerKeyword;
    }
    public void setSellerDes(java.lang.String sellerDes) {
        this.sellerDes = sellerDes;
    }

    public java.lang.String getSellerDes() {
        return this.sellerDes;
    }
    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public Integer getAuditStatus() {
        return this.auditStatus;
    }
    public void setStoreSlide(java.lang.String storeSlide) {
        this.storeSlide = storeSlide;
    }

    public java.lang.String getStoreSlide() {
        return this.storeSlide;
    }
    public void setQrcode(java.lang.String qrcode) {
        this.qrcode = qrcode;
    }

    public java.lang.String getQrcode() {
        return this.qrcode;
    }
    public void setDeliveryTime(java.lang.String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public java.lang.String getDeliveryTime() {
        return this.deliveryTime;
    }
    public void setIsDelivery(Integer isDelivery) {
        this.isDelivery = isDelivery;
    }

    public Integer getIsDelivery() {
        return this.isDelivery;
    }
    public void setInitialFee(Double initialFee) {
        this.initialFee = initialFee;
    }

    public Double getInitialFee() {
        return this.initialFee;
    }
    public void setDeliveryFee(Double deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public Double getDeliveryFee() {
        return this.deliveryFee;
    }
    public void setInitialDeliveryFee(Double initialDeliveryFee) {
        this.initialDeliveryFee = initialDeliveryFee;
    }

    public Double getInitialDeliveryFee() {
        return this.initialDeliveryFee;
    }
    public void setPushTime(java.util.Date pushTime) {
        this.pushTime = pushTime;
    }

    public java.util.Date getPushTime() {
        return this.pushTime;
    }
    public void setOpenId(java.lang.String openId) {
        this.openId = openId;
    }

    public java.lang.String getOpenId() {
        return this.openId;
    }
    public void setAlipay(java.lang.String alipay) {
        this.alipay = alipay;
    }

    public java.lang.String getAlipay() {
        return this.alipay;
    }
    public void setAlipayName(java.lang.String alipayName) {
        this.alipayName = alipayName;
    }

    public java.lang.String getAlipayName() {
        return this.alipayName;
    }
	
	@Override
    public String toString() {
		return  "Id="  + id +";"+  "MemberId="  + memberId +";"+  "Name="  + name +";"+  "SellerName="  + sellerName +";"+  "SellerLogo="  + sellerLogo +";"+  "SellerGrade="  + sellerGrade +";"+  "ScoreService="  + scoreService +";"+  "ScoreDeliverGoods="  + scoreDeliverGoods +";"+  "ScoreDescription="  + scoreDescription +";"+  "ProductNumber="  + productNumber +";"+  "CollectionNumber="  + collectionNumber +";"+  "CreateTime="  + createTime +";"+  "SaleMoney="  + saleMoney +";"+  "OrderCount="  + orderCount +";"+  "OrderCountOver="  + orderCountOver +";"+  "SellerKeyword="  + sellerKeyword +";"+  "SellerDes="  + sellerDes +";"+  "AuditStatus="  + auditStatus +";"+  "StoreSlide="  + storeSlide +";"+  "Qrcode="  + qrcode +";"+  "DeliveryTime="  + deliveryTime +";"+  "IsDelivery="  + isDelivery +";"+  "InitialFee="  + initialFee +";"+  "DeliveryFee="  + deliveryFee +";"+  "InitialDeliveryFee="  + initialDeliveryFee +";"+  "PushTime="  + pushTime +";"+  "OpenId="  + openId +";"+  "Alipay="  + alipay +";"+  "AlipayName="  + alipayName ; 
    }
}