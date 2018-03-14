package com.lzl.service.impl.system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.lzl.bean.javashop.system.ProviderResources;
import com.lzl.bean.javashop.system.ProviderResourcesRoles;
import com.lzl.dao.javashop.read.system.ProviderResourcesReadDao;
import com.lzl.dao.javashop.read.system.ProviderResourcesRolesReadDao;
import com.lzl.dao.javashop.write.system.ProviderResourcesRolesWriteDao;
import com.lzl.exception.BusinessException;
import com.lzl.service.system.IProviderResourcesRolesService;

/**
 * 描述：ProviderResourcesRoles 服务实现层
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:04
 */
@Service(value = "providerResourcesRolesService")
public class ProviderResourcesRolesServiceImpl implements IProviderResourcesRolesService{

	@Resource
    private ProviderResourcesRolesWriteDao providerResourcesRolesWriteDao;
	
	@Resource
    private ProviderResourcesRolesReadDao providerResourcesRolesReadDao;

    @Resource
    private ProviderResourcesReadDao providerResourcesReadDao;
    
    // 批量添加权限，需要使用到事务，此处为事务管理器
    @Resource
    private DataSourceTransactionManager    transactionManager;

    public Boolean put(ProviderResourcesRoles providerResourcesRoles) throws Exception {
        // 当前台没有选择任何权限，则给出提示
        if(providerResourcesRoles.getResourcesIds()==null || providerResourcesRoles.getResourcesIds().size()==0){
            throw new BusinessException("权限不能为空");
        }
        // 定义并开启事务，并且追踪事务的状态TransactionStatus
        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED); // 事物隔离级别
        TransactionStatus status = transactionManager.getTransaction(def); // 获得事务状态
        try {
            
        	// 查询该rolesId下的资源总数
            Map<String,Object> queryMap = new HashMap<>();
            queryMap.put("providerRolesId", providerResourcesRoles.getProviderRolesId());
            Integer count = providerResourcesRolesReadDao.getCount(queryMap);
            
            /*
            <delete id="delete">
    			delete from system_resources_roles
    			where roles_id = #{rolesId}
    		</delete>
            */
            
            // 此处应该等于 -1
            int result = 1;
            
            // 删除该rolesId下的所有资源
            if(count!=null && count>0){
                result = providerResourcesRolesWriteDao.deleteByProviderRolesId(providerResourcesRoles.getProviderRolesId()); 
            }
            
            // 获取权限分配者（登陆用户）的所有资源ID，是该登陆者为角色重新分配权限
            List<Integer> createRolesResourceslist = providerResourcesReadDao.getResourceIdByRoleId(providerResourcesRoles.getCreateRolesId(),ProviderResources.S_PROVIDER);
            System.out.println(":::::::;;CreateRolesId::::" + providerResourcesRoles.getCreateRolesId());
            System.out.println(":::::::::::::::::::createRolesResourceslist:::::::::" + createRolesResourceslist);
            // 如果上面删除成功，则result > 0.如果删除失败则不进行以下重新分配权限的操作
            // 当删除成功后,便可将前台赋予该角色的新的权限集resourcesIds加入到该角色中
            if(result > 0){
                List<ProviderResourcesRoles> list = new ArrayList<>();
                Set<Integer> parentResourcesIds = new HashSet<>(0);
                Set<Integer> isParentResourcesIds = new HashSet<>(0);
                // 前台传入的角色ID集到放在resourcesIds属性中了
                for(String resourcesIdStr : providerResourcesRoles.getResourcesIds()){
                    
                    Integer resourcesId = Integer.valueOf(resourcesIdStr);
                    // 该角色可能拥有的权限特别多，该角色所有的权限中可能有一部分散布在该登陆者的权限中
                    if(createRolesResourceslist.contains(resourcesId)){
                    	// 所有的SystemResourcesRoles要一条一条的保存到SystemResourcesRoles表中
                    	ProviderResourcesRoles prr = new ProviderResourcesRoles();
                    	
                        // 在SystemResourcesRoles表中以下两个属性最为重要
                        prr.setProviderRolesId(providerResourcesRoles.getProviderRolesId());
                    	prr.setSystemResourcesId(resourcesId);
                    	
                    	if(this.getParent(resourcesId) == null){
                    		isParentResourcesIds.add(resourcesId);
                    	}else{
                    		parentResourcesIds.add(this.getParent(resourcesId));
                    	}
                    	
                        list.add(prr);
                    }
                }
                // 如果前台传来的是一个子资源，则应连该子资源的父资源一并保存到providerResourcesRoles表中
                if(parentResourcesIds != null && parentResourcesIds.size() > 0){
                	System.out.println("::::::父资源集合::::::::" + parentResourcesIds);
                	if(isParentResourcesIds != null && isParentResourcesIds.size() > 0){
                		parentResourcesIds.removeAll(isParentResourcesIds);
                	}
                	System.out.println("::::::调整后的父资源集合::::::::" + parentResourcesIds);
                	for (Integer parentResourcesId : parentResourcesIds) {
            			ProviderResourcesRoles prr = new ProviderResourcesRoles();
            			prr.setProviderRolesId(providerResourcesRoles.getProviderRolesId());
            			prr.setSystemResourcesId(parentResourcesId);
            			list.add(prr);
					}
                }
                /*
                <insert id="post" parameterType="java.util.List">
        			replace into system_resources_roles
        				(resources_id,roles_id,create_time)
        			values
        				<foreach collection="list" item="item" index="index" separator=",">
        					(#{item.resourcesId},#{item.rolesId},now())
        				</foreach>
        		</insert>
        		*/
                // 该处post使用的是replace into语句，防止原有记录存在导致的错误
                System.out.println(":::::::::::list::::::::::::" + list);
                result = providerResourcesRolesWriteDao.post(list);
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
    
    public Integer getParent(Integer childResourceId){
    	Integer parentResourceId = providerResourcesReadDao.getParentResourceId(childResourceId);
    	return parentResourceId;
    }

}
