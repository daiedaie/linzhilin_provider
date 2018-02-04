package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.SupplierApply;
/**
 * 供应商申请表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:22
 */
public interface SupplierApplyWriteDao {
	
    Integer post(SupplierApply supplierApply);

    Integer put(SupplierApply supplierApply);

}