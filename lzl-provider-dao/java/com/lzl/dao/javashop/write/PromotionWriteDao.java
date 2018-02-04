package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.Promotion;
/**
 * 促销活动
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:20
 */
public interface PromotionWriteDao {
	
    Integer post(Promotion promotion);

    Integer put(Promotion promotion);

}