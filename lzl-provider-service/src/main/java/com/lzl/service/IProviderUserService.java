package com.lzl.service;

import java.util.List;
import java.util.Map;

import com.lzl.bean.javashop.ProviderUser;
import com.lzl.common.Pager;

/**
 * 描述：ProviderUser 服务实现层接口
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:04
 */
public interface IProviderUserService {
	
	List<ProviderUser> get(Map<String, Object> queryMap, Pager pager) throws Exception;
	
	Integer getCount(Map<String, Object> queryMap) throws Exception;

    Boolean post(ProviderUser providerUser) throws Exception;
	
	Boolean put(ProviderUser providerUser) throws Exception;

	Boolean deleteProviderUserById(Integer providerUserId) throws Exception;

	List<ProviderUser> getProviderUserByName(String username) throws Exception;
	
	ProviderUser getById(Integer providerUserId) throws Exception;

}
