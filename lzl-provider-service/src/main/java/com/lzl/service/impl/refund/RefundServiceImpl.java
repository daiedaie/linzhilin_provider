package com.lzl.service.impl.refund;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.lzl.bean.javashop.refund.Refund;
import com.lzl.common.Pager;
import com.lzl.dao.javashop.write.refund.RefundWriteDao;
import com.lzl.dao.javashop.read.refund.RefundReadDao;
import com.lzl.service.refund.IRefundService;

/**
 * 描述：Refund 服务实现层
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-02-27 16:06:31
 */
@Service(value = "refundService")
public class RefundServiceImpl implements IRefundService{
	
	@Resource
    private RefundWriteDao refundWriteDao;

	@Resource
    private RefundReadDao refundReadDao;
	
	/**列表查询*/
    public List<Refund> get(Map<String, Object> queryMap, Pager pager)throws Exception {
		if (pager != null) {
			if(pager.isGetCount()){
				pager.setRowsCount(refundReadDao.getCount(queryMap));
			}
            queryMap.put("start", pager.getStart());
            queryMap.put("size", pager.getPageSize());
        }
        List<Refund> refundList = refundReadDao.get(queryMap);
        return refundList;
    }

	/**新增*/
    public Boolean post(Refund refund) throws Exception {
        int result = refundWriteDao.post(refund);
        return result > 0 ;
    }

	/**更新*/
    public Boolean put(Refund refund) throws Exception {
        int result = refundWriteDao.put(refund);
        return result > 0 ;
    }
	
	/**************************************************上面是公共方法，下面是私有方法***************************************************************/

}
