package com.lzl.dao.javashop.write.tax;

import com.lzl.bean.javashop.tax.TaxRate;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-03-10 16:28:18
 */
public interface TaxRateWriteDao {
	/**新增*/
    Integer post(TaxRate taxRate);
	/**更新*/
    Integer put(TaxRate taxRate);
    /**删除*/
    Integer deleteById(Integer taxRateId);

}