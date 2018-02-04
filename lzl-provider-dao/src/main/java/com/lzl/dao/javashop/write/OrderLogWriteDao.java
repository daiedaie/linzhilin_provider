package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.OrderLog;
/**
 * 订单操作日志表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:19
 */
public interface OrderLogWriteDao {
	
    Integer post(OrderLog orderLog);

    Integer put(OrderLog orderLog);

}