package com.lzl.dao.javashop.read;

import java.util.List;
import java.util.Map;
import com.lzl.bean.javashop.Member;
/**
 * 会员
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:18
 */
public interface MemberReadDao {
	
	Member getById(Integer id);
	
	List<Member> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);

}