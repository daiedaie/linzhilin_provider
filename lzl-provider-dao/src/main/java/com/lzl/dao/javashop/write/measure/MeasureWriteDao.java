package com.lzl.dao.javashop.write.measure;

import com.lzl.bean.javashop.measure.Measure;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:03
 */
public interface MeasureWriteDao {
	
    Integer post(Measure measure);

	Integer put(Measure measure);
	
	Integer deleteMeasureById(Integer measureId);
	
}