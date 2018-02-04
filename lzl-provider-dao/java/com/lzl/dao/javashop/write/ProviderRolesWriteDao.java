package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.ProviderRoles;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:04
 */
public interface ProviderRolesWriteDao {
	
    Integer post(ProviderRoles providerRoles);

	Integer put(ProviderRoles providerRoles);
	
	Integer deleteProviderRolesById(Integer providerRolesId);
	
}