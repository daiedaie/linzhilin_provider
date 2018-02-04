package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.MemberLoginLogs;
/**
 * 会员登录日志
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:19
 */
public interface MemberLoginLogsWriteDao {
	
    Integer post(MemberLoginLogs memberLoginLogs);

    Integer put(MemberLoginLogs memberLoginLogs);

}