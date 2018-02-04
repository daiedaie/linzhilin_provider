package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.SupplierResourcesRoles;
/**
 * 供应商角色资源对应表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:23
 */
public interface SupplierResourcesRolesWriteDao {
	
    Integer post(SupplierResourcesRoles supplierResourcesRoles);

    Integer put(SupplierResourcesRoles supplierResourcesRoles);

}