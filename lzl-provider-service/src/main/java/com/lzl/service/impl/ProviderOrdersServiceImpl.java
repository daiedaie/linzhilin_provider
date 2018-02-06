package com.lzl.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lzl.bean.javashop.ProviderOrders;
import com.lzl.common.Pager;
import com.lzl.dao.javashop.read.ProviderOrdersReadDao;
import com.lzl.dao.javashop.write.ProviderOrdersWriteDao;
import com.lzl.service.IProviderOrdersService;

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
	
	@Override
	public List<ProviderOrders> get(Map<String, Object> queryMap, Pager pager) throws Exception {
		
		if(pager != null){
			if(pager.isGetCount()){
				pager.setRowsCount(providerOrdersReadDao.getCount(queryMap));
			}
			queryMap.put("startIndex", pager.getStart());
			queryMap.put("endIndex", pager.getStart() + pager.getPageSize() - 1);
		}
		
		return providerOrdersReadDao.get(queryMap);
	}

	@Override
	public Integer getCount(Map<String, Object> queryMap) throws Exception {
		return providerOrdersReadDao.getCount(queryMap);
	}

	@Override
	public Boolean post(ProviderOrders providerOrders) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean put(ProviderOrders providerOrders) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
