package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.Member;
/**
 * 会员
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:18
 */
public interface MemberWriteDao {
	
    Integer post(Member member);

    Integer put(Member member);

}