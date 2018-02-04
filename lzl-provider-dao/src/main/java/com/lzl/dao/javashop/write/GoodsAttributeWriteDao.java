package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.GoodsAttribute;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:02
 */
public interface GoodsAttributeWriteDao {
	
    Integer post(GoodsAttribute goodsAttribute);

	Integer put(GoodsAttribute goodsAttribute);
	
	Integer deleteGoodsAttributeById(Integer goodsAttributeId);
	
}