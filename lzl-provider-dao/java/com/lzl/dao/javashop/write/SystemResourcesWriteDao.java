package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.SystemResources;
/**
 * 资源表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:24
 */
public interface SystemResourcesWriteDao {
	
    Integer post(SystemResources systemResources);

    Integer put(SystemResources systemResources);

}