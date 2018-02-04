package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.PromotionAlarm;
/**
 * 促销活动预警记录
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:20
 */
public interface PromotionAlarmWriteDao {
	
    Integer post(PromotionAlarm promotionAlarm);

    Integer put(PromotionAlarm promotionAlarm);

}