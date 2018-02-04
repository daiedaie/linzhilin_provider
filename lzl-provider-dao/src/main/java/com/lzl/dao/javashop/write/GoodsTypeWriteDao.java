package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.GoodsType;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:02
 */
public interface GoodsTypeWriteDao {
	
    Integer post(GoodsType goodsType);

	Integer put(GoodsType goodsType);
	
	Integer deleteGoodsTypeById(Integer goodsTypeId);
	
}