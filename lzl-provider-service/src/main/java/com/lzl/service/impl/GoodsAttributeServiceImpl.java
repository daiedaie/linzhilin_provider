package com.lzl.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.lzl.bean.javashop.GoodsAttribute;
import com.lzl.common.Pager;
import com.lzl.service.IGoodsAttributeService;

/**
 * 描述：GoodsAttribute 服务实现层
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:02
 */
@Service(value = "goodsAttributeService")
public class GoodsAttributeServiceImpl implements IGoodsAttributeService{

	@Override
	public List<GoodsAttribute> get(Map<String, Object> queryMap, Pager pager) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getCount(Map<String, Object> queryMap) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean post(GoodsAttribute goodsAttribute) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean put(GoodsAttribute goodsAttribute) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteGoodsAttributeById(Integer goodsAttributeId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
}
