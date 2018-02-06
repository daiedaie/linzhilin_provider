package com.lzl.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.lzl.bean.javashop.Measure;
import com.lzl.common.Pager;
import com.lzl.service.IMeasureService;

/**
 * 描述：Measure 服务实现层
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:03
 */
@Service(value = "measureService")
public class MeasureServiceImpl implements IMeasureService{

	@Override
	public List<Measure> get(Map<String, Object> queryMap, Pager pager) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getCount(Map<String, Object> queryMap) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean post(Measure measure) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean put(Measure measure) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteMeasureById(Integer measureId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
}
