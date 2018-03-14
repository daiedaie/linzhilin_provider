package com.lzl.dao.javashop.read.order;

import java.util.List;
import java.util.Map;

import com.lzl.bean.javashop.order.OrdersGoods;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-02-28 22:27:55
 */
public interface OrdersGoodsReadDao {
	/**通过id查询*/
	OrdersGoods getById(Integer id);
	/**查询列表*/
	List<OrdersGoods> get(Map<String, Object> queryMap);
	/**查询列表，不进行分页*/
	List<OrdersGoods> getAllList(Map<String, Object> queryMap);
	/**查询数量*/
	Integer getCount(Map<String, Object> queryMap);
	/**
	 * 根据前台传来的ids，获取选中的OrdersGoods
	 * @param query
	 * @return
	 */
	List<OrdersGoods> getSelectedOrdersGoodsList(Map<String, Object> query);

}