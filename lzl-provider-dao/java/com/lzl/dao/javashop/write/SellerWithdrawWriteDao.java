package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.SellerWithdraw;
/**
 * 商家提现表(目前没有提现，等代码整理确认后，可以删除)
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:22
 */
public interface SellerWithdrawWriteDao {
	
    Integer post(SellerWithdraw sellerWithdraw);

    Integer put(SellerWithdraw sellerWithdraw);

}