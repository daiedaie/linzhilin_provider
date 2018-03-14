package com.lzl.dao.javashop.write.order;

import com.lzl.bean.javashop.order.OrdersGoods;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-02-28 22:27:55
 */
public interface OrdersGoodsWriteDao {
	/**新增*/
    Integer post(OrdersGoods ordersGoods);
	/**更新*/
    Integer put(OrdersGoods ordersGoods);

}