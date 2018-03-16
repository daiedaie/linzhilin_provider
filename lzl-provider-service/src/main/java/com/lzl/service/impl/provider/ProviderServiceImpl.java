package com.lzl.service.impl.provider;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lzl.bean.javashop.provider.Provider;
import com.lzl.common.Pager;
import com.lzl.dao.javashop.read.provider.ProviderReadDao;
import com.lzl.dao.javashop.write.provider.ProviderWriteDao;
import com.lzl.service.provider.IProviderService;

/**
 * 描述：Provider 服务实现层
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:03
 */
@Service(value = "providerService")
public class ProviderServiceImpl implements IProviderService{

	@Resource
	private ProviderReadDao providerReadDao;
	@Resource
	private ProviderWriteDao providerWriteDao;
	
	@Override
	public List<Provider> get(Map<String, Object> queryMap, Pager pager) throws Exception {
		if(pager != null){
			if(pager.isGetCount()){
				pager.setRowsCount(providerReadDao.getCount(queryMap));
			}
			queryMap.put("startIndex", pager.getStart());
			queryMap.put("endIndex", pager.getStart() + pager.getPageSize() -1);
		}
		
		return providerReadDao.get(queryMap);
	}

	@Override
	public Integer getCount(Map<String, Object> queryMap) {
		return providerReadDao.getCount(queryMap);
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

	@Override
	public List<Provider> getProviderForProviderOrders(Map<String, Object> queryMap) {
		String idsStr = (String)queryMap.get("idsStr");
		String[] idsArr = idsStr.split(",");
		List<Integer> idsList = new ArrayList<>();
		for(String id : idsArr){
			idsList.add(Integer.parseInt(id));
		}
		return providerReadDao.getRepositoryForProviderOrders(idsList);
	}
	
}
