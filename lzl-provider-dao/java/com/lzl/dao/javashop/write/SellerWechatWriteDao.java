package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.SellerWechat;
/**
 * 商家微信
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:22
 */
public interface SellerWechatWriteDao {
	
    Integer post(SellerWechat sellerWechat);

    Integer put(SellerWechat sellerWechat);

}