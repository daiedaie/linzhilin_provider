package com.lzl.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.lzl.bean.javashop.SystemResources;
import com.lzl.common.Pager;
import com.lzl.dao.javashop.read.SystemResourcesReadDao;
import com.lzl.dao.javashop.read.SystemRolesReadDao;
import com.lzl.dao.javashop.write.SystemResourcesWriteDao;
import com.lzl.exception.BusinessException;
import com.lzl.service.ISystemResourcesService;

/**
 * 资源表
 * 描述：SystemResources 服务实现层
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:24
 */
@Service(value = "systemResourcesService")
public class SystemResourcesServiceImpl implements ISystemResourcesService {

    @Resource
    private SystemResourcesWriteDao systemResourcesWriteDao;

    @Resource
    private SystemResourcesReadDao  systemResourcesReadDao;

    @Resource
    private SystemRolesReadDao      systemRolesReadDao;
    
    @Resource
    private DataSourceTransactionManager    transactionManager;

    /**
     * 查询资源列表
     */
    public List<SystemResources> get(Map<String, Object> queryMap, Pager pager) throws Exception {
        queryMap.put("scope", SystemResources.S_ADMIN);
        queryMap.put("pid", 0);
        queryMap.put("status", SystemResources.NORMAL);
        if (pager != null) {
            if (pager.isGetCount()) {
                pager.setRowsCount(systemResourcesReadDao.getCount(queryMap));
            }
            queryMap.put("start", pager.getStart());
            queryMap.put("size", pager.getPageSize());
        }
        List<SystemResources> systemResourcesList = systemResourcesReadDao.get(queryMap);
        
        if(queryMap.get("rolesId")==null){
            for (SystemResources systemResources : systemResourcesList) {
                List<SystemResources> childrenList = getChildrenList(systemResources.getId());
                systemResources.setChildren(childrenList);
            }
        }else{
            Integer rolesId = Integer.valueOf((String) queryMap.get("rolesId"));
            List<Integer> urlList = systemResourcesReadDao.getResourceIdByRoleId(rolesId,SystemResources.S_ADMIN);
            for (SystemResources systemResources : systemResourcesList) {
                if(urlList.contains(systemResources.getId())){
                    systemResources.setChecked(true);
                }
                List<SystemResources> childrenList = getChildrenList(systemResources.getId(),urlList);
                systemResources.setChildren(childrenList);
            }
        }
        

        return systemResourcesList;
    }

    /**
     * 新增资源
     * @param systemResources
     */
    public Boolean post(SystemResources systemResources) throws Exception {

        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED); // 事物隔离级别
        TransactionStatus status = transactionManager.getTransaction(def); // 获得事务状态
        try {
            systemResources.setPid(0);
            systemResources.setScope(SystemResources.S_ADMIN);
            int result = systemResourcesWriteDao.post(systemResources);
            if(result>0){
                postChildren(systemResources);
            }
            transactionManager.commit(status);
            return true;
        } catch (Exception e) {
            transactionManager.rollback(status);
            throw e;
        }
    }

    /**
     * 更新资源
     * @param systemResources
     */
    public Boolean put(SystemResources systemResources) throws Exception {
        int result = systemResourcesWriteDao.put(systemResources);
        return result > 0;
    }

    /**
     * 删除资源
     * @param id
     */
    public Boolean delete(Integer id) throws Exception {
        boolean result = true;
        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED); // 事物隔离级别
        TransactionStatus status = transactionManager.getTransaction(def); // 获得事务状态
        try {
            List<SystemResources> list = getChildrenList(id);
            //删除子资源
            if (list != null && list.size() > 0) {
                for (SystemResources sr : list) {
                    if (result) {
                        result = deleteResources(sr.getId());
                    }
                }
            }
            if (result) {
                result = deleteResources(id);
            }
            transactionManager.commit(status);
            return true;
        } catch (Exception e) {
            transactionManager.rollback(status);
            throw e;
        }

    }

    /**
     * 查询对应平台对应角色的资源url列表
     * @param roleId
     * @param scope
     */
    public List<String> getResourceByRoleId(Integer roleId, Integer scope) {
        if (roleId == null)
            throw new BusinessException("未指定角色");
        return systemResourcesReadDao.getResourceByRoleId(roleId, scope);
    }
    
    /**
     * 查询对应平台对应角色的资源id列表
     * @param roleId
     * @param scope
     */
    public List<Integer> getResourceIdByRoleId(Integer roleId, Integer scope) {
        if (roleId == null)
            throw new BusinessException("未指定角色");
        return systemResourcesReadDao.getResourceIdByRoleId(roleId, scope);
    }

    /*********************************************************下面是内部方法******************************************************************/

    /**
     * 增加子资源 
     */
    private void postChildren(SystemResources systemResources) {
        Map<String, String> childrenMap = new HashMap<>();
        childrenMap.put(":read", ":查看");
        childrenMap.put(":delete", ":删除");
        childrenMap.put(":create", ":新增");
        childrenMap.put(":update", ":更新");
        for (Map.Entry<String, String> entry : childrenMap.entrySet()) {
            SystemResources children = new SystemResources();
            children.setPid(systemResources.getId());
            children.setScope(SystemResources.S_ADMIN);
            children.setUrl(systemResources.getUrl() + entry.getKey());
            children.setContent(systemResources.getContent() + entry.getValue());
            systemResourcesWriteDao.post(children);
        }
    }

    /**
     * 查询子资源 
     */
    private List<SystemResources> getChildrenList(Integer pid) {
        Map<String, Object> childrenMap = new HashMap<>();
        childrenMap.put("pid", pid);
        childrenMap.put("status", SystemResources.NORMAL);
        return systemResourcesReadDao.get(childrenMap);
    }
    
    /**
     * 查询子资源 是否选中
     */
    private List<SystemResources> getChildrenList(Integer pid,List<Integer> urls) {
        Map<String, Object> childrenMap = new HashMap<>();
        childrenMap.put("pid", pid);
        childrenMap.put("status", SystemResources.NORMAL);
        List<SystemResources> list = systemResourcesReadDao.get(childrenMap);
        for(SystemResources systemResources : list){
            if(urls.contains(systemResources.getId())){
                systemResources.setChecked(true);
            }
        }
        return list;
    }

    /**
     * 删除该资源
     */
    private boolean deleteResources(Integer id) {
        //删除该资源
        SystemResources systemResources = new SystemResources();
        systemResources.setId(id);
        systemResources.setStatus(SystemResources.DELETE);
        int result = systemResourcesWriteDao.put(systemResources);
        return result > 0;
    }

}
