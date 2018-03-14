package com.lzl.dao.javashop.read.refund;

import java.util.List;
import java.util.Map;
import com.lzl.bean.javashop.refund.Refund;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-02-27 16:06:31
 */
public interface RefundReadDao {
	/**通过id查询*/
	Refund getById(Integer id);
	/**查询列表*/
	List<Refund> get(Map<String, Object> queryMap);
	/**查询数量*/
	Integer getCount(Map<String, Object> queryMap);

}