package com.lzl.dao.javashop.read.tax;

import java.util.List;
import java.util.Map;
import com.lzl.bean.javashop.tax.TaxRate;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-03-10 16:28:18
 */
public interface TaxRateReadDao {
	/**通过id查询*/
	TaxRate getById(Integer id);
	/**查询列表*/
	List<TaxRate> get(Map<String, Object> queryMap);
	/**查询数量*/
	Integer getCount(Map<String, Object> queryMap);

}