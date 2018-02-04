package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 供应商表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:22
 */
public class Supplier implements Serializable{

    private static final long serialVersionUID = 1L;

    private java.lang.Integer id;

    /** 用户ID */
    private java.lang.Integer memberId;

    /** 用户名 */
    private java.lang.String name;

    /** 店铺名称 */
    private java.lang.String supplierName;

    /** 店铺logo */
    private java.lang.String supplierLogo;

    /** 店铺等级 */
    private java.lang.Integer supplierGrade;

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
    private Long saleMoney;

    /** 店铺总订单量 */
    private java.lang.Integer orderCount;

    /** 店铺完成订单量 */
    private java.lang.Integer orderCountOver;

    /** SEO关键字 */
    private java.lang.String supplierKeyword;

    /** SEO店铺描述 */
    private java.lang.String supplierDes;

    /** 审核状态 1、待审核；2、审核通过；3、冻结 */
    private Integer auditStatus;

    /** 店铺轮播图  */
    private java.lang.String storeSlide;


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
    public void setSupplierName(java.lang.String supplierName) {
        this.supplierName = supplierName;
    }

    public java.lang.String getSupplierName() {
        return this.supplierName;
    }
    public void setSupplierLogo(java.lang.String supplierLogo) {
        this.supplierLogo = supplierLogo;
    }

    public java.lang.String getSupplierLogo() {
        return this.supplierLogo;
    }
    public void setSupplierGrade(java.lang.Integer supplierGrade) {
        this.supplierGrade = supplierGrade;
    }

    public java.lang.Integer getSupplierGrade() {
        return this.supplierGrade;
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
    public void setSaleMoney(Long saleMoney) {
        this.saleMoney = saleMoney;
    }

    public Long getSaleMoney() {
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
    public void setSupplierKeyword(java.lang.String supplierKeyword) {
        this.supplierKeyword = supplierKeyword;
    }

    public java.lang.String getSupplierKeyword() {
        return this.supplierKeyword;
    }
    public void setSupplierDes(java.lang.String supplierDes) {
        this.supplierDes = supplierDes;
    }

    public java.lang.String getSupplierDes() {
        return this.supplierDes;
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
	
	@Override
    public String toString() {
		return  "Id="  + id +";"+  "MemberId="  + memberId +";"+  "Name="  + name +";"+  "SupplierName="  + supplierName +";"+  "SupplierLogo="  + supplierLogo +";"+  "SupplierGrade="  + supplierGrade +";"+  "ScoreService="  + scoreService +";"+  "ScoreDeliverGoods="  + scoreDeliverGoods +";"+  "ScoreDescription="  + scoreDescription +";"+  "ProductNumber="  + productNumber +";"+  "CollectionNumber="  + collectionNumber +";"+  "CreateTime="  + createTime +";"+  "SaleMoney="  + saleMoney +";"+  "OrderCount="  + orderCount +";"+  "OrderCountOver="  + orderCountOver +";"+  "SupplierKeyword="  + supplierKeyword +";"+  "SupplierDes="  + supplierDes +";"+  "AuditStatus="  + auditStatus +";"+  "StoreSlide="  + storeSlide ; 
    }
}