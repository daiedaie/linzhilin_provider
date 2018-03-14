package com.lzl.service.system;

import com.lzl.bean.javashop.system.ProviderResourcesRoles;

/**
 * 描述：ProviderResourcesRoles 服务实现层接口
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:04
 */
public interface IProviderResourcesRolesService {

	Boolean put(ProviderResourcesRoles providerResourcesRoles) throws Exception;
	/*
	List<ProviderResourcesRoles> get(Map<String, Object> queryMap, Pager pager) throws Exception;
	
	Integer getCount(Map<String, Object> queryMap) throws Exception;

    Boolean post(ProviderResourcesRoles providerResourcesRoles) throws Exception;
	

	Boolean deleteProviderResourcesRolesById(Integer providerResourcesRolesId) throws Exception;

	List<SystemResources> getResourceByRoleId(Integer providerRolesId, Integer scope) throws Exception;
*/
}
