package com.lzl.dao.javashop.read.goods;

import java.util.List;
import java.util.Map;
import com.lzl.bean.javashop.goods.GoodsCate;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-03-13 13:34:06
 */
public interface GoodsCateReadDao {
	/**通过id查询*/
	GoodsCate getById(Integer id);
	/**查询列表*/
	List<GoodsCate> get(Map<String, Object> queryMap);
	/**查询数量*/
	Integer getCount(Map<String, Object> queryMap);
	/**获取一级分类*/
	List<GoodsCate> getTopLevel();
	List<GoodsCate> getGoodsCateChildren(Integer id);

}