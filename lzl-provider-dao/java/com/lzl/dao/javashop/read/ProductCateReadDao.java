package com.lzl.dao.javashop.read;

import java.util.List;
import java.util.Map;
import com.lzl.bean.javashop.ProductCate;
/**
 * 商品分类
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:20
 */
public interface ProductCateReadDao {
	
	ProductCate getById(Integer id);
	
	List<ProductCate> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);

}