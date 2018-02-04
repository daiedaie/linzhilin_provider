package com.lzl.dao.javashop.read;

import java.util.List;
import java.util.Map;
import com.lzl.bean.javashop.OrderLog;
/**
 * 订单操作日志表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:19
 */
public interface OrderLogReadDao {
	
	OrderLog getById(Integer id);
	
	List<OrderLog> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);

}