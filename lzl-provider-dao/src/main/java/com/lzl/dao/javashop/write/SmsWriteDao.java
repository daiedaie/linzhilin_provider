package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.Sms;
/**
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:22
 */
public interface SmsWriteDao {
	
    Integer post(Sms sms);

    Integer put(Sms sms);

}