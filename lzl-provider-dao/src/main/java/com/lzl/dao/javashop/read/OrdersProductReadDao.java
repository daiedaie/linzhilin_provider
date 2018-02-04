package com.lzl.dao.javashop.read;

import java.util.List;
import java.util.Map;
import com.lzl.bean.javashop.OrdersProduct;
/**
 * 订单商品表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:19
 */
public interface OrdersProductReadDao {
	
	OrdersProduct getById(Integer id);
	
	List<OrdersProduct> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);

}