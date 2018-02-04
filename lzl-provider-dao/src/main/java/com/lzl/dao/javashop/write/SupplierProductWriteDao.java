package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.SupplierProduct;
/**
 * 供应商商品表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:23
 */
public interface SupplierProductWriteDao {
	
    Integer post(SupplierProduct supplierProduct);

    Integer put(SupplierProduct supplierProduct);

}