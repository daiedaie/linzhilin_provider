package com.lzl.dao.javashop.read;

import java.util.List;
import java.util.Map;
import com.lzl.bean.javashop.SellerWechat;
/**
 * 商家微信
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:22
 */
public interface SellerWechatReadDao {
	
	SellerWechat getById(Integer id);
	
	List<SellerWechat> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);

}