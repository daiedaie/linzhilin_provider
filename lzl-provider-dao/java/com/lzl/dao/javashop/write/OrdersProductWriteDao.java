package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.OrdersProduct;
/**
 * 订单商品表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:19
 */
public interface OrdersProductWriteDao {
	
    Integer post(OrdersProduct ordersProduct);

    Integer put(OrdersProduct ordersProduct);

}