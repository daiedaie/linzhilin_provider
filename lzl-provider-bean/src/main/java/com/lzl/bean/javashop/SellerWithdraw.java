package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 商家提现表(目前没有提现，等代码整理确认后，可以删除)
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:22
 */
public class SellerWithdraw implements Serializable{

    private static final long serialVersionUID = 1L;

    /** 流水号（提现主键) */
    private java.lang.Integer withdrawId;

    /** 商家id */
    private java.lang.Integer sellerId;

    /** 提现金额 */
    private Long withdrawAmount;

    /** 费率 */
    private java.lang.String rate;

    /** 实际到账金额（扣除费率的金额） */
    private Long realAmount;

    /** 银行卡号 */
    private java.lang.String bankCode;

    /** 银行卡附属信息（JSON字段） */
    private java.lang.String bankMore;

    /** 驳回说明（转账失败原因） */
    private java.lang.String errMessage;

    /** 状态：（1：提交审核,2：受理中，3：拒绝受理，4：转账成功，5：转账失败） */
    private Integer status;

    /** 申请时间（创建时间） */
    private java.util.Date createTime;

    /** 受理时间 */
    private java.util.Date acceptTime;

    /** 完成时间 */
    private java.util.Date finishTime;


    public void setWithdrawId(java.lang.Integer withdrawId) {
        this.withdrawId = withdrawId;
    }

    public java.lang.Integer getWithdrawId() {
        return this.withdrawId;
    }
    public void setSellerId(java.lang.Integer sellerId) {
        this.sellerId = sellerId;
    }

    public java.lang.Integer getSellerId() {
        return this.sellerId;
    }
    public void setWithdrawAmount(Long withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public Long getWithdrawAmount() {
        return this.withdrawAmount;
    }
    public void setRate(java.lang.String rate) {
        this.rate = rate;
    }

    public java.lang.String getRate() {
        return this.rate;
    }
    public void setRealAmount(Long realAmount) {
        this.realAmount = realAmount;
    }

    public Long getRealAmount() {
        return this.realAmount;
    }
    public void setBankCode(java.lang.String bankCode) {
        this.bankCode = bankCode;
    }

    public java.lang.String getBankCode() {
        return this.bankCode;
    }
    public void setBankMore(java.lang.String bankMore) {
        this.bankMore = bankMore;
    }

    public java.lang.String getBankMore() {
        return this.bankMore;
    }
    public void setErrMessage(java.lang.String errMessage) {
        this.errMessage = errMessage;
    }

    public java.lang.String getErrMessage() {
        return this.errMessage;
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
    public void setAcceptTime(java.util.Date acceptTime) {
        this.acceptTime = acceptTime;
    }

    public java.util.Date getAcceptTime() {
        return this.acceptTime;
    }
    public void setFinishTime(java.util.Date finishTime) {
        this.finishTime = finishTime;
    }

    public java.util.Date getFinishTime() {
        return this.finishTime;
    }
	
	@Override
    public String toString() {
		return  "WithdrawId="  + withdrawId +";"+  "SellerId="  + sellerId +";"+  "WithdrawAmount="  + withdrawAmount +";"+  "Rate="  + rate +";"+  "RealAmount="  + realAmount +";"+  "BankCode="  + bankCode +";"+  "BankMore="  + bankMore +";"+  "ErrMessage="  + errMessage +";"+  "Status="  + status +";"+  "CreateTime="  + createTime +";"+  "AcceptTime="  + acceptTime +";"+  "FinishTime="  + finishTime ; 
    }
}