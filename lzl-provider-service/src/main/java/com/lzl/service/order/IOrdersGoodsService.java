package com.lzl.service.order;

import java.util.List;
import java.util.Map;
import com.lzl.common.Pager;
import com.lzl.bean.javashop.order.OrdersGoods;

/**
 * 描述：OrdersGoods 服务实现层接口
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-02-28 22:27:55
 */
public interface IOrdersGoodsService {
	/**列表查询*/
	List<OrdersGoods> get(Map<String, Object> queryMap, Pager pager)throws Exception;
	/**新增*/
    Boolean post(OrdersGoods ordersGoods) throws Exception;
	/**更新*/
    Boolean put(OrdersGoods ordersGoods) throws Exception;

}
