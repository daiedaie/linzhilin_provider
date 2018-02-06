package com.lzl.dao.javashop.read;

import java.util.List;
import java.util.Map;

import com.lzl.bean.javashop.ProviderOrders;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-02-05 13:05:46
 */
public interface ProviderOrdersReadDao {
		
	List<ProviderOrders> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);

}