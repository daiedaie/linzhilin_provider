package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.OrderPayLog;
/**
 * 订单支付记录表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:19
 */
public interface OrderPayLogWriteDao {
	
    Integer post(OrderPayLog orderPayLog);

    Integer put(OrderPayLog orderPayLog);

}