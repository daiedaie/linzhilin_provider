package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.SearchKeyword;
/**
 * 搜索敏感词过滤
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:21
 */
public interface SearchKeywordWriteDao {
	
    Integer post(SearchKeyword searchKeyword);

    Integer put(SearchKeyword searchKeyword);

}