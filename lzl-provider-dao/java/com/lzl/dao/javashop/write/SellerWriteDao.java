package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.Seller;
/**
 * 商家表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:21
 */
public interface SellerWriteDao {
	
    Integer post(Seller seller);

    Integer put(Seller seller);

}