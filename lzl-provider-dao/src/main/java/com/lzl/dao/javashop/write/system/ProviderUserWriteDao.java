package com.lzl.dao.javashop.write.system;

import com.lzl.bean.javashop.system.ProviderUser;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:04
 */
public interface ProviderUserWriteDao {
	
    Integer post(ProviderUser providerUser);

	Integer put(ProviderUser providerUser);
	
	Integer deleteProviderUserById(Integer providerUserId);
	
}