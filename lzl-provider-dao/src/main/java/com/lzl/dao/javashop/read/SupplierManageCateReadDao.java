package com.lzl.dao.javashop.read;

import java.util.List;
import java.util.Map;
import com.lzl.bean.javashop.SupplierManageCate;
/**
 * 供应商可以经营商品分类表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:23
 */
public interface SupplierManageCateReadDao {
	
	SupplierManageCate getById(Integer id);
	
	List<SupplierManageCate> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);

}