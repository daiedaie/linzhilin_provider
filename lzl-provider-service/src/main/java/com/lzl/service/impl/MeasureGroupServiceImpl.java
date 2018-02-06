package com.lzl.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.lzl.bean.javashop.MeasureGroup;
import com.lzl.common.Pager;
import com.lzl.service.IMeasureGroupService;

/**
 * 描述：MeasureGroup 服务实现层
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:03
 */
@Service(value = "measureGroupService")
public class MeasureGroupServiceImpl implements IMeasureGroupService{

	@Override
	public List<MeasureGroup> get(Map<String, Object> queryMap, Pager pager) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getCount(Map<String, Object> queryMap) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean post(MeasureGroup measureGroup) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean put(MeasureGroup measureGroup) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteMeasureGroupById(Integer measureGroupId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
