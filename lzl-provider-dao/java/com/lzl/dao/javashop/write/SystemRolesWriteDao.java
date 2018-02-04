package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.SystemRoles;
/**
 * 角色表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:24
 */
public interface SystemRolesWriteDao {
	
    Integer post(SystemRoles systemRoles);

    Integer put(SystemRoles systemRoles);

}