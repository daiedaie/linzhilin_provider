package com.lzl.dao.javashop.read;

import java.util.List;
import java.util.Map;
import com.lzl.bean.javashop.Partner;
/**
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:19
 */
public interface PartnerReadDao {
	
	Partner getById(Integer id);
	
	List<Partner> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);

}