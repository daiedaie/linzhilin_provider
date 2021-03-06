package com.lzl.dao.javashop.read;

import java.util.List;
import java.util.Map;
import com.lzl.bean.javashop.SystemLogs;
/**
 * 系统操作日志表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:24
 */
public interface SystemLogsReadDao {
	
	SystemLogs getById(Integer id);
	
	List<SystemLogs> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);

}