package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.PartnerCity;
/**
 * 管理员城市绑定-目前用于市场管理员
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:19
 */
public interface PartnerCityWriteDao {
	
    Integer post(PartnerCity partnerCity);

    Integer put(PartnerCity partnerCity);

}