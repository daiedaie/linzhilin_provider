package com.lzl.dao.javashop.read.provider;

import java.util.List;
import java.util.Map;

import com.lzl.bean.javashop.provider.Provider;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:03
 */
public interface ProviderReadDao {
		
	List<Provider> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);
	
}