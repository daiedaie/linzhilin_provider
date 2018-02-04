package com.lzl.dao.javashop.read;

import java.util.List;
import java.util.Map;
import com.lzl.bean.javashop.SellerUser;
/**
 * 商家用户表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:22
 */
public interface SellerUserReadDao {
	
	SellerUser getById(Integer id);
	
	List<SellerUser> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);

}