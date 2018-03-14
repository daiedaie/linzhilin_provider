package com.lzl.service.refund;

import java.util.List;
import java.util.Map;
import com.lzl.common.Pager;
import com.lzl.bean.javashop.refund.Refund;

/**
 * 描述：Refund 服务实现层接口
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-02-27 16:06:31
 */
public interface IRefundService {
	/**列表查询*/
	List<Refund> get(Map<String, Object> queryMap, Pager pager)throws Exception;
	/**新增*/
    Boolean post(Refund refund) throws Exception;
	/**更新*/
    Boolean put(Refund refund) throws Exception;

}
