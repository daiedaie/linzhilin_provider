package com.lzl.dao.javashop.write.provider;

import com.lzl.bean.javashop.provider.Provider;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:03
 */
public interface ProviderWriteDao {
	
    Integer post(Provider provider);

	Integer put(Provider provider);
	
	Integer deleteProviderById(Integer providerId);
	
}