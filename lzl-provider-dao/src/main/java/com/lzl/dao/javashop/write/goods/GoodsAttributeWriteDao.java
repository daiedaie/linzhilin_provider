package com.lzl.dao.javashop.write.goods;

import com.lzl.bean.javashop.goods.GoodsAttribute;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-03-14 14:31:18
 */
public interface GoodsAttributeWriteDao {
	/**新增*/
    Integer post(GoodsAttribute goodsAttribute);
	/**更新*/
    Integer put(GoodsAttribute goodsAttribute);

}