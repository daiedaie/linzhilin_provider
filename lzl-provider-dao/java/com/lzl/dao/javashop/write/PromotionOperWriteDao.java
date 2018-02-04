package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.PromotionOper;
/**
 * 活动操作记录
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:21
 */
public interface PromotionOperWriteDao {
	
    Integer post(PromotionOper promotionOper);

    Integer put(PromotionOper promotionOper);

}