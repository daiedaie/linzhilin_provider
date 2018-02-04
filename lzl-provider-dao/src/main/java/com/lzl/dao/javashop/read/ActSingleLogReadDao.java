package com.lzl.dao.javashop.read;

import java.util.List;
import java.util.Map;
import com.lzl.bean.javashop.ActSingleLog;
/**
 * 单品立减活动参加日志表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:16
 */
public interface ActSingleLogReadDao {
	
	ActSingleLog getById(Integer id);
	
	List<ActSingleLog> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);

}