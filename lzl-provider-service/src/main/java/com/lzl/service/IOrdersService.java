package com.lzl.service;

import java.util.List;
import java.util.Map;
import com.lzl.common.Pager;
import com.lzl.bean.javashop.Orders;

/**
 * 订单
 * 描述：Orders 服务实现层接口
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:19
 */
public interface IOrdersService {

    Orders getById(Integer id)throws Exception;
	
	List<Orders> get(Map<String, Object> queryMap, Pager pager)throws Exception;

    Boolean post(Orders orders) throws Exception;

    Boolean put(Orders orders) throws Exception;

}
