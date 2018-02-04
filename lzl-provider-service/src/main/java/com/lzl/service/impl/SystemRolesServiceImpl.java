package com.lzl.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lzl.bean.javashop.SystemRoles;
import com.lzl.common.Pager;
import com.lzl.dao.javashop.read.SystemRolesReadDao;
import com.lzl.dao.javashop.write.SystemRolesWriteDao;
import com.lzl.service.ISystemRolesService;

/**
 * 系统资源表
 * 描述：SystemRoles 服务实现层
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:24
 */
@Service(value = "systemRolesService")
public class SystemRolesServiceImpl implements ISystemRolesService{
	
	@Resource
    private SystemRolesWriteDao systemRolesWriteDao;

	@Resource
    private SystemRolesReadDao systemRolesReadDao;

    public SystemRoles getById(Integer id) throws Exception {
        SystemRoles systemRoles = systemRolesReadDao.getById(id);
        return systemRoles;
    }
	
    public List<SystemRoles> get(Map<String, Object> queryMap, Pager pager)throws Exception {
        queryMap.put("status", SystemRoles.NORMAL);
		if (pager != null) {
			if(pager.isGetCount()){
				pager.setRowsCount(systemRolesReadDao.getCount(queryMap));
			}
            queryMap.put("start", pager.getStart());
            queryMap.put("size", pager.getPageSize());
        }
        List<SystemRoles> systemRolesList = systemRolesReadDao.get(queryMap);
        return systemRolesList;
    }

    public Boolean post(SystemRoles systemRoles) throws Exception {
        int result = systemRolesWriteDao.post(systemRoles);
        return result > 0 ;
    }

    public Boolean put(SystemRoles systemRoles) throws Exception {
        int result = systemRolesWriteDao.put(systemRoles);
        return result > 0 ;
    }

    public Boolean delete(Integer id) throws Exception {
        SystemRoles systemRoles = new SystemRoles();
        systemRoles.setId(id);
        systemRoles.setStatus(SystemRoles.DELETE);
        int result = systemRolesWriteDao.put(systemRoles);
        return result > 0;
    }

}
