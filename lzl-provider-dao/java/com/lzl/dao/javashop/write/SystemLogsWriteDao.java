package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.SystemLogs;
/**
 * 系统操作日志表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:24
 */
public interface SystemLogsWriteDao {
	
    Integer post(SystemLogs systemLogs);

    Integer put(SystemLogs systemLogs);

}