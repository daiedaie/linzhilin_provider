package com.lzl.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lzl.bean.javashop.SystemAdmin;
import com.lzl.bean.javashop.SystemRoles;
import com.lzl.common.Pager;
import com.lzl.dao.javashop.read.SystemAdminReadDao;
import com.lzl.dao.javashop.read.SystemRolesReadDao;
import com.lzl.dao.javashop.write.SystemAdminWriteDao;
import com.lzl.service.ISystemAdminService;

/**
 * 系统管理员表
 * 描述：SystemAdmin 服务实现层
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:24
 */
@Service(value = "systemAdminService")
public class SystemAdminServiceImpl implements ISystemAdminService {

    @Resource
    private SystemAdminWriteDao systemAdminWriteDao;

    @Resource
    private SystemAdminReadDao  systemAdminReadDao;

    @Resource
    private SystemRolesReadDao  systemRolesReadDao;

    public SystemAdmin getById(Integer id) throws Exception {
        SystemAdmin systemAdmin = systemAdminReadDao.getById(id);
        return systemAdmin;
    }

    /**查询管理员列表*/
    public List<SystemAdmin> get(Map<String, Object> queryMap, Pager pager) throws Exception {
        if (pager != null) {
            if (pager.isGetCount()) {
                pager.setRowsCount(systemAdminReadDao.getCount(queryMap));
            }
            queryMap.put("start", pager.getStart());
            queryMap.put("size", pager.getPageSize());
        }

        List<SystemAdmin> systemAdminList = systemAdminReadDao.get(queryMap);

        setRoleName(systemAdminList);

        return systemAdminList;
    }

    public Boolean post(SystemAdmin systemAdmin) throws Exception {
        int result = systemAdminWriteDao.post(systemAdmin);
        return result > 0;
    }

    public Boolean put(SystemAdmin systemAdmin) throws Exception {
        int result = systemAdminWriteDao.put(systemAdmin);
        return result > 0;
    }
    
    public Boolean delete(Integer id) throws Exception {
        SystemAdmin systemAdmin = new SystemAdmin();
        systemAdmin.setId(id);
        systemAdmin.setStatus(SystemAdmin.DELETE);
        int result = systemAdminWriteDao.put(systemAdmin);
        return result > 0;
    }
    
    /**************************************************上面是公共方法，下面是私有方法***************************************************************/

    /*** 设置管理员角色名称*/
    private void setRoleName(List<SystemAdmin> list) {
        for (SystemAdmin admin : list) {
            SystemRoles sr = systemRolesReadDao.getById(admin.getRoleId());
            if (sr != null)
                admin.setRoleName(sr.getRolesName());
        }
    }

}
