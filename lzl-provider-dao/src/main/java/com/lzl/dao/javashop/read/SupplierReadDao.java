package com.lzl.dao.javashop.read;

import java.util.List;
import java.util.Map;
import com.lzl.bean.javashop.Supplier;
/**
 * 供应商表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:22
 */
public interface SupplierReadDao {
	
	Supplier getById(Integer id);
	
	List<Supplier> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);

}