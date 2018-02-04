package com.lzl.dao.javashop.read;

import java.util.List;
import java.util.Map;
import com.lzl.bean.javashop.MemberCollectionProduct;
/**
 * 会员收藏商品表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:18
 */
public interface MemberCollectionProductReadDao {
	
	MemberCollectionProduct getById(Integer id);
	
	List<MemberCollectionProduct> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);

}