package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.ProductCate;
/**
 * 商品分类
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:20
 */
public interface ProductCateWriteDao {
	
    Integer post(ProductCate productCate);

    Integer put(ProductCate productCate);

}