package com.lzl.dao.javashop.read.measure;

import java.util.List;
import java.util.Map;

import com.lzl.bean.javashop.measure.MeasureGroup;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:03
 */
public interface MeasureGroupReadDao {
		
	List<MeasureGroup> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);
	
}