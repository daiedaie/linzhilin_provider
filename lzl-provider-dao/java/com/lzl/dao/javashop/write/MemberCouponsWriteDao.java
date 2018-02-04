package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.MemberCoupons;
/**
 * 活动：用户优惠券
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:18
 */
public interface MemberCouponsWriteDao {
	
    Integer post(MemberCoupons memberCoupons);

    Integer put(MemberCoupons memberCoupons);

}