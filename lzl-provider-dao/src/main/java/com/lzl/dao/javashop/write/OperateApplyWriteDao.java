package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.OperateApply;
/**
 * 操作申请
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:19
 */
public interface OperateApplyWriteDao {
	
    Integer post(OperateApply operateApply);

    Integer put(OperateApply operateApply);

}