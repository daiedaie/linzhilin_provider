package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.SellerRoles;
/**
 * 商家角色表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:22
 */
public interface SellerRolesWriteDao {
	
    Integer post(SellerRoles sellerRoles);

    Integer put(SellerRoles sellerRoles);

}