package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.Regions;
/**
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:21
 */
public interface RegionsWriteDao {
	
    Integer post(Regions regions);

    Integer put(Regions regions);

}