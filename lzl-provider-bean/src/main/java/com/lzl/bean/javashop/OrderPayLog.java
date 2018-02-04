package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 订单支付记录表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:19
 */
public class OrderPayLog implements Serializable{

    private static final long serialVersionUID = 1L;

    private java.lang.Integer id;

    private java.lang.Integer ordersId;

    private java.lang.String ordersSn;

    /** 支付方式 */
    private java.lang.String payStatus;

    /** 支付返回的代码 */
    private java.lang.String payContent;

    /** 支付金额 */
    private Long payMoney;

    private java.lang.Integer memberId;

    private java.lang.String memberName;

    /** 支付时间 */
    private java.util.Date createTime;


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
    public void setPayStatus(java.lang.String payStatus) {
        this.payStatus = payStatus;
    }

    public java.lang.String getPayStatus() {
        return this.payStatus;
    }
    public void setPayContent(java.lang.String payContent) {
        this.payContent = payContent;
    }

    public java.lang.String getPayContent() {
        return this.payContent;
    }
    public void setPayMoney(Long payMoney) {
        this.payMoney = payMoney;
    }

    public Long getPayMoney() {
        return this.payMoney;
    }
    public void setMemberId(java.lang.Integer memberId) {
        this.memberId = memberId;
    }

    public java.lang.Integer getMemberId() {
        return this.memberId;
    }
    public void setMemberName(java.lang.String memberName) {
        this.memberName = memberName;
    }

    public java.lang.String getMemberName() {
        return this.memberName;
    }
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }
	
	@Override
    public String toString() {
		return  "Id="  + id +";"+  "OrdersId="  + ordersId +";"+  "OrdersSn="  + ordersSn +";"+  "PayStatus="  + payStatus +";"+  "PayContent="  + payContent +";"+  "PayMoney="  + payMoney +";"+  "MemberId="  + memberId +";"+  "MemberName="  + memberName +";"+  "CreateTime="  + createTime ; 
    }
}