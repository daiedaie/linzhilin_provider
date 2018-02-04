package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.Config;
/**
 * 系统配置表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:17
 */
public interface ConfigWriteDao {
	
    Integer post(Config config);

    Integer put(Config config);

}