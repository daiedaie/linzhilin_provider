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
	
	List<ProviderUser> get(Map<String, Object> queryMap, Pager pager);
	
	Integer getCount(Map<String, Object> queryMap);

    Boolean post(ProviderUser providerUser);
	
	Boolean put(ProviderUser providerUser);

	Boolean deleteProviderUserById(Integer providerUserId);

	List<ProviderUser> getProviderUserByName(String username);
}
