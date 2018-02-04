package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 订单操作日志表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:19
 */
public class OrderLog implements Serializable{

    private static final long serialVersionUID = 1L;

    private java.lang.Integer id;

    /** 操作人，系统操作为0 */
    private java.lang.Integer operatingId;

    private java.lang.String operatingName;

    private java.lang.Integer ordersId;

    private java.lang.String ordersSn;

    /** 内容 */
    private java.lang.String content;

    private java.util.Date createTime;


    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Integer getId() {
        return this.id;
    }
    public void setOperatingId(java.lang.Integer operatingId) {
        this.operatingId = operatingId;
    }

    public java.lang.Integer getOperatingId() {
        return this.operatingId;
    }
    public void setOperatingName(java.lang.String operatingName) {
        this.operatingName = operatingName;
    }

    public java.lang.String getOperatingName() {
        return this.operatingName;
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
    public void setContent(java.lang.String content) {
        this.content = content;
    }

    public java.lang.String getContent() {
        return this.content;
    }
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }
	
	@Override
    public String toString() {
		return  "Id="  + id +";"+  "OperatingId="  + operatingId +";"+  "OperatingName="  + operatingName +";"+  "OrdersId="  + ordersId +";"+  "OrdersSn="  + ordersSn +";"+  "Content="  + content +";"+  "CreateTime="  + createTime ; 
    }
}