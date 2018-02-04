package com.lzl.dao.javashop.read;

import java.util.List;
import java.util.Map;
import com.lzl.bean.javashop.Config;
/**
 * 系统配置表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:17
 */
public interface ConfigReadDao {
	
	Config getById(Integer id);
	
	List<Config> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);

}