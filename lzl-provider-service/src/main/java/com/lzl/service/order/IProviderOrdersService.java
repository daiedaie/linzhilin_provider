package com.lzl.service.order;

import java.util.List;
import java.util.Map;

import com.lzl.bean.javashop.order.ProviderOrders;
import com.lzl.common.Pager;

/**
 * 描述：ProviderOrders 服务实现层接口
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-02-05 13:05:46
 */
public interface IProviderOrdersService {
	
	List<ProviderOrders> get(Map<String, Object> queryMap, Pager pager) throws Exception;
	
	Integer getCount(Map<String, Object> queryMap) throws Exception;

    Boolean post(ProviderOrders providerOrders) throws Exception;
	
	Boolean put(ProviderOrders providerOrders) throws Exception;

}
