package com.lzl.dao.javashop.read;

import java.util.List;
import java.util.Map;
import com.lzl.bean.javashop.SellerApply;
/**
 * 商家申请表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:21
 */
public interface SellerApplyReadDao {
	
	SellerApply getById(Integer id);
	
	List<SellerApply> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);

}