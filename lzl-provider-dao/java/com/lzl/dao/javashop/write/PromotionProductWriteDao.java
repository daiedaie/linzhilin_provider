package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.PromotionProduct;
/**
 * 活动商品
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:21
 */
public interface PromotionProductWriteDao {
	
    Integer post(PromotionProduct promotionProduct);

    Integer put(PromotionProduct promotionProduct);

}