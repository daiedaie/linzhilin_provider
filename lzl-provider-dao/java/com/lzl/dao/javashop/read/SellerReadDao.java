package com.lzl.dao.javashop.read;

import java.util.List;
import java.util.Map;
import com.lzl.bean.javashop.Seller;
/**
 * 商家表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:21
 */
public interface SellerReadDao {
	
	Seller getSingle(Map<String, Object> queryMap);
	
	List<Seller> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);

}