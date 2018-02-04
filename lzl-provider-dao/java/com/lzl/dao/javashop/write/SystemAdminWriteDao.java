package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.SystemAdmin;
/**
 * 系统管理员表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:24
 */
public interface SystemAdminWriteDao {
	
    Integer post(SystemAdmin systemAdmin);

    Integer put(SystemAdmin systemAdmin);

}