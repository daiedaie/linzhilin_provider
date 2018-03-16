package com.lzl.service.goods;

import java.util.List;
import java.util.Map;
import com.lzl.common.Pager;
import com.lzl.bean.javashop.goods.GoodsAttribute;

/**
 * 描述：GoodsAttribute 服务实现层接口
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-03-14 14:31:18
 */
public interface IGoodsAttributeService {
	/**列表查询*/
	List<GoodsAttribute> get(Map<String, Object> queryMap, Pager pager)throws Exception;
	/**新增*/
    Boolean post(GoodsAttribute goodsAttribute) throws Exception;
	/**更新*/
    Boolean put(GoodsAttribute goodsAttribute) throws Exception;

}
