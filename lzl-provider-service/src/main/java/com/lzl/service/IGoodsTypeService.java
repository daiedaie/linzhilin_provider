package com.lzl.service;

import java.util.List;
import java.util.Map;

import com.lzl.bean.javashop.GoodsType;
import com.lzl.common.Pager;

/**
 * 描述：GoodsType 服务实现层接口
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:02
 */
public interface IGoodsTypeService {
	
	List<GoodsType> get(Map<String, Object> queryMap, Pager pager) throws Exception;
	
	Integer getCount(Map<String, Object> queryMap) throws Exception;

    Boolean post(GoodsType goodsType) throws Exception;
	
	Boolean put(GoodsType goodsType) throws Exception;

	Boolean deleteGoodsTypeById(Integer goodsTypeId) throws Exception;

}
