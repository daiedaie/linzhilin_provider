package com.lzl.dao.javashop.write.system;

import com.lzl.bean.javashop.system.ProviderResources;
/**
 * 资源表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:24
 */
public interface ProviderResourcesWriteDao {
	
    Integer post(ProviderResources providerResources);

    Integer put(ProviderResources providerResources);

}