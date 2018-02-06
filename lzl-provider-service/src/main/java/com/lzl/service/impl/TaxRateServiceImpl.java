package com.lzl.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.lzl.bean.javashop.TaxRate;
import com.lzl.common.Pager;
import com.lzl.service.ITaxRateService;

/**
 * 描述：TaxRate 服务实现层
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:04
 */
@Service(value = "taxRateService")
public class TaxRateServiceImpl implements ITaxRateService{

	@Override
	public List<TaxRate> get(Map<String, Object> queryMap, Pager pager) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getCount(Map<String, Object> queryMap) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean post(TaxRate taxRate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean put(TaxRate taxRate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteTaxRateById(Integer taxRateId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
