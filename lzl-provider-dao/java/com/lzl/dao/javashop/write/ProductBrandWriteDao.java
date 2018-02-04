package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.ProductBrand;
/**
 * 商品品牌
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:20
 */
public interface ProductBrandWriteDao {
	
    Integer post(ProductBrand productBrand);

    Integer put(ProductBrand productBrand);

}