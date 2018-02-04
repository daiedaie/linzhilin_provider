package com.lzl.dao.javashop.read;

import java.util.List;
import java.util.Map;
import com.lzl.bean.javashop.SellerRoles;
/**
 * 商家角色表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:22
 */
public interface SellerRolesReadDao {
	
	SellerRoles getById(Integer id);
	
	List<SellerRoles> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);

}