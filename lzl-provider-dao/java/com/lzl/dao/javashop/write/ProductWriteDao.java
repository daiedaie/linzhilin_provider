package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.Product;
/**
 * 商品表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:20
 */
public interface ProductWriteDao {
	
    Integer post(Product product);

    Integer put(Product product);

}