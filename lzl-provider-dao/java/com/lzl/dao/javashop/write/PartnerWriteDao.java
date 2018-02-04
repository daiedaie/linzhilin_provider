package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.Partner;
/**
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:19
 */
public interface PartnerWriteDao {
	
    Integer post(Partner partner);

    Integer put(Partner partner);

}