package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.Goods;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:01
 */
public interface GoodsWriteDao {
	/**
	 * 新增商品
	 * @param goods
	 * @return
	 */
    Integer post(Goods goods);

    /**
     * 修改商品
     * @param goods
     * @return
     */
	Integer put(Goods goods);
	
	/**
	 * 根据商品ID删除商品
	 * @param goodsId
	 * @return
	 */
	Integer deleteGoodsById(Integer goodsId);
}