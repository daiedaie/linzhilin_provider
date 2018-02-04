package com.lzl.dao.javashop.read;

import java.util.List;
import java.util.Map;
import com.lzl.bean.javashop.SearchSetting;
/**
 * 搜索设置
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:21
 */
public interface SearchSettingReadDao {
	
	SearchSetting getById(Integer id);
	
	List<SearchSetting> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);

}