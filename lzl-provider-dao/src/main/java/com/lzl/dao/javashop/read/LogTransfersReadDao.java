package com.lzl.dao.javashop.read;

import java.util.List;
import java.util.Map;
import com.lzl.bean.javashop.LogTransfers;
/**
 * 商家微信转账申请记录
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:18
 */
public interface LogTransfersReadDao {
	
	LogTransfers getById(Integer id);
	
	List<LogTransfers> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);

}