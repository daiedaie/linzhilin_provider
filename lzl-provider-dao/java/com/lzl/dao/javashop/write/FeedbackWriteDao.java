package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.Feedback;
/**
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:17
 */
public interface FeedbackWriteDao {
	
    Integer post(Feedback feedback);

    Integer put(Feedback feedback);

}