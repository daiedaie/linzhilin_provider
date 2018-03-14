package com.lzl.service.provider;

import java.util.List;
import java.util.Map;

import com.lzl.bean.javashop.provider.Provider;
import com.lzl.common.Pager;

/**
 * 描述：Provider 服务实现层接口
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:03
 */
public interface IProviderService {
	
	List<Provider> get(Map<String, Object> queryMap, Pager pager) throws Exception;
	
	Integer getCount(Map<String, Object> queryMap);

    Boolean post(Provider provider);
	
	Boolean put(Provider provider);

	Boolean deleteProviderById(Integer providerId);

}
