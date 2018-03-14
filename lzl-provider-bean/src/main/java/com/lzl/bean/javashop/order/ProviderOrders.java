package com.lzl.bean.javashop.order;

import java.io.Serializable;
import java.util.List;

import org.jeecgframework.poi.excel.annotation.Excel;
import org.jeecgframework.poi.excel.annotation.ExcelTarget;

import com.fasterxml.jackson.annotation.JsonFormat;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-02-05 13:05:46
 */
@ExcelTarget("ProviderOrders")
public class ProviderOrders implements Serializable{

    private static final long serialVersionUID = 1L;

    private java.lang.Integer id;

    /** 订单号 */
    @Excel(name = "订单号", orderNum = "0")
    private java.lang.String orderSn;

    /** 订单类型：1、普通订单，2、限时抢购订单 */
    private Integer orderType;

    /** 关联订单编号 */
    private java.lang.String relationOrderSn;

    /** 商品金额，等于订单中所有的商品的单价乘以数量之和 */
    @Excel(name = "商品金额", orderNum = "1")
    private Long goodsMoney;

    /** 运费 */
    @Excel(name = "运费", orderNum = "2")
    private Long expressMoney;

    /** 税额 */
    @Excel(name = "税额", orderNum = "3")
    private Long taxMoney;

    /** 实付金额，等于商品总金额＋运费-优惠金额总额 */
    @Excel(name = "实付金额", orderNum = "4")
    private Long ordersMoney;

    /** 发票状态0、不要发票；1、要发票 */
    @Excel(name = "有无发票", replace = { "有_1", "无_0" }, orderNum = "5")
    private Integer invoiceStatus;

    /** 发票抬头 */
    private java.lang.String invoiceTitle;

    /** 发票类型（内容） */
    private java.lang.String invoiceType;

    /** 支付方式（付款要求）：1、全额支付 2、货到付款 3、分期支付 */
    @Excel(name = "支付方式", replace = { "全额支付_1", "货到付款_2", "分期支付_3" }, orderNum = "6")
    private Integer paymentName;

    /** 支付渠道：1、支付宝 2、微信 3、银行转账 4、现金 */
    @Excel(name = "支付渠道", replace = { "支付宝_1", "微信_2", "银行转账_3", "现金_4" }, orderNum = "7")
    private Integer paymentMode;

    /** 支付方式code */
    private java.lang.String paymentCode;

    /** 付款状态：0 买家未付款 1 买家已付款 */
    //@Excel(name = "付款状态", replace = { "未付款_0", "已付款_1" }, orderNum = "8")
    private Integer paymentStatus;

    /** 下单时间（付款时间） */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm",timezone="GMT+8")
    @Excel(name = "创建时间", format = "yyyy-MM-dd HH:mm:ss",orderNum = "9")
    private java.util.Date payTime;

    /** 发货时间 */
    @Excel(name = "发货时间", format = "yyyy-MM-dd HH:mm:ss",orderNum = "12")
    private java.util.Date deliverTime;

    /** 订单完成时间 */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm",timezone="GMT+8")
    @Excel(name = "完成时间", format = "yyyy-MM-dd HH:mm:ss",orderNum = "16")
    private java.util.Date finishTime;

    /** 订单修改时间 */
    private java.util.Date updateTime;

    /** 订单状态：1、未付款的订单；2、已付款待确认；3、已确认待发货；4、已发货待收货；5 已收货待评价 6、已完成的订单；7、取消的订单 */
    @Excel(name = "订单状态", replace = { "进行中_1", "进行中_2", "进行中_3", "进行中_4", "已完成_5", "已完成_6", "已取消_7" },orderNum = "17")
    private Integer orderStatus;

    /** 送货人 */
    @Excel(name = "送货人", orderNum = "18")
    private java.lang.String deliveryman;

    /** 商家ID */
    private java.lang.Integer sellerId;

    /** 商家name */
    @Excel(name = "商家名称", orderNum = "19")
    private java.lang.String sellerName;

    /** 供应商ID */
    private java.lang.Integer providerId;

