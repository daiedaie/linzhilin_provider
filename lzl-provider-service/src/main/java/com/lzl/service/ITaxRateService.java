package com.lzl.service;

import java.util.List;
import java.util.Map;

import com.lzl.bean.javashop.TaxRate;
import com.lzl.common.Pager;

/**
 * 描述：TaxRate 服务实现层接口
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:04
 */
public interface ITaxRateService {
	
	List<TaxRate> get(Map<String, Object> queryMap, Pager pager);
	
	Integer getCount(Map<String, Object> queryMap);

    Boolean post(TaxRate taxRate);
	
	Boolean put(TaxRate taxRate);

	Boolean deleteTaxRateById(Integer taxRateId);

}
