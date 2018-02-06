package com.lzl.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.lzl.bean.javashop.Provider;
import com.lzl.common.Pager;
import com.lzl.service.IProviderService;

/**
 * 描述：Provider 服务实现层
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:03
 */
@Service(value = "providerService")
public class ProviderServiceImpl implements IProviderService{

	@Override
	public List<Provider> get(Map<String, Object> queryMap, Pager pager) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getCount(Map<String, Object> queryMap) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean post(Provider provider) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean put(Provider provider) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteProviderById(Integer providerId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
