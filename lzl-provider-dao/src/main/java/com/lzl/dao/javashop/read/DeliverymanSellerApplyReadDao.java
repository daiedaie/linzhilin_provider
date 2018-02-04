package com.lzl.dao.javashop.read;

import java.util.List;
import java.util.Map;
import com.lzl.bean.javashop.DeliverymanSellerApply;
/**
 * 申请成为某个商户的配送员
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:17
 */
public interface DeliverymanSellerApplyReadDao {
	
	DeliverymanSellerApply getById(Integer id);
	
	List<DeliverymanSellerApply> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);

}