package com.lzl.dao.javashop.read;

import java.util.List;
import java.util.Map;
import com.lzl.bean.javashop.PartnerCity;
/**
 * 管理员城市绑定-目前用于市场管理员
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:19
 */
public interface PartnerCityReadDao {
	
	PartnerCity getById(Integer id);
	
	List<PartnerCity> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);

}