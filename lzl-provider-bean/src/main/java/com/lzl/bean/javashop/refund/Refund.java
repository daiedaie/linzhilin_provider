package com.lzl.bean.javashop.refund;

import java.io.Serializable;

import org.jeecgframework.poi.excel.annotation.Excel;
import org.jeecgframework.poi.excel.annotation.ExcelTarget;

import com.fasterxml.jackson.annotation.JsonFormat;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-02-27 16:06:31
 */
@ExcelTarget("refund")
public class Refund implements Serializable{

    private static final long serialVersionUID = 1L;

    /** 序号 */
    private java.lang.Integer refundId;

    /** 服务类型 1.仅退款 2.仅退货 3.仅换货 4.退款退货 */
    @Excel(name = "服务类型", replace = { "仅退款_1", "仅退货_2", "仅换货_3", "退款退货_4" }, orderNum = "1")
    private Integer type;

    /** 订单编号 */
    @Excel(name = "订单编号", orderNum = "0")
    private java.lang.String orderSn;

    /** 商品金额 */
    @Excel(name = "商品金额", orderNum = "2")
    private Long goodsMoney;

    /** 税额 */
    @Excel(name = "税额", orderNum = "3")
    private Long taxMoney;

    /** 运费 */
    @Excel(name = "运费", orderNum = "4")
    private Long expressMoney;

    /** 退货运费 */
    @Excel(name = "退货运费", orderNum = "6")
    private Long refundExpressMoney;

    /** 实退金额 */
    @Excel(name = "实退金额", orderNum = "7")
    private Long moneyBack;

    /** 发票 : 0.不要发票  1.要发票 */
    @Excel(name = "有无发票", replace = { "有_1", "无_0" }, orderNum = "5")
    private Integer invoiceStatus;

    /** 退款方式：1、支付宝 2、微信 3、银行转账 4、现金 */
    @Excel(name = "退款方式", replace = { "支付宝_1", "微信_2", "银行转账_3", "现金_4" }, orderNum = "8")
    private Integer refundMode;

    /** 申请状态 : 1.已通过 2.待审核 3.待收款 4.待收货 5.已收货 6.已收款 7.待评价 8.已完成 9.申请驳回 */
    @Excel(name = "申请状态", replace = { "已通过_1", "待审核_2", "待收款_3", "待收货_4", "已收货_5", "已收款_6", "待评价_7", "已完成_8", "申请驳回_9" },orderNum = "9")
    private Integer applyStatus;

    /** 取货人 */
    @Excel(name = "取货人", orderNum = "10")
    private java.lang.String consignee;

    /** 申请时间 */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm",timezone="GMT+8")
    @Excel(name = "申请时间", format = "yyyy-MM-dd HH:mm:ss",orderNum = "16")
    private java.util.Date applyTime;

    /** 完成时间 */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm",timezone="GMT+8")
    @Excel(name = "完成时间", format = "yyyy-MM-dd HH:mm:ss",orderNum = "17")
    private java.util.Date finishTime;

    /** 备注 */
    @Excel(name = "备注", orderNum = "18")
    private java.lang.String remark;


    public void setRefundId(java.lang.Integer refundId) {
        this.refundId = refundId;
    }

    public java.lang.Integer getRefundId() {
        return this.refundId;
    }
    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return this.type;
    }

    public java.lang.String getOrderSn() {
		return orderSn;
	}

	public void setOrderSn(java.lang.String orderSn) {
		this.orderSn = orderSn;
	}

	public void setGoodsMoney(Long goodsMoney) {
        this.goodsMoney = goodsMoney;
    }

    public Long getGoodsMoney() {
        return this.goodsMoney;
    }
    public void setTaxMoney(Long taxMoney) {
        this.taxMoney = taxMoney;
    }

    public Long getTaxMoney() {
        return this.taxMoney;
    }
    public void setExpressMoney(Long expressMoney) {
        this.expressMoney = expressMoney;
    }

    public Long getExpressMoney() {
        return this.expressMoney;
    }
    public void setRefundExpressMoney(Long refundExpressMoney) {
        this.refundExpressMoney = refundExpressMoney;
    }

    public Long getRefundExpressMoney() {
        return this.refundExpressMoney;
    }
    public void setMoneyBack(Long moneyBack) {
        this.moneyBack = moneyBack;
    }

    public Long getMoneyBack() {
        return this.moneyBack;
    }
    public void setInvoiceStatus(Integer invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public Integer getInvoiceStatus() {
        return this.invoiceStatus;
    }
    public void setRefundMode(Integer refundMode) {
        this.refundMode = refundMode;
    }

    public Integer getRefundMode() {
        return this.refundMode;
    }
    public void setApplyStatus(Integer applyStatus) {
        this.applyStatus = applyStatus;
    }

    public Integer getApplyStatus() {
        return this.applyStatus;
    }
    public void setConsignee(java.lang.String consignee) {
        this.consignee = consignee;
    }

    public java.lang.String getConsignee() {
        return this.consignee;
    }
    public void setApplyTime(java.util.Date applyTime) {
        this.applyTime = applyTime;
    }

    public java.util.Date getApplyTime() {
        return this.applyTime;
    }
    public void setFinishTime(java.util.Date finishTime) {
        this.finishTime = finishTime;
    }

    public java.util.Date getFinishTime() {
        return this.finishTime;
    }
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    public java.lang.String getRemark() {
        return this.remark;
    }
	
	@Override
    public String toString() {
		return  "RefundId="  + refundId +";"+  "Type="  + type +";"+  "Code="  + orderSn +";"+  "GoodsMoney="  + goodsMoney +";"+  "TaxMoney="  + taxMoney +";"+  "ExpressMoney="  + expressMoney +";"+  "RefundExpressMoney="  + refundExpressMoney +";"+  "MoneyBack="  + moneyBack +";"+  "InvoiceStatus="  + invoiceStatus +";"+  "RefundMode="  + refundMode +";"+  "ApplyStatus="  + applyStatus +";"+  "Consignee="  + consignee +";"+  "ApplyTime="  + applyTime +";"+  "FinishTime="  + finishTime +";"+  "Remark="  + remark ; 
    }
}