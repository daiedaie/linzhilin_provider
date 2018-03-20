package com.lzl.service.impl.order;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lzl.bean.javashop.order.OrdersGoods;
import com.lzl.bean.javashop.order.ProviderOrders;
import com.lzl.common.Pager;
import com.lzl.dao.javashop.read.order.OrdersGoodsReadDao;
import com.lzl.dao.javashop.read.order.ProviderOrdersReadDao;
import com.lzl.dao.javashop.write.order.ProviderOrdersWriteDao;
import com.lzl.service.order.IProviderOrdersService;

/**
 * 描述：ProviderOrders 服务实现层
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-02-05 13:05:46
 */
@Service(value = "providerOrdersService")
public class ProviderOrdersServiceImpl implements IProviderOrdersService{

	@Resource
	private ProviderOrdersReadDao providerOrdersReadDao;
	@Resource
	private ProviderOrdersWriteDao providerOrdersWriteDao;
	@Resource
	private OrdersGoodsReadDao ordersGoodsReadDao;
	@Override
	public List<ProviderOrders> get(Map<String, Object> queryMap, Pager pager) throws Exception {
		
		if(pager != null){
			if(pager.isGetCount()){
				pager.setRowsCount(providerOrdersReadDao.getCount(queryMap));
			}
			queryMap.put("startIndex", pager.getStart());
			queryMap.put("endIndex", pager.getStart() + pager.getPageSize() - 1);
		}
		List<ProviderOrders> list = providerOrdersReadDao.get(queryMap);
		this.setPerOrderGoods(list);
		return list;
	}

	@Override
	public Integer getCount(Map<String, Object> queryMap) throws Exception {
		return providerOrdersReadDao.getCount(queryMap);
	}

	@Override
	public Boolean post(ProviderOrders providerOrders) throws Exception {
		int result = providerOrdersWriteDao.post(providerOrders);
		return result > 0;
	}

	@Override
	public Boolean put(ProviderOrders providerOrders) throws Exception {
		int result = providerOrdersWriteDao.put(providerOrders);
		return result > 0;
	}
	
	private List<ProviderOrders> setPerOrderGoods(List<ProviderOrders> list) {
		for(ProviderOrders providerOrder : list){
			Map<String, Object> queryMap = new HashMap<>();
			queryMap.put("ordersSn", providerOrder.getOrderSn());
			List<OrdersGoods> ordersGoodsList = ordersGoodsReadDao.getAllList(queryMap);
			providerOrder.setOrdersGoods(ordersGoodsList);
		}
		return list;
	}
}
