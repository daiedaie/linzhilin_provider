package com.lzl.service;

import java.util.List;
import java.util.Map;

import com.lzl.bean.javashop.Repository;
import com.lzl.common.Pager;

/**
 * 描述：Repository 服务实现层接口
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:04
 */
public interface IRepositoryService {
	
	List<Repository> get(Map<String, Object> queryMap, Pager pager);
	
	Integer getCount(Map<String, Object> queryMap);

    Boolean post(Repository repository);
	
	Boolean put(Repository repository);

	Boolean deleteRepositoryById(Integer repositoryId);

}
