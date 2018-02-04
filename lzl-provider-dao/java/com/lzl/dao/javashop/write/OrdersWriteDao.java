package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.Orders;
/**
 * 订单
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:19
 */
public interface OrdersWriteDao {
	
    Integer post(Orders orders);

    Integer put(Orders orders);

}