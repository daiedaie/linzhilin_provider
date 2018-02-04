package com.lzl.service;

import java.util.List;
import java.util.Map;

import com.lzl.bean.javashop.ProviderResourcesRoles;
import com.lzl.bean.javashop.SystemResources;
import com.lzl.common.Pager;

/**
 * 描述：ProviderResourcesRoles 服务实现层接口
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:04
 */
public interface IProviderResourcesRolesService {
	
	List<ProviderResourcesRoles> get(Map<String, Object> queryMap, Pager pager) throws Exception;
	
	Integer getCount(Map<String, Object> queryMap) throws Exception;

    Boolean post(ProviderResourcesRoles providerResourcesRoles) throws Exception;
	
	Boolean put(ProviderResourcesRoles providerResourcesRoles) throws Exception;

	Boolean deleteProviderResourcesRolesById(Integer providerResourcesRolesId) throws Exception;

	List<SystemResources> getResourceByRoleId(Integer providerRolesId, Integer scope) throws Exception;

}
