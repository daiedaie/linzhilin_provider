package com.lzl.dao.javashop.read;

import java.util.List;
import java.util.Map;
import com.lzl.bean.javashop.LogRegionsApply;
/**
 * 用户地区申请开通商超记录
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:17
 */
public interface LogRegionsApplyReadDao {
	
	LogRegionsApply getById(Integer id);
	
	List<LogRegionsApply> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);

}