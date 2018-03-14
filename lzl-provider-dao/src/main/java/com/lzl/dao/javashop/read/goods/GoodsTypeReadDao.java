package com.lzl.dao.javashop.read.goods;

import java.util.List;
import java.util.Map;

import com.lzl.bean.javashop.goods.GoodsType;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:02
 */
public interface GoodsTypeReadDao {
		
	List<GoodsType> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);

}