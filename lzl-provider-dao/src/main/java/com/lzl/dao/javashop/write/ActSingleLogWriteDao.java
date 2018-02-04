package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.ActSingleLog;
/**
 * 单品立减活动参加日志表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:16
 */
public interface ActSingleLogWriteDao {
	
    Integer post(ActSingleLog actSingleLog);

    Integer put(ActSingleLog actSingleLog);

}