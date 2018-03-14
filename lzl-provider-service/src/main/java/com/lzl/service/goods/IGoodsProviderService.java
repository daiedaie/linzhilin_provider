package com.lzl.service.goods;

import java.util.List;
import java.util.Map;

import com.lzl.bean.javashop.goods.GoodsProvider;
import com.lzl.common.Pager;

/**
 * 描述：GoodsProvider 服务实现层接口
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:02
 */
public interface IGoodsProviderService {
	
	List<GoodsProvider> get(Map<String, Object> queryMap, Pager pager) throws Exception;
	
	Integer getCount(Map<String, Object> queryMap) throws Exception;

    Boolean post(GoodsProvider goodsProvider) throws Exception;
	
	Boolean put(GoodsProvider goodsProvider) throws Exception;

	Boolean deleteGoodsProviderById(Integer goodsProviderId) throws Exception;

}
