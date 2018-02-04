package com.lzl.dao.javashop.read;

import java.util.List;
import java.util.Map;
import com.lzl.bean.javashop.OrderPayLog;
/**
 * 订单支付记录表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:19
 */
public interface OrderPayLogReadDao {
	
	OrderPayLog getById(Integer id);
	
	List<OrderPayLog> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);

}