package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.Cart;
/**
 * 商城购物车
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:16
 */
public interface CartWriteDao {
	
    Integer post(Cart cart);

    Integer put(Cart cart);

}