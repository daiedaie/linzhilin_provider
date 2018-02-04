package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.SupplierUser;
/**
 * 供应商用户表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:23
 */
public interface SupplierUserWriteDao {
	
    Integer post(SupplierUser supplierUser);

    Integer put(SupplierUser supplierUser);

}