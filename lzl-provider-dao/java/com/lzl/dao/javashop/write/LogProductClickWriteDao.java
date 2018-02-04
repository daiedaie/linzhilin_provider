package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.LogProductClick;
/**
 * 商品详情点击
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:17
 */
public interface LogProductClickWriteDao {
	
    Integer post(LogProductClick logProductClick);

    Integer put(LogProductClick logProductClick);

}