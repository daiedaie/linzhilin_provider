package com.lzl.service;

import java.util.List;
import java.util.Map;
import com.lzl.common.Pager;
import com.lzl.bean.javashop.SystemRoles;

/**
 * 系统角色表
 * 描述：SystemRoles 服务实现层接口
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:24
 */
public interface ISystemRolesService {

    SystemRoles getById(Integer id)throws Exception;
	
	List<SystemRoles> get(Map<String, Object> queryMap, Pager pager)throws Exception;

    Boolean post(SystemRoles systemRoles) throws Exception;

    Boolean put(SystemRoles systemRoles) throws Exception;
    
    Boolean delete(Integer id) throws Exception;

}
