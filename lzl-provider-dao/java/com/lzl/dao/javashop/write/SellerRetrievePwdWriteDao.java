package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.SellerRetrievePwd;
/**
 * 商家重置密码申请(可以废弃，整理代码后删掉)
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:21
 */
public interface SellerRetrievePwdWriteDao {
	
    Integer post(SellerRetrievePwd sellerRetrievePwd);

    Integer put(SellerRetrievePwd sellerRetrievePwd);

}