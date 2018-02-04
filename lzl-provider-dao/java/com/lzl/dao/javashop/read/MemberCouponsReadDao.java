package com.lzl.dao.javashop.read;

import java.util.List;
import java.util.Map;
import com.lzl.bean.javashop.MemberCoupons;
/**
 * 活动：用户优惠券
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:18
 */
public interface MemberCouponsReadDao {
	
	MemberCoupons getById(Integer id);
	
	List<MemberCoupons> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);

}