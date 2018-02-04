package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.SupplierManageCate;
/**
 * 供应商可以经营商品分类表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:23
 */
public interface SupplierManageCateWriteDao {
	
    Integer post(SupplierManageCate supplierManageCate);

    Integer put(SupplierManageCate supplierManageCate);

}