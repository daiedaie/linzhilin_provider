package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 商家微信转账申请记录
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:18
 */
public class LogTransfers implements Serializable{

    private static final long serialVersionUID = 1L;

    /** 转账id */
    private java.lang.String transfersId;

    /** 商家id */
    private java.lang.Integer sellerId;

    /** 转账订单金额 */
    private Long moneyOrder;

    /** 手续费 */
    private Long brokerage;

    /** 实际到账 */
    private Long moneyReal;

    /** 创建时间 */
    private java.util.Date createTime;


    public void setTransfersId(java.lang.String transfersId) {
        this.transfersId = transfersId;
    }

    public java.lang.String getTransfersId() {
        return this.transfersId;
    }
    public void setSellerId(java.lang.Integer sellerId) {
        this.sellerId = sellerId;
    }

    public java.lang.Integer getSellerId() {
        return this.sellerId;
    }
    public void setMoneyOrder(Long moneyOrder) {
        this.moneyOrder = moneyOrder;
    }

    public Long getMoneyOrder() {
        return this.moneyOrder;
    }
    public void setBrokerage(Long brokerage) {
        this.brokerage = brokerage;
    }

    public Long getBrokerage() {
        return this.brokerage;
    }
    public void setMoneyReal(Long moneyReal) {
        this.moneyReal = moneyReal;
    }

    public Long getMoneyReal() {
        return this.moneyReal;
    }
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }
	
	@Override
    public String toString() {
		return  "TransfersId="  + transfersId +";"+  "SellerId="  + sellerId +";"+  "MoneyOrder="  + moneyOrder +";"+  "Brokerage="  + brokerage +";"+  "MoneyReal="  + moneyReal +";"+  "CreateTime="  + createTime ; 
    }
}