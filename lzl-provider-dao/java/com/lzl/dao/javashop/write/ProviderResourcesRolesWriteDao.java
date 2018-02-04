package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.ProviderResourcesRoles;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:04
 */
public interface ProviderResourcesRolesWriteDao {
	
    Integer post(ProviderResourcesRoles providerResourcesRoles);

	Integer put(ProviderResourcesRoles providerResourcesRoles);
	
	Integer deleteProviderResourcesRolesById(Integer providerResourcesRolesId);
	
}