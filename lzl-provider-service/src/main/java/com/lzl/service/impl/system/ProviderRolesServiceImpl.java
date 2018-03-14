package com.lzl.service.impl.system;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lzl.bean.javashop.system.ProviderRoles;
import com.lzl.common.Pager;
import com.lzl.dao.javashop.read.system.ProviderRolesReadDao;
import com.lzl.dao.javashop.write.system.ProviderRolesWriteDao;
import com.lzl.service.system.IProviderRolesService;

/**
 * 描述：ProviderRoles 服务实现层
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:04
 */
@Service(value = "providerRolesService")
public class ProviderRolesServiceImpl implements IProviderRolesService{

	@Resource
	private ProviderRolesReadDao providerRolesReadDao;
	@Resource
	private ProviderRolesWriteDao providerRolesWriteDao;
	
	@Override
	public List<ProviderRoles> get(Map<String, Object> queryMap, Pager pager) throws Exception {
		if(pager != null){
			if(pager.isGetCount()){
				pager.setRowsCount(providerRolesReadDao.getCount(queryMap));
			}
			queryMap.put("startIndex", pager.getStart());
			queryMap.put("endIndex", pager.getStart() + pager.getPageSize() -1);
		}
		return providerRolesReadDao.get(queryMap);
	}

	@Override
	public Integer getCount(Map<String, Object> queryMap) throws Exception {
		return providerRolesReadDao.getCount(queryMap);
	}

	@Override
	public Boolean post(ProviderRoles providerRoles) throws Exception {
		int result = providerRolesWriteDao.post(providerRoles);
		return result > 0;
	}

	@Override
	public Boolean put(ProviderRoles providerRoles) throws Exception {
		int result = providerRolesWriteDao.put(providerRoles);
		return result > 0;
	}

	@Override
	public Boolean deleteProviderRolesById(Integer providerRolesId) throws Exception {
		int result = providerRolesWriteDao.deleteProviderRolesById(providerRolesId);
		return result > 0;
	}
	
}
