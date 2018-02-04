package com.lzl.dao.javashop.read;

import java.util.List;
import java.util.Map;
import com.lzl.bean.javashop.SupplierResourcesRoles;
/**
 * 供应商角色资源对应表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:23
 */
public interface SupplierResourcesRolesReadDao {
	
	SupplierResourcesRoles getById(Integer id);
	
	List<SupplierResourcesRoles> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);

}