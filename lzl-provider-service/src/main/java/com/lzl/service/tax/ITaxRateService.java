package com.lzl.service.tax;

import java.util.List;
import java.util.Map;
import com.lzl.common.Pager;
import com.lzl.bean.javashop.tax.TaxRate;

/**
 * 描述：TaxRate 服务实现层接口
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-03-10 16:28:18
 */
public interface ITaxRateService {
	/**列表查询*/
	List<TaxRate> get(Map<String, Object> queryMap, Pager pager)throws Exception;
	/**新增*/
    Boolean post(TaxRate taxRate) throws Exception;
	/**更新*/
    Boolean put(TaxRate taxRate) throws Exception;
    /**删除*/
    Boolean delete(Integer taxRateId);

}
