package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.MemberAddress;
/**
 * 收货地址
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:18
 */
public interface MemberAddressWriteDao {
	
    Integer post(MemberAddress memberAddress);

    Integer put(MemberAddress memberAddress);

}