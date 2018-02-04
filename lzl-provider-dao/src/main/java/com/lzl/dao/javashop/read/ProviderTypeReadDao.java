package com.lzl.dao.javashop.read;

import java.util.List;
import java.util.Map;

import com.lzl.bean.javashop.ProviderType;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:04
 */
public interface ProviderTypeReadDao {
		
	List<ProviderType> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);
	
}