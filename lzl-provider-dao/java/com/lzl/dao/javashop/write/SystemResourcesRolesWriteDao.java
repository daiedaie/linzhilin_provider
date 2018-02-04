package com.lzl.dao.javashop.write;

import java.util.List;

import com.lzl.bean.javashop.SystemResourcesRoles;
/**
 * 角色资源对应表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:24
 */
public interface SystemResourcesRolesWriteDao {
	
    Integer post(List<SystemResourcesRoles> systemResourcesRoles);

    Integer delete(Integer rolesId);

}