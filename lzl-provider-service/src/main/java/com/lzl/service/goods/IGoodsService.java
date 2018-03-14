package com.lzl.service.goods;

import java.util.List;
import java.util.Map;

import com.lzl.bean.javashop.goods.Goods;
import com.lzl.common.Pager;

/**
 * 描述：Goods 服务实现层接口
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:01
 */
public interface IGoodsService {
	
	List<Goods> get(Map<String, Object> queryMap, Pager pager) throws Exception;
	
	Integer getCount(Map<String, Object> queryMap) throws Exception;

    Boolean post(Goods goods) throws Exception;
	
	Boolean put(Goods goods) throws Exception;

	Boolean deleteGoodsById(Integer goodsId) throws Exception;

}
