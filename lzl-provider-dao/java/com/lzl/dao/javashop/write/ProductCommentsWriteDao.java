package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.ProductComments;
/**
 * 商品评论管理
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:20
 */
public interface ProductCommentsWriteDao {
	
    Integer post(ProductComments productComments);

    Integer put(ProductComments productComments);

}