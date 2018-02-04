package com.lzl.service;

import java.util.List;
import java.util.Map;

import com.lzl.bean.javashop.ProviderRoles;
import com.lzl.common.Pager;

/**
 * 描述：ProviderRoles 服务实现层接口
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:04
 */
public interface IProviderRolesService {
	
	List<ProviderRoles> get(Map<String, Object> queryMap, Pager pager) throws Exception;
	
	Integer getCount(Map<String, Object> queryMap) throws Exception;

    Boolean post(ProviderRoles providerRoles) throws Exception;
	
	Boolean put(ProviderRoles providerRoles) throws Exception;

	Boolean deleteProviderRolesById(Integer providerRolesId) throws Exception;

}
