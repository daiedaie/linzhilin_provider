package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.SellerManageCate;
/**
 * 商家可以经营商品分类表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:21
 */
public interface SellerManageCateWriteDao {
	
    Integer post(SellerManageCate sellerManageCate);

    Integer put(SellerManageCate sellerManageCate);

}