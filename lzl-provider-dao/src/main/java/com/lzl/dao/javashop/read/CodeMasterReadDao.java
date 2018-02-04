package com.lzl.dao.javashop.read;

import java.util.List;
import java.util.Map;
import com.lzl.bean.javashop.CodeMaster;
/**
 * 字典表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:16
 */
public interface CodeMasterReadDao {
	
	CodeMaster getById(Integer id);
	
	List<CodeMaster> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);

}