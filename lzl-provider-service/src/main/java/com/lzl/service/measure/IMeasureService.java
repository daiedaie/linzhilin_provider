package com.lzl.service.measure;

import java.util.List;
import java.util.Map;

import com.lzl.bean.javashop.measure.Measure;
import com.lzl.common.Pager;

/**
 * 描述：Measure 服务实现层接口
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:03
 */
public interface IMeasureService {
	
	List<Measure> get(Map<String, Object> queryMap, Pager pager) throws Exception;
	
	Integer getCount(Map<String, Object> queryMap) throws Exception;

    Boolean post(Measure measure) throws Exception;
	
	Boolean put(Measure measure) throws Exception;

	Boolean deleteMeasureById(Integer measureId) throws Exception;

}
