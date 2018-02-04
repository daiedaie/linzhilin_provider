package com.lzl.service;

import java.util.List;
import java.util.Map;

import com.lzl.bean.javashop.GoodsAttribute;
import com.lzl.common.Pager;

/**
 * 描述：GoodsAttribute 服务实现层接口
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:02
 */
public interface IGoodsAttributeService {
	/**
	 * 查询列表
	 * @param queryMap
	 * @param pager
	 * @return
	 */
	List<GoodsAttribute> get(Map<String, Object> queryMap, Pager pager) throws Exception;
	
	/**
	 * 查询总记录数
	 * @param queryMap
	 * @return
	 */
	Integer getCount(Map<String, Object> queryMap) throws Exception;

	/**
	 * 新增
	 * @param goodsAttribute
	 * @return
	 */
    Boolean post(GoodsAttribute goodsAttribute) throws Exception;

    /**
     * 更新
     * @param goodsAttribute
     * @return
     */
	Boolean put(GoodsAttribute goodsAttribute) throws Exception;

	/**
	 * 根据ID删除GoodsAttribute
	 * @param goodsAttributeId
	 * @return
	 */
	Boolean deleteGoodsAttributeById(Integer goodsAttributeId) throws Exception;

}
