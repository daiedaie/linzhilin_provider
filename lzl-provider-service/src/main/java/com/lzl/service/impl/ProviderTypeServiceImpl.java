package com.lzl.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.lzl.bean.javashop.ProviderType;
import com.lzl.common.Pager;
import com.lzl.service.IProviderTypeService;

/**
 * 描述：ProviderType 服务实现层
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:04
 */
@Service(value = "providerTypeService")
public class ProviderTypeServiceImpl implements IProviderTypeService{

	@Override
	public List<ProviderType> get(Map<String, Object> queryMap, Pager pager) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getCount(Map<String, Object> queryMap) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean post(ProviderType providerType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean put(ProviderType providerType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteProviderTypeById(Integer providerTypeId) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
