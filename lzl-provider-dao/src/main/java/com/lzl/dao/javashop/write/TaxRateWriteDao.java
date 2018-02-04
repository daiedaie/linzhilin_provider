package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.TaxRate;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:04
 */
public interface TaxRateWriteDao {
	
    Integer post(TaxRate taxRate);

	Integer put(TaxRate taxRate);
	
	Integer deleteTaxRateById(Integer taxRateId);
}