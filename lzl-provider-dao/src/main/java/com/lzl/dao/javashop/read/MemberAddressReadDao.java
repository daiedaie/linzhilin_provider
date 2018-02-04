package com.lzl.dao.javashop.read;

import java.util.List;
import java.util.Map;
import com.lzl.bean.javashop.MemberAddress;
/**
 * 收货地址
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:18
 */
public interface MemberAddressReadDao {
	
	MemberAddress getById(Integer id);
	
	List<MemberAddress> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);

}