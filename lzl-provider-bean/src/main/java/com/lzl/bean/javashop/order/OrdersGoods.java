package com.lzl.bean.javashop.order;

import java.io.Serializable;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-02-28 22:27:55
 */
public class OrdersGoods implements Serializable{

    private static final long serialVersionUID = 1L;

    private java.lang.Integer id;

    /** 订单ID */
    private java.lang.Integer ordersId;

    /** 订单号 */
    private java.lang.String ordersSn;

    /** 供应商id */
    private java.lang.Integer providerId;

    /** 商品图片 */
    private java.lang.String pic;

    /** 商品分类ID */
    private java.lang.Integer goodsCateId;

    /** 品牌id */
    private java.lang.Integer goodsBrandId;

    /** 商品id */
    private java.lang.Integer goodsId;

    /** 货品ID */
    private java.lang.Integer productGoodsId;

    /** 规格详情 */
    private java.lang.String specInfo;

    /** 商品名称 */
    private java.lang.String goodsName;

    /** 抽象商品sku */
    private java.lang.String goodsSku;

    /** 是否是赠品，0、不是；1、是； */
    private java.lang.Boolean isGift;

    /** 赠品ID 0:不是赠品；大于0：是赠品，存赠品的ID */
    private java.lang.Integer giftId;

    /** 商品单价(打完折的) */
    private Long moneyPrice;

    /** 商品数量 */
    private java.lang.Integer number;

    /** 商家ID */
    private java.lang.Integer sellerId;

    /** 促销套装0、不是促销套装；大于0，促销套装ID，价格是促销套装的ID */
    private java.lang.Integer packageGroupsId;

    /** 商城套装0，不是上次套装；大于0商城套装ID */
    private java.lang.Integer mallGroupsId;

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
    private java.lang.Boolean status;

    private java.util.Date createTime;

    private java.util.Date updateTime;

    //*******************额外属性***********************
    private Boolean _checked = false;
    private String idsStr;
    
    private String barCode;
    private Long taxMoney;
    private Long expressMoney;
    
    
    public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public Long getTaxMoney() {
		return taxMoney;
	}

	public void setTaxMoney(Long taxMoney) {
		this.taxMoney = taxMoney;
	}

	public Long getExpressMoney() {
		return expressMoney;
	}

	public void setExpressMoney(Long expressMoney) {
		this.expressMoney = expressMoney;
	}

	public String getIdsStr() {
		return idsStr;
	}

	public void setIdsStr(String idsStr) {
		this.idsStr = idsStr;
	}

	public Boolean get_checked() {
		return _checked;
	}

	public void set_checked(Boolean _checked) {
		this._checked = _checked;
	}

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
    public void setProviderId(java.lang.Integer providerId) {
        this.providerId = providerId;
    }

    public java.lang.Integer getProviderId() {
        return this.providerId;
    }
    public void setPic(java.lang.String pic) {
        this.pic = pic;
    }

    public java.lang.String getPic() {
        return this.pic;
    }
    public void setGoodsCateId(java.lang.Integer goodsCateId) {
        this.goodsCateId = goodsCateId;
    }

    public java.lang.Integer getGoodsCateId() {
        return this.goodsCateId;
    }
    public void setGoodsBrandId(java.lang.Integer goodsBrandId) {
        this.goodsBrandId = goodsBrandId;
    }

    public java.lang.Integer getGoodsBrandId() {
        return this.goodsBrandId;
    }
    public void setGoodsId(java.lang.Integer goodsId) {
        this.goodsId = goodsId;
    }

