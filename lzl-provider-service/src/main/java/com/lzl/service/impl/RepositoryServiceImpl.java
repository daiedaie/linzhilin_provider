package com.lzl.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.lzl.bean.javashop.Repository;
import com.lzl.common.Pager;
import com.lzl.service.IRepositoryService;

/**
 * 描述：Repository 服务实现层
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:04
 */
@Service(value = "repositoryService")
public class RepositoryServiceImpl implements IRepositoryService{

	@Override
	public List<Repository> get(Map<String, Object> queryMap, Pager pager) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getCount(Map<String, Object> queryMap) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean post(Repository repository) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean put(Repository repository) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteRepositoryById(Integer repositoryId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
