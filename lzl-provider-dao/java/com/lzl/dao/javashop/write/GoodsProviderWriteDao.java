package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.GoodsProvider;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:02
 */
public interface GoodsProviderWriteDao {
	
    Integer post(GoodsProvider goodsProvider);

	Integer put(GoodsProvider goodsProvider);
	
	Integer deleteGoodsProviderById(Integer goodsProviderId);
}