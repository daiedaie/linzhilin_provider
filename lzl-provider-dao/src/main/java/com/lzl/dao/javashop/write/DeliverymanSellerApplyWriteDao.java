package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.DeliverymanSellerApply;
/**
 * 申请成为某个商户的配送员
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:17
 */
public interface DeliverymanSellerApplyWriteDao {
	
    Integer post(DeliverymanSellerApply deliverymanSellerApply);

    Integer put(DeliverymanSellerApply deliverymanSellerApply);

}