package com.lzl.dao.javashop.read;

import java.util.List;
import java.util.Map;
import com.lzl.bean.javashop.SupplierRoles;
/**
 * 供应商角色表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:23
 */
public interface SupplierRolesReadDao {
	
	SupplierRoles getById(Integer id);
	
	List<SupplierRoles> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);

}