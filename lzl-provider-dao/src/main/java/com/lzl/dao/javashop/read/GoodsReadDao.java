package com.lzl.dao.javashop.read;

import java.util.List;
import java.util.Map;

import com.lzl.bean.javashop.Goods;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:01
 */
public interface GoodsReadDao {
		
	/**
	 * 获取商品列表
	 * @param queryMap
	 * @return
	 */
	List<Goods> get(Map<String, Object> queryMap);
	
	/**
	 * 获取商品总数
	 * @param queryMap
	 * @return
	 */
	Integer getCount(Map<String, Object> queryMap);
	
}