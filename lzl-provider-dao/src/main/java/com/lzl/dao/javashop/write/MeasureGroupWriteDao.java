package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.MeasureGroup;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:03
 */
public interface MeasureGroupWriteDao {
	
    Integer post(MeasureGroup measureGroup);

	Integer put(MeasureGroup measureGroup);
	
	Integer deleteMeasureGroupById(Integer measureGroupId);
	
}