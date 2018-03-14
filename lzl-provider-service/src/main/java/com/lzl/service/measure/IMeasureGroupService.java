package com.lzl.service.measure;

import java.util.List;
import java.util.Map;

import com.lzl.bean.javashop.measure.MeasureGroup;
import com.lzl.common.Pager;

/**
 * 描述：MeasureGroup 服务实现层接口
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:03
 */
public interface IMeasureGroupService {
	
	List<MeasureGroup> get(Map<String, Object> queryMap, Pager pager) throws Exception;
	
	Integer getCount(Map<String, Object> queryMap) throws Exception;

    Boolean post(MeasureGroup measureGroup) throws Exception;
	
	Boolean put(MeasureGroup measureGroup) throws Exception;

	Boolean deleteMeasureGroupById(Integer measureGroupId) throws Exception;

}
