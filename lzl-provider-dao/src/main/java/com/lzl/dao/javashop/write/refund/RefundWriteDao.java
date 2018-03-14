package com.lzl.dao.javashop.write.refund;

import com.lzl.bean.javashop.refund.Refund;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-02-27 16:06:31
 */
public interface RefundWriteDao {
	/**新增*/
    Integer post(Refund refund);
	/**更新*/
    Integer put(Refund refund);

}