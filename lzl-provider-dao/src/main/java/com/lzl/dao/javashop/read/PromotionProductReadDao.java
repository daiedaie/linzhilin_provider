package com.lzl.dao.javashop.read;

import java.util.List;
import java.util.Map;
import com.lzl.bean.javashop.PromotionProduct;
/**
 * 活动商品
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:21
 */
public interface PromotionProductReadDao {
	
	PromotionProduct getById(Integer id);
	
	List<PromotionProduct> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);

}