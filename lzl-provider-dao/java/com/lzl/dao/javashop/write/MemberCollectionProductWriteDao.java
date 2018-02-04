package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.MemberCollectionProduct;
/**
 * 会员收藏商品表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:18
 */
public interface MemberCollectionProductWriteDao {
	
    Integer post(MemberCollectionProduct memberCollectionProduct);

    Integer put(MemberCollectionProduct memberCollectionProduct);

}