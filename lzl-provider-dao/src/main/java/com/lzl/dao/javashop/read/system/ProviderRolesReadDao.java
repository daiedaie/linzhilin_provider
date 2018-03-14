package com.lzl.dao.javashop.read.system;

import java.util.List;
import java.util.Map;

import com.lzl.bean.javashop.system.ProviderRoles;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:04
 */
public interface ProviderRolesReadDao {
		
	List<ProviderRoles> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);

}