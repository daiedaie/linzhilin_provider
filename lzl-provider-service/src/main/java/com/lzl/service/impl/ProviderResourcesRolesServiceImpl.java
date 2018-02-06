package com.lzl.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.lzl.bean.javashop.ProviderResourcesRoles;
import com.lzl.bean.javashop.SystemResources;
import com.lzl.common.Pager;
import com.lzl.service.IProviderResourcesRolesService;

/**
 * 描述：ProviderResourcesRoles 服务实现层
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:04
 */
@Service(value = "providerResourcesRolesService")
public class ProviderResourcesRolesServiceImpl implements IProviderResourcesRolesService{

	@Override
	public List<ProviderResourcesRoles> get(Map<String, Object> queryMap, Pager pager) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getCount(Map<String, Object> queryMap) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean post(ProviderResourcesRoles providerResourcesRoles) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean put(ProviderResourcesRoles providerResourcesRoles) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteProviderResourcesRolesById(Integer providerResourcesRolesId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SystemResources> getResourceByRoleId(Integer providerRolesId, Integer scope) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
}
