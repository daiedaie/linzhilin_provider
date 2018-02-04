package com.lzl.dao.javashop.read;

import java.util.List;
import java.util.Map;
import com.lzl.bean.javashop.MemberLoginLogs;
/**
 * 会员登录日志
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:19
 */
public interface MemberLoginLogsReadDao {
	
	MemberLoginLogs getById(Integer id);
	
	List<MemberLoginLogs> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);

}