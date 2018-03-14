package com.lzl.dao.javashop.write.provider;

import com.lzl.bean.javashop.provider.ProviderType;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:04
 */
public interface ProviderTypeWriteDao {
	
    Integer post(ProviderType providerType);

	Integer put(ProviderType providerType);
	
	Integer deleteProviderTypeById(Integer providerTypeId);
	
}