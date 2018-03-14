package com.lzl.service.impl.tax;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.lzl.bean.javashop.tax.TaxRate;
import com.lzl.common.Pager;
import com.lzl.dao.javashop.write.tax.TaxRateWriteDao;
import com.lzl.dao.javashop.read.tax.TaxRateReadDao;
import com.lzl.service.tax.ITaxRateService;

/**
 * 描述：TaxRate 服务实现层
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-03-10 16:28:18
 */
@Service(value = "taxRateService")
public class TaxRateServiceImpl implements ITaxRateService{
	 
	@Resource
    private TaxRateWriteDao taxRateWriteDao;

	@Resource
    private TaxRateReadDao taxRateReadDao;
	
	/**列表查询*/
    public List<TaxRate> get(Map<String, Object> queryMap, Pager pager)throws Exception {
		if (pager != null) {
			if(pager.isGetCount()){
				pager.setRowsCount(taxRateReadDao.getCount(queryMap));
			}
            queryMap.put("start", pager.getStart());
            queryMap.put("size", pager.getPageSize());
        }
        List<TaxRate> taxRateList = taxRateReadDao.get(queryMap);
        return taxRateList;
    }

	/**新增*/
    public Boolean post(TaxRate taxRate) throws Exception {
        int result = taxRateWriteDao.post(taxRate);
        return result > 0 ;
    }

	/**更新*/
    public Boolean put(TaxRate taxRate) throws Exception {
        int result = taxRateWriteDao.put(taxRate);
        return result > 0 ;
    }
    /**删除*/
	@Override
	public Boolean delete(Integer taxRateId) {
		int result = taxRateWriteDao.deleteById(taxRateId);
		return result > 0;
	}
	
	/**************************************************上面是公共方法，下面是私有方法***************************************************************/

}
