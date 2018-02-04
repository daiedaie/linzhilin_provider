package com.lzl.dao.javashop.read;

import java.util.List;
import java.util.Map;
import com.lzl.bean.javashop.Cart;
/**
 * 商城购物车
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:16
 */
public interface CartReadDao {
	
	Cart getById(Integer id);
	
	List<Cart> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);

}