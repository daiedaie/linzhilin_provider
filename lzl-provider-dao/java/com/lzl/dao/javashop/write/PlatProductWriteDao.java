package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.PlatProduct;
/**
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:20
 */
public interface PlatProductWriteDao {
	
    Integer post(PlatProduct platProduct);

    Integer put(PlatProduct platProduct);

}