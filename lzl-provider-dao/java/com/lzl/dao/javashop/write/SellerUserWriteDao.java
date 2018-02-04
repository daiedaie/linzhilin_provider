package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.SellerUser;
/**
 * 商家用户表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:22
 */
public interface SellerUserWriteDao {
	
    Integer post(SellerUser sellerUser);

    Integer put(SellerUser sellerUser);

}