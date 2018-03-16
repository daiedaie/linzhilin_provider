package com.lzl.dao.javashop.read.goods;

import java.util.List;
import java.util.Map;
import com.lzl.bean.javashop.goods.GoodsAttribute;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-03-14 14:31:18
 */
public interface GoodsAttributeReadDao {
	/**通过id查询*/
	GoodsAttribute getById(Integer id);
	/**查询列表*/
	List<GoodsAttribute> get(Map<String, Object> queryMap);
	/**查询数量*/
	Integer getCount(Map<String, Object> queryMap);

}