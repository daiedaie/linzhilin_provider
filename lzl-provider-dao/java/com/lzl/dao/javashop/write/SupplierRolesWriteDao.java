package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.SupplierRoles;
/**
 * 供应商角色表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:23
 */
public interface SupplierRolesWriteDao {
	
    Integer post(SupplierRoles supplierRoles);

    Integer put(SupplierRoles supplierRoles);

}