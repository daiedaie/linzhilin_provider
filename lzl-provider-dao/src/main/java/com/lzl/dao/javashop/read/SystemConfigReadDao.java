package com.lzl.dao.javashop.read;

import java.util.List;
import java.util.Map;
import com.lzl.bean.javashop.SystemConfig;
/**
 * 系统配置
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:24
 */
public interface SystemConfigReadDao {
	
	SystemConfig getById(Integer id);
	
	List<SystemConfig> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);

}