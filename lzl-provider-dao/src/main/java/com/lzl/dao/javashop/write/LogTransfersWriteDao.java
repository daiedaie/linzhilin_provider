package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.LogTransfers;
/**
 * 商家微信转账申请记录
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:18
 */
public interface LogTransfersWriteDao {
	
    Integer post(LogTransfers logTransfers);

    Integer put(LogTransfers logTransfers);

}