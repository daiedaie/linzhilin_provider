package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.Supplier;
/**
 * 供应商表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:22
 */
public interface SupplierWriteDao {
	
    Integer post(Supplier supplier);

    Integer put(Supplier supplier);

}