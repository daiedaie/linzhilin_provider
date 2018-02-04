package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.SellerApply;
/**
 * 商家申请表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:21
 */
public interface SellerApplyWriteDao {
	
    Integer post(SellerApply sellerApply);

    Integer put(SellerApply sellerApply);

}