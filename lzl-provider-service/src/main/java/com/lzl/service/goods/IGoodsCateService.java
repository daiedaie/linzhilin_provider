package com.lzl.service.goods;

import java.util.List;
import java.util.Map;

import com.lzl.bean.javashop.goods.GoodsCate;
import com.lzl.common.Pager;

/**
 * 描述：GoodsCate 服务实现层接口
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-03-13 13:34:06
 */
public interface IGoodsCateService {
	/**列表查询*/
	List<GoodsCate> get(Map<String, Object> queryMap, Pager pager)throws Exception;
	/**新增*/
    Boolean post(GoodsCate goodsCate) throws Exception;
	/**更新*/
    Boolean put(GoodsCate goodsCate) throws Exception;
    /**获取一级分类*/
    List<GoodsCate> getTopLevel();
	Boolean deleteById(Integer id);

}
