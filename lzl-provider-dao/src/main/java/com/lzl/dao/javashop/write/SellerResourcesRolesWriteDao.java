package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.SellerResourcesRoles;
/**
 * 商家角色资源对应表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:21
 */
public interface SellerResourcesRolesWriteDao {
	
    Integer post(SellerResourcesRoles sellerResourcesRoles);

    Integer put(SellerResourcesRoles sellerResourcesRoles);

}