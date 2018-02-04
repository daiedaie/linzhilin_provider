package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.LogSellerVisit;
/**
 * 用户访问商家
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:18
 */
public interface LogSellerVisitWriteDao {
	
    Integer post(LogSellerVisit logSellerVisit);

    Integer put(LogSellerVisit logSellerVisit);

}