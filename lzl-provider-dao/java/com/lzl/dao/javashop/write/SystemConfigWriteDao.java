package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.SystemConfig;
/**
 * 系统配置
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:24
 */
public interface SystemConfigWriteDao {
	
    Integer post(SystemConfig systemConfig);

    Integer put(SystemConfig systemConfig);

}