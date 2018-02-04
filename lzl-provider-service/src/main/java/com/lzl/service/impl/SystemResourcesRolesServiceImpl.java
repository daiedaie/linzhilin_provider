package com.lzl.service.impl;

import java.util.ArrayList;
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
import com.lzl.bean.javashop.SystemResourcesRoles;
import com.lzl.dao.javashop.read.SystemResourcesReadDao;
import com.lzl.dao.javashop.read.SystemResourcesRolesReadDao;
import com.lzl.dao.javashop.write.SystemResourcesRolesWriteDao;
import com.lzl.exception.BusinessException;
import com.lzl.service.ISystemResourcesRolesService;

/**
 * 系统资源角色关系表
 */
@Service(value = "systemResourcesRolesService")
public class SystemResourcesRolesServiceImpl implements ISystemResourcesRolesService{
	
	@Resource
    private SystemResourcesRolesWriteDao systemResourcesRolesWriteDao;
	
	@Resource
    private SystemResourcesRolesReadDao systemResourcesRolesReadDao;

    @Resource
    private SystemResourcesReadDao systemResourcesReadDao;
    
    @Resource
    private DataSourceTransactionManager    transactionManager;

    public Boolean put(SystemResourcesRoles systemResourcesRoles) throws Exception {
        
        if(systemResourcesRoles.getResourcesIds()==null || systemResourcesRoles.getResourcesIds().size()==0){
            throw new BusinessException("权限不能为空");
        }
        
        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED); // 事物隔离级别
        TransactionStatus status = transactionManager.getTransaction(def); // 获得事务状态
        try {
            
            Map<String,Object> queryMap = new HashMap<>();
            queryMap.put("rolesId", systemResourcesRoles.getRolesId());
            Integer count = systemResourcesRolesReadDao.getCount(queryMap);
            
            int result = 1;
            if(count!=null && count>0){
                result = systemResourcesRolesWriteDao.delete(systemResourcesRoles.getRolesId()); 
            }
            
            //
            List<Integer> createRolesResourceslist = systemResourcesReadDao.getResourceIdByRoleId(systemResourcesRoles.getCreateRolesId(),SystemResources.S_ADMIN);
            
            if(result > 0){
                List<SystemResourcesRoles> list = new ArrayList<>();
                for(String resourcesIdStr : systemResourcesRoles.getResourcesIds()){
                    
                    Integer resourcesId = Integer.valueOf(resourcesIdStr);
                    
                    if(createRolesResourceslist.contains(resourcesId)){
                        SystemResourcesRoles srr = new SystemResourcesRoles();
                        srr.setRolesId(systemResourcesRoles.getRolesId());
                        srr.setResourcesId(resourcesId);
                        list.add(srr);
                    }
                }
                result = systemResourcesRolesWriteDao.post(list);
            }

            if(result > 0 ){
                transactionManager.commit(status);
                return true;
            }else{
                throw new BusinessException("操作失败");
            }
        } catch (Exception e) {
            transactionManager.rollback(status);
            throw e;
        }
    }

}