    public java.lang.Integer getGoodsId() {
        return this.goodsId;
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
    public void setGoodsName(java.lang.String goodsName) {
        this.goodsName = goodsName;
    }

    public java.lang.String getGoodsName() {
        return this.goodsName;
    }
    public void setGoodsSku(java.lang.String goodsSku) {
        this.goodsSku = goodsSku;
    }

    public java.lang.String getGoodsSku() {
        return this.goodsSku;
    }
    public void setIsGift(java.lang.Boolean isGift) {
        this.isGift = isGift;
    }

    public java.lang.Boolean getIsGift() {
        return this.isGift;
    }
    public void setGiftId(java.lang.Integer giftId) {
        this.giftId = giftId;
    }

    public java.lang.Integer getGiftId() {
        return this.giftId;
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
    public void setSellerId(java.lang.Integer sellerId) {
        this.sellerId = sellerId;
    }

    public java.lang.Integer getSellerId() {
        return this.sellerId;
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
    public void setStatus(java.lang.Boolean status) {
        this.status = status;
    }

    public java.lang.Boolean getStatus() {
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
		return  "Id="  + id +";"+  "OrdersId="  + ordersId +";"+  "OrdersSn="  + ordersSn +";"+  "ProviderId="  + providerId +";"+  "Pic="  + pic +";"+  "GoodsCateId="  + goodsCateId +";"+  "GoodsBrandId="  + goodsBrandId +";"+  "GoodsId="  + goodsId +";"+  "ProductGoodsId="  + productGoodsId +";"+  "SpecInfo="  + specInfo +";"+  "GoodsName="  + goodsName +";"+  "GoodsSku="  + goodsSku +";"+  "IsGift="  + isGift +";"+  "GiftId="  + giftId +";"+  "MoneyPrice="  + moneyPrice +";"+  "Number="  + number +";"+  "SellerId="  + sellerId +";"+  "PackageGroupsId="  + packageGroupsId +";"+  "MallGroupsId="  + mallGroupsId +";"+  "MoneyAmount="  + moneyAmount +";"+  "MoneyActSingle="  + moneyActSingle +";"+  "ActSingleId="  + actSingleId +";"+  "ActivityId="  + activityId +";"+  "ActFlashSaleId="  + actFlashSaleId +";"+  "ActFlashSaleProductId="  + actFlashSaleProductId +";"+  "LogisticsId="  + logisticsId +";"+  "LogisticsName="  + logisticsName +";"+  "LogisticsNumber="  + logisticsNumber +";"+  "ShippingTime="  + shippingTime +";"+  "CloseTime="  + closeTime +";"+  "SystemRemark="  + systemRemark +";"+  "MemberProductBackId="  + memberProductBackId +";"+  "MemberProductExchangeId="  + memberProductExchangeId +";"+  "Status="  + status +";"+  "CreateTime="  + createTime +";"+  "UpdateTime="  + updateTime +  "_checked="  + _checked ; 
    }

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrdersGoods other = (OrdersGoods) obj;
		if (_checked == null) {
			if (other._checked != null)
				return false;
		} else if (!_checked.equals(other._checked))
			return false;
		if (actFlashSaleId == null) {
			if (other.actFlashSaleId != null)
				return false;
		} else if (!actFlashSaleId.equals(other.actFlashSaleId))
			return false;
		if (actFlashSaleProductId == null) {
			if (other.actFlashSaleProductId != null)
				return false;
		} else if (!actFlashSaleProductId.equals(other.actFlashSaleProductId))
			return false;
		if (actSingleId == null) {
			if (other.actSingleId != null)
				return false;
		} else if (!actSingleId.equals(other.actSingleId))
			return false;
		if (activityId == null) {
			if (other.activityId != null)
				return false;
		} else if (!activityId.equals(other.activityId))
			return false;
		if (closeTime == null) {
			if (other.closeTime != null)
				return false;
		} else if (!closeTime.equals(other.closeTime))
			return false;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (giftId == null) {
			if (other.giftId != null)
				return false;
		} else if (!giftId.equals(other.giftId))
			return false;
		if (goodsBrandId == null) {
			if (other.goodsBrandId != null)
				return false;
		} else if (!goodsBrandId.equals(other.goodsBrandId))
			return false;
		if (goodsCateId == null) {
			if (other.goodsCateId != null)
				return false;
		} else if (!goodsCateId.equals(other.goodsCateId))
			return false;
		if (goodsId == null) {
			if (other.goodsId != null)
				return false;
		} else if (!goodsId.equals(other.goodsId))
			return false;
		if (goodsName == null) {
			if (other.goodsName != null)
				return false;
		} else if (!goodsName.equals(other.goodsName))
			return false;
		if (goodsSku == null) {
			if (other.goodsSku != null)
				return false;
		} else if (!goodsSku.equals(other.goodsSku))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (idsStr == null) {
			if (other.idsStr != null)
				return false;
		} else if (!idsStr.equals(other.idsStr))
			return false;
		if (isGift == null) {
			if (other.isGift != null)
				return false;
		} else if (!isGift.equals(other.isGift))
			return false;
		if (logisticsId == null) {
			if (other.logisticsId != null)
				return false;
		} else if (!logisticsId.equals(other.logisticsId))
			return false;
		if (logisticsName == null) {
			if (other.logisticsName != null)
				return false;
		} else if (!logisticsName.equals(other.logisticsName))
			return false;
		if (logisticsNumber == null) {
			if (other.logisticsNumber != null)
				return false;
		} else if (!logisticsNumber.equals(other.logisticsNumber))
			return false;
		if (mallGroupsId == null) {
			if (other.mallGroupsId != null)
				return false;
		} else if (!mallGroupsId.equals(other.mallGroupsId))
			return false;
		if (memberProductBackId == null) {
			if (other.memberProductBackId != null)
				return false;
		} else if (!memberProductBackId.equals(other.memberProductBackId))
			return false;
		if (memberProductExchangeId == null) {
			if (other.memberProductExchangeId != null)
				return false;
		} else if (!memberProductExchangeId.equals(other.memberProductExchangeId))
			return false;
		if (moneyActSingle == null) {
			if (other.moneyActSingle != null)
				return false;
		} else if (!moneyActSingle.equals(other.moneyActSingle))
			return false;
		if (moneyAmount == null) {
			if (other.moneyAmount != null)
				return false;
		} else if (!moneyAmount.equals(other.moneyAmount))
			return false;
		if (moneyPrice == null) {
			if (other.moneyPrice != null)
				return false;
		} else if (!moneyPrice.equals(other.moneyPrice))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		if (ordersId == null) {
			if (other.ordersId != null)
				return false;
		} else if (!ordersId.equals(other.ordersId))
			return false;
		if (ordersSn == null) {
			if (other.ordersSn != null)
				return false;
		} else if (!ordersSn.equals(other.ordersSn))
			return false;
		if (packageGroupsId == null) {
			if (other.packageGroupsId != null)
				return false;
		} else if (!packageGroupsId.equals(other.packageGroupsId))
			return false;
		if (pic == null) {
			if (other.pic != null)
				return false;
		} else if (!pic.equals(other.pic))
			return false;
		if (productGoodsId == null) {
			if (other.productGoodsId != null)
				return false;
		} else if (!productGoodsId.equals(other.productGoodsId))
			return false;
		if (providerId == null) {
			if (other.providerId != null)
				return false;
		} else if (!providerId.equals(other.providerId))
			return false;
		if (sellerId == null) {
			if (other.sellerId != null)
				return false;
		} else if (!sellerId.equals(other.sellerId))
			return false;
		if (shippingTime == null) {
			if (other.shippingTime != null)
				return false;
		} else if (!shippingTime.equals(other.shippingTime))
			return false;
		if (specInfo == null) {
			if (other.specInfo != null)
				return false;
		} else if (!specInfo.equals(other.specInfo))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (systemRemark == null) {
			if (other.systemRemark != null)
				return false;
		} else if (!systemRemark.equals(other.systemRemark))
			return false;
		if (updateTime == null) {
			if (other.updateTime != null)
				return false;
		} else if (!updateTime.equals(other.updateTime))
			return false;
		return true;
	}

	
	
}