package com.lzl.service;

import java.util.List;
import java.util.Map;
import com.lzl.common.Pager;
import com.lzl.bean.javashop.SystemAdmin;

/**
 * 系统管理员表
 * 描述：SystemAdmin 服务实现层接口
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:24
 */
public interface ISystemAdminService {

    SystemAdmin getById(Integer id)throws Exception;
	
	List<SystemAdmin> get(Map<String, Object> queryMap, Pager pager)throws Exception;

    Boolean post(SystemAdmin systemAdmin) throws Exception;

    Boolean put(SystemAdmin systemAdmin) throws Exception;
    
    Boolean delete(Integer id) throws Exception;

}