    /** 订单备注 */
    @Excel(name = "订单备注", orderNum = "20")
    private java.lang.String remark;

    /** 余额账户支付总金额 */
    private Long moneyPaidBalance;

    /** 现金支付金额 */
    private Long moneyPaidReality;

    /** 优惠券优惠金额 */
    private Long moneyCoupon;

    /** 订单满减金额 */
    private Long moneyActFull;

    /** 优惠金额总额（满减、立减、优惠券等所有优惠额的和） */
    private Long moneyDiscount;

    /** 退款的金额，订单没有退款则为0 */
    private Long moneyBack;

    /** 积分换算金额 */
    private Long moneyIntegral;

    /** 订单使用的积分数量 */
    private java.lang.Integer integral;

    /** 优惠码ID */
    private java.lang.Integer couponUserId;

    /** 订单满减活动ID */
    private java.lang.Integer actFullId;

    /** ip */
    private java.lang.String ip;

    /** 收货人 */
    private java.lang.String name;

    /** Province */
    private java.lang.Integer provinceId;

    /** city */
    private java.lang.Integer cityId;

    /** area */
    private java.lang.Integer areaId;

    /** 市区组合 */
    private java.lang.String town;

    /** 详细地址 */
    private java.lang.String addressInfo;

    /** 门牌号 */
    private java.lang.String houseNo;

    /** 地点名称 */
    private java.lang.String houseName;

    private java.lang.String mobile;

    private java.lang.String email;

    /** 邮编 */
    private java.lang.String zipCode;

    /** 支付宝：支付宝转账流水； 微信：微信转账流水 */
    private java.lang.String tradeSn;

    /** 会员来源1、pc；2、H5；3、Android；4、IOS */
    private Integer source;

    /** 物流公司ID */
    private java.lang.Integer logisticsId;

    /** 物流公司 */
    private java.lang.String logisticsName;

    /** 发票快递单号 */
    private java.lang.String logisticsNumber;

    /** 是否转账成功,5表示转账成功 */
    private Integer isCodconfim;

    /** 货到付款确认人 */
    private java.lang.Integer codconfirmId;

    /** 货到付款确认Name */
    private java.lang.String codconfirmName;

    /** 货到付款确认时间 */
    private java.util.Date codconfirmTime;

    /** 货到付款确认备注 */
    private java.lang.String codconfirmRemark;

    /** 货到付款状态 0、非货到付款；1、待确认；2、确认通过可以发货；3、订单取消 */
    private Integer codconfirmState;

    private java.util.Date createTime;

    /** 用户所选配送时间 */
    private java.lang.String deliveryTime;

    /** 配送方式1:商户配送2:自提 */
    private java.lang.Integer deliveryType;

    /** 自提码,配送方式为2时必填,默认为0表示非自提 */
    private java.lang.Integer getCode;

    /** 提现主键 */
    private java.lang.Integer withdrawId;

    /** 1:未删除 2：已删除 */
    private Integer active;

    //***********额外属性***********************
    private List<OrdersGoods> ordersGoods;
    

    public List<OrdersGoods> getOrdersGoods() {
		return ordersGoods;
	}

	public void setOrdersGoods(List<OrdersGoods> ordersGoods) {
		this.ordersGoods = ordersGoods;
	}

	public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Integer getId() {
        return this.id;
    }
    public void setOrderSn(java.lang.String orderSn) {
        this.orderSn = orderSn;
    }

    public java.lang.String getOrderSn() {
        return this.orderSn;
    }
    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getOrderType() {
        return this.orderType;
    }
    public void setRelationOrderSn(java.lang.String relationOrderSn) {
        this.relationOrderSn = relationOrderSn;
    }

    public java.lang.String getRelationOrderSn() {
        return this.relationOrderSn;
    }
    public void setGoodsMoney(Long goodsMoney) {
        this.goodsMoney = goodsMoney;
    }

    public Long getGoodsMoney() {
        return this.goodsMoney;
    }
    public void setExpressMoney(Long expressMoney) {
        this.expressMoney = expressMoney;
    }

    public Long getExpressMoney() {
        return this.expressMoney;
    }
    public void setTaxMoney(Long taxMoney) {
        this.taxMoney = taxMoney;
    }

    public Long getTaxMoney() {
        return this.taxMoney;
    }
    public void setOrdersMoney(Long ordersMoney) {
        this.ordersMoney = ordersMoney;
    }

    public Long getOrdersMoney() {
        return this.ordersMoney;
    }
    public void setInvoiceStatus(Integer invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public Integer getInvoiceStatus() {
        return this.invoiceStatus;
    }
    public void setInvoiceTitle(java.lang.String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    public java.lang.String getInvoiceTitle() {
        return this.invoiceTitle;
    }
    public void setInvoiceType(java.lang.String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public java.lang.String getInvoiceType() {
        return this.invoiceType;
    }
    public void setPaymentName(Integer paymentName) {
        this.paymentName = paymentName;
    }

    public Integer getPaymentName() {
        return this.paymentName;
    }
    public void setPaymentMode(Integer paymentMode) {
        this.paymentMode = paymentMode;
    }

    public Integer getPaymentMode() {
        return this.paymentMode;
    }
    public void setPaymentCode(java.lang.String paymentCode) {
        this.paymentCode = paymentCode;
    }

    public java.lang.String getPaymentCode() {
        return this.paymentCode;
    }
    public void setPaymentStatus(Integer paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Integer getPaymentStatus() {
        return this.paymentStatus;
    }
    public void setPayTime(java.util.Date payTime) {
        this.payTime = payTime;
    }

    public java.util.Date getPayTime() {
        return this.payTime;
    }
    public void setDeliverTime(java.util.Date deliverTime) {
        this.deliverTime = deliverTime;
    }

    public java.util.Date getDeliverTime() {
        return this.deliverTime;
    }
    public void setFinishTime(java.util.Date finishTime) {
        this.finishTime = finishTime;
    }

    public java.util.Date getFinishTime() {
        return this.finishTime;
    }
    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getOrderStatus() {
        return this.orderStatus;
    }
    public void setDeliveryman(java.lang.String deliveryman) {
        this.deliveryman = deliveryman;
    }

    public java.lang.String getDeliveryman() {
        return this.deliveryman;
    }
    public void setSellerId(java.lang.Integer sellerId) {
        this.sellerId = sellerId;
    }

    public java.lang.Integer getSellerId() {
        return this.sellerId;
    }
    public void setSellerName(java.lang.String sellerName) {
        this.sellerName = sellerName;
    }

    public java.lang.String getSellerName() {
        return this.sellerName;
    }
    public void setProviderId(java.lang.Integer providerId) {
        this.providerId = providerId;
    }

    public java.lang.Integer getProviderId() {
        return this.providerId;
    }
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    public java.lang.String getRemark() {
        return this.remark;
    }
    public void setMoneyPaidBalance(Long moneyPaidBalance) {
        this.moneyPaidBalance = moneyPaidBalance;
    }

    public Long getMoneyPaidBalance() {
        return this.moneyPaidBalance;
    }
    public void setMoneyPaidReality(Long moneyPaidReality) {
        this.moneyPaidReality = moneyPaidReality;
    }

    public Long getMoneyPaidReality() {
        return this.moneyPaidReality;
    }
    public void setMoneyCoupon(Long moneyCoupon) {
        this.moneyCoupon = moneyCoupon;
    }

    public Long getMoneyCoupon() {
        return this.moneyCoupon;
    }
    public void setMoneyActFull(Long moneyActFull) {
        this.moneyActFull = moneyActFull;
    }

    public Long getMoneyActFull() {
        return this.moneyActFull;
    }
    public void setMoneyDiscount(Long moneyDiscount) {
        this.moneyDiscount = moneyDiscount;
    }

    public Long getMoneyDiscount() {
        return this.moneyDiscount;
    }
    public void setMoneyBack(Long moneyBack) {
        this.moneyBack = moneyBack;
    }

    public Long getMoneyBack() {
        return this.moneyBack;
    }
    public void setMoneyIntegral(Long moneyIntegral) {
        this.moneyIntegral = moneyIntegral;
    }

    public Long getMoneyIntegral() {
        return this.moneyIntegral;
    }
    public void setIntegral(java.lang.Integer integral) {
        this.integral = integral;
    }

    public java.lang.Integer getIntegral() {
        return this.integral;
    }
    public void setCouponUserId(java.lang.Integer couponUserId) {
        this.couponUserId = couponUserId;
    }

    public java.lang.Integer getCouponUserId() {
        return this.couponUserId;
    }
    public void setActFullId(java.lang.Integer actFullId) {
        this.actFullId = actFullId;
    }

    public java.lang.Integer getActFullId() {
        return this.actFullId;
    }
    public void setIp(java.lang.String ip) {
        this.ip = ip;
    }

    public java.lang.String getIp() {
        return this.ip;
    }
    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getName() {
        return this.name;
    }
    public void setProvinceId(java.lang.Integer provinceId) {
        this.provinceId = provinceId;
    }

    public java.lang.Integer getProvinceId() {
        return this.provinceId;
    }
    public void setCityId(java.lang.Integer cityId) {
        this.cityId = cityId;
    }

    public java.lang.Integer getCityId() {
        return this.cityId;
    }
    public void setAreaId(java.lang.Integer areaId) {
        this.areaId = areaId;
    }

    public java.lang.Integer getAreaId() {
        return this.areaId;
    }
    public void setTown(java.lang.String town) {
        this.town = town;
    }

    public java.lang.String getTown() {
        return this.town;
    }
    public void setAddressInfo(java.lang.String addressInfo) {
        this.addressInfo = addressInfo;
    }

    public java.lang.String getAddressInfo() {
        return this.addressInfo;
    }
    public void setHouseNo(java.lang.String houseNo) {
        this.houseNo = houseNo;
    }

    public java.lang.String getHouseNo() {
        return this.houseNo;
    }
    public void setHouseName(java.lang.String houseName) {
        this.houseName = houseName;
    }

    public java.lang.String getHouseName() {
        return this.houseName;
    }
    public void setMobile(java.lang.String mobile) {
        this.mobile = mobile;
    }

    public java.lang.String getMobile() {
        return this.mobile;
    }
    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    public java.lang.String getEmail() {
        return this.email;
    }
    public void setZipCode(java.lang.String zipCode) {
        this.zipCode = zipCode;
    }

    public java.lang.String getZipCode() {
        return this.zipCode;
    }
    public void setTradeSn(java.lang.String tradeSn) {
        this.tradeSn = tradeSn;
    }

    public java.lang.String getTradeSn() {
        return this.tradeSn;
    }
    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getSource() {
        return this.source;
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
    public void setIsCodconfim(Integer isCodconfim) {
        this.isCodconfim = isCodconfim;
    }

    public Integer getIsCodconfim() {
        return this.isCodconfim;
    }
    public void setCodconfirmId(java.lang.Integer codconfirmId) {
        this.codconfirmId = codconfirmId;
    }

    public java.lang.Integer getCodconfirmId() {
        return this.codconfirmId;
    }
    public void setCodconfirmName(java.lang.String codconfirmName) {
        this.codconfirmName = codconfirmName;
    }

    public java.lang.String getCodconfirmName() {
        return this.codconfirmName;
    }
    public void setCodconfirmTime(java.util.Date codconfirmTime) {
        this.codconfirmTime = codconfirmTime;
    }

    public java.util.Date getCodconfirmTime() {
        return this.codconfirmTime;
    }
    public void setCodconfirmRemark(java.lang.String codconfirmRemark) {
        this.codconfirmRemark = codconfirmRemark;
    }

    public java.lang.String getCodconfirmRemark() {
        return this.codconfirmRemark;
    }
    public void setCodconfirmState(Integer codconfirmState) {
        this.codconfirmState = codconfirmState;
    }

    public Integer getCodconfirmState() {
        return this.codconfirmState;
    }
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }
    public void setDeliveryTime(java.lang.String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public java.lang.String getDeliveryTime() {
        return this.deliveryTime;
    }
    public void setDeliveryType(java.lang.Integer deliveryType) {
        this.deliveryType = deliveryType;
    }

    public java.lang.Integer getDeliveryType() {
        return this.deliveryType;
    }
    public void setGetCode(java.lang.Integer getCode) {
        this.getCode = getCode;
    }

    public java.lang.Integer getGetCode() {
        return this.getCode;
    }
    public void setWithdrawId(java.lang.Integer withdrawId) {
        this.withdrawId = withdrawId;
    }

    public java.lang.Integer getWithdrawId() {
        return this.withdrawId;
    }
    public void setActive(Integer active) {
        this.active = active;
    }

    public Integer getActive() {
        return this.active;
    }
	
	@Override
    public String toString() {
		return  "Id="  + id +";"+  "OrderSn="  + orderSn +";"+  "OrderType="  + orderType +";"+  "RelationOrderSn="  + relationOrderSn +";"+  "GoodsMoney="  + goodsMoney +";"+  "ExpressMoney="  + expressMoney +";"+  "TaxMoney="  + taxMoney +";"+  "OrdersMoney="  + ordersMoney +";"+  "InvoiceStatus="  + invoiceStatus +";"+  "InvoiceTitle="  + invoiceTitle +";"+  "InvoiceType="  + invoiceType +";"+  "PaymentName="  + paymentName +";"+  "PaymentMode="  + paymentMode +";"+  "PaymentCode="  + paymentCode +";"+  "PaymentStatus="  + paymentStatus +";"+  "PayTime="  + payTime +";"+  "DeliverTime="  + deliverTime +";"+  "FinishTime="  + finishTime +";"+  "UpdateTime="  + updateTime +";"+  "OrderStatus="  + orderStatus +";"+  "Deliveryman="  + deliveryman +";"+  "SellerId="  + sellerId +";"+  "SellerName="  + sellerName +";"+  "ProviderId="  + providerId +";"+  "Remark="  + remark +";"+  "MoneyPaidBalance="  + moneyPaidBalance +";"+  "MoneyPaidReality="  + moneyPaidReality +";"+  "MoneyCoupon="  + moneyCoupon +";"+  "MoneyActFull="  + moneyActFull +";"+  "MoneyDiscount="  + moneyDiscount +";"+  "MoneyBack="  + moneyBack +";"+  "MoneyIntegral="  + moneyIntegral +";"+  "Integral="  + integral +";"+  "CouponUserId="  + couponUserId +";"+  "ActFullId="  + actFullId +";"+  "Ip="  + ip +";"+  "Name="  + name +";"+  "ProvinceId="  + provinceId +";"+  "CityId="  + cityId +";"+  "AreaId="  + areaId +";"+  "Town="  + town +";"+  "AddressInfo="  + addressInfo +";"+  "HouseNo="  + houseNo +";"+  "HouseName="  + houseName +";"+  "Mobile="  + mobile +";"+  "Email="  + email +";"+  "ZipCode="  + zipCode +";"+  "TradeSn="  + tradeSn +";"+  "Source="  + source +";"+  "LogisticsId="  + logisticsId +";"+  "LogisticsName="  + logisticsName +";"+  "LogisticsNumber="  + logisticsNumber +";"+  "IsCodconfim="  + isCodconfim +";"+  "CodconfirmId="  + codconfirmId +";"+  "CodconfirmName="  + codconfirmName +";"+  "CodconfirmTime="  + codconfirmTime +";"+  "CodconfirmRemark="  + codconfirmRemark +";"+  "CodconfirmState="  + codconfirmState +";"+  "CreateTime="  + createTime +";"+  "DeliveryTime="  + deliveryTime +";"+  "DeliveryType="  + deliveryType +";"+  "GetCode="  + getCode +";"+  "WithdrawId="  + withdrawId +";"+  "Active="  + active ; 
    }
}