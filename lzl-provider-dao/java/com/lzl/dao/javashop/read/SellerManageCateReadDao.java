package com.lzl.dao.javashop.read;

import java.util.List;
import java.util.Map;
import com.lzl.bean.javashop.SellerManageCate;
/**
 * 商家可以经营商品分类表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:21
 */
public interface SellerManageCateReadDao {
	
	SellerManageCate getById(Integer id);
	
	List<SellerManageCate> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);

}