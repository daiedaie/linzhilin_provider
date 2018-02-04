package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.SearchSetting;
/**
 * 搜索设置
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:21
 */
public interface SearchSettingWriteDao {
	
    Integer post(SearchSetting searchSetting);

    Integer put(SearchSetting searchSetting);

}