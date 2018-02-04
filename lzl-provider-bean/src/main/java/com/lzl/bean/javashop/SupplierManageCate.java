package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 供应商可以经营商品分类表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:23
 */
public class SupplierManageCate implements Serializable{

    private static final long serialVersionUID = 1L;

    private java.lang.Integer id;

    /** 商家id */
    private java.lang.Integer supplier;

    /** 申请人 */
    private java.lang.Integer createId;

    /** 申请时间 */
    private java.util.Date createTime;

    /** 申请分类id */
    private java.lang.Integer productCateId;

    /** 申请分类名称,提交类目组合 */
    private java.lang.String productCateName;

    /** 0-默认;1-提交审核;2-审核通过;3-审核失败;4-停用 */
    private Integer state;

    /** 审核人 */
    private java.lang.Integer optId;

    /** 审核时间 */
    private java.util.Date optTime;

    /** 停用人 */
    private java.lang.Integer stopId;

    /** 停用时间 */
    private java.util.Date stopTime;

    /** 停用原由 */
    private java.lang.String stopReason;


    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Integer getId() {
        return this.id;
    }
    public void setSupplier(java.lang.Integer supplier) {
        this.supplier = supplier;
    }

    public java.lang.Integer getSupplier() {
        return this.supplier;
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
    public void setProductCateId(java.lang.Integer productCateId) {
        this.productCateId = productCateId;
    }

    public java.lang.Integer getProductCateId() {
        return this.productCateId;
    }
    public void setProductCateName(java.lang.String productCateName) {
        this.productCateName = productCateName;
    }

    public java.lang.String getProductCateName() {
        return this.productCateName;
    }
    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getState() {
        return this.state;
    }
    public void setOptId(java.lang.Integer optId) {
        this.optId = optId;
    }

    public java.lang.Integer getOptId() {
        return this.optId;
    }
    public void setOptTime(java.util.Date optTime) {
        this.optTime = optTime;
    }

    public java.util.Date getOptTime() {
        return this.optTime;
    }
    public void setStopId(java.lang.Integer stopId) {
        this.stopId = stopId;
    }

    public java.lang.Integer getStopId() {
        return this.stopId;
    }
    public void setStopTime(java.util.Date stopTime) {
        this.stopTime = stopTime;
    }

    public java.util.Date getStopTime() {
        return this.stopTime;
    }
    public void setStopReason(java.lang.String stopReason) {
        this.stopReason = stopReason;
    }

    public java.lang.String getStopReason() {
        return this.stopReason;
    }
	
	@Override
    public String toString() {
		return  "Id="  + id +";"+  "Supplier="  + supplier +";"+  "CreateId="  + createId +";"+  "CreateTime="  + createTime +";"+  "ProductCateId="  + productCateId +";"+  "ProductCateName="  + productCateName +";"+  "State="  + state +";"+  "OptId="  + optId +";"+  "OptTime="  + optTime +";"+  "StopId="  + stopId +";"+  "StopTime="  + stopTime +";"+  "StopReason="  + stopReason ; 
    }
}