package com.lzl.dao.javashop.read;

import java.util.List;
import java.util.Map;
import com.lzl.bean.javashop.SearchKeyword;
/**
 * 搜索敏感词过滤
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:21
 */
public interface SearchKeywordReadDao {
	
	SearchKeyword getById(Integer id);
	
	List<SearchKeyword> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);

}