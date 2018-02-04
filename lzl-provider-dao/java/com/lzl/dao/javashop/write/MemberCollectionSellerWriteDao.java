package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.MemberCollectionSeller;
/**
 * 会员收藏商铺表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:18
 */
public interface MemberCollectionSellerWriteDao {
	
    Integer post(MemberCollectionSeller memberCollectionSeller);

    Integer put(MemberCollectionSeller memberCollectionSeller);

}