package com.lzl.service;

import java.util.List;
import java.util.Map;

import com.lzl.bean.javashop.ProviderType;
import com.lzl.common.Pager;

/**
 * 描述：ProviderType 服务实现层接口
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:04
 */
public interface IProviderTypeService {
	
	List<ProviderType> get(Map<String, Object> queryMap, Pager pager) throws Exception;
	
	Integer getCount(Map<String, Object> queryMap);

    Boolean post(ProviderType providerType);
	
	Boolean put(ProviderType providerType);

	Boolean deleteProviderTypeById(Integer providerTypeId);

}
