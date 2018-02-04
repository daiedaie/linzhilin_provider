package com.lzl.dao.javashop.read;

import java.util.List;
import java.util.Map;
import com.lzl.bean.javashop.SellerRetrievePwd;
/**
 * 商家重置密码申请(可以废弃，整理代码后删掉)
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:21
 */
public interface SellerRetrievePwdReadDao {
	
	SellerRetrievePwd getById(Integer id);
	
	List<SellerRetrievePwd> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);

}