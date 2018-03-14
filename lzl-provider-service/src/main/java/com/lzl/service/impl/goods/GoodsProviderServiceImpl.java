package com.lzl.service.impl.goods;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.lzl.bean.javashop.goods.GoodsProvider;
import com.lzl.common.Pager;
import com.lzl.service.goods.IGoodsProviderService;

/**
 * 描述：GoodsProvider 服务实现层
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:02
 */
@Service(value = "goodsProviderService")
public class GoodsProviderServiceImpl implements IGoodsProviderService{

	@Override
	public List<GoodsProvider> get(Map<String, Object> queryMap, Pager pager) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getCount(Map<String, Object> queryMap) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean post(GoodsProvider goodsProvider) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean put(GoodsProvider goodsProvider) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteGoodsProviderById(Integer goodsProviderId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
}
