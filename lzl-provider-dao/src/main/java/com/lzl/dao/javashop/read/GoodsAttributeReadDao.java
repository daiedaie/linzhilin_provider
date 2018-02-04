package com.lzl.dao.javashop.read;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.lzl.bean.javashop.GoodsAttribute;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:02
 */
@Repository
public interface GoodsAttributeReadDao {
		
	List<GoodsAttribute> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);
	
}