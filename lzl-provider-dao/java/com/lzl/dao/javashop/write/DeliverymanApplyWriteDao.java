package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.DeliverymanApply;
/**
 * 配送员申请表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:17
 */
public interface DeliverymanApplyWriteDao {
	
    Integer post(DeliverymanApply deliverymanApply);

    Integer put(DeliverymanApply deliverymanApply);

}