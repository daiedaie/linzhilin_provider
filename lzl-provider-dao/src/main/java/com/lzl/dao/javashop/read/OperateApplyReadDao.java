package com.lzl.dao.javashop.read;

import java.util.List;
import java.util.Map;
import com.lzl.bean.javashop.OperateApply;
/**
 * 操作申请
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:19
 */
public interface OperateApplyReadDao {
	
	OperateApply getById(Integer id);
	
	List<OperateApply> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);

}