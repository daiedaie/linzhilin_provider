package com.lzl.dao.javashop.read;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lzl.bean.javashop.ProviderResourcesRoles;
import com.lzl.bean.javashop.SystemResources;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:04
 */
public interface ProviderResourcesRolesReadDao {
		
	List<ProviderResourcesRoles> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);
	
	List<SystemResources> getResourceByRoleId(@Param("providerRolesId") Integer providerRolesId, @Param("scope") Integer scope);

}