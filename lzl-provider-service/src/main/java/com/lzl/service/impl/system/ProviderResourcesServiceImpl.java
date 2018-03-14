package com.lzl.service.impl.system;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.lzl.bean.javashop.system.ProviderResources;
import com.lzl.common.Pager;
import com.lzl.dao.javashop.read.system.ProviderResourcesReadDao;
import com.lzl.dao.javashop.write.system.ProviderResourcesWriteDao;
import com.lzl.exception.BusinessException;
import com.lzl.service.system.IProviderResourcesService;

/**
 * 资源表
 * 描述：SystemResources 服务实现层
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:24
 */
@Service(value = "systemResourcesService")
public class ProviderResourcesServiceImpl implements IProviderResourcesService {

    @Resource
    private ProviderResourcesWriteDao providerResourcesWriteDao;

    @Resource
    private ProviderResourcesReadDao  providerResourcesReadDao;
    /*
    @Resource
    private SystemRolesReadDao      systemRolesReadDao;
    */
    @Resource
    private DataSourceTransactionManager    transactionManager;

    /**
     * 查询资源列表
     */
    public List<ProviderResources> get(Map<String, Object> queryMap, Pager pager) throws Exception {
        queryMap.put("scope", ProviderResources.S_PROVIDER);
        queryMap.put("pid", 0);
        queryMap.put("status", ProviderResources.NORMAL);
        if (pager != null) {
            if (pager.isGetCount()) {
                pager.setRowsCount(providerResourcesReadDao.getCount(queryMap));
            }
            queryMap.put("start", pager.getStart());
            queryMap.put("size", pager.getPageSize());
        }
        // × 此处应该查询登陆者的权限集合(授权不能大于自身权限),而此处是将所有pid为0的权限都查询出来了(不符合 授权不能大于自身权限)
        // 此处是正确的，先将所有的权限都查询出来，再将该登陆用户的权限都查询出来，
        // 然后根据前台传来的resourcesIds集合(该集合是 所有权限 的子集)，遍历这些ids，当某个id属于登陆用户的权限集时，
        // 将该id对应的权限写入所修改的角色中
        List<ProviderResources> providerResourcesList = providerResourcesReadDao.get(queryMap);
        System.out.println("::::::::::::systemResourcesList:::::::" + providerResourcesList);
        // 当providerRolesId为null时，表示前台没有传递角色ID到后台，此时将登录者的权限全部显示，没有选中的权限
        // providerRolesId为null时，表示 资源管理 中对资源的查询
        if(queryMap.get("providerRolesId")==null){
            for (ProviderResources providerResources : providerResourcesList) {
                List<ProviderResources> childrenList = getChildrenList(providerResources.getId());
                providerResources.setChildren(childrenList);
            }
        // 否则，就要根据providerRolesId将该用户的
        }else{
            Integer providerRolesId = Integer.valueOf((String) queryMap.get("providerRolesId"));
            List<Integer> urlList = providerResourcesReadDao.getResourceIdByRoleId(providerRolesId,ProviderResources.S_PROVIDER);
            for (ProviderResources providerResources : providerResourcesList) {
                // 以下父节点不必选中
            	/*if(urlList.contains(systemResources.getId())){
                    systemResources.setChecked(false);
                }*/
                List<ProviderResources> childrenList = getChildrenList(providerResources.getId(),urlList);
                providerResources.setChildren(childrenList);
            }
        }
        

        return providerResourcesList;
    }

    /**
     * 新增资源
     * @param systemResources
     */
    public Boolean post(ProviderResources providerResources) throws Exception {

        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED); // 事物隔离级别
        TransactionStatus status = transactionManager.getTransaction(def); // 获得事务状态
        try {
            providerResources.setPid(0);
            providerResources.setScope(ProviderResources.S_PROVIDER);
            int result = providerResourcesWriteDao.post(providerResources);
            if(result>0){
                postChildren(providerResources);
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
    public Boolean put(ProviderResources providerResources) throws Exception {
        int result = providerResourcesWriteDao.put(providerResources);
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
            List<ProviderResources> list = getChildrenList(id);
            //删除子资源
            if (list != null && list.size() > 0) {
                for (ProviderResources sr : list) {
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
        return providerResourcesReadDao.getResourceByRoleId(roleId, scope);
    }
    
    /**
     * 查询对应平台对应角色的资源id列表
     * @param roleId
     * @param scope
     */
    public List<Integer> getResourceIdByRoleId(Integer roleId, Integer scope) {
        if (roleId == null)
            throw new BusinessException("未指定角色");
        return providerResourcesReadDao.getResourceIdByRoleId(roleId, scope);
    }

    /*********************************************************下面是内部方法******************************************************************/

    /**
     * 增加子资源 
     */
    private void postChildren(ProviderResources providerResources) {
        Map<String, String> childrenMap = new HashMap<>();
        childrenMap.put(":read", ":查看");
        childrenMap.put(":delete", ":删除");
        childrenMap.put(":create", ":新增");
        childrenMap.put(":update", ":更新");
        for (Map.Entry<String, String> entry : childrenMap.entrySet()) {
            ProviderResources children = new ProviderResources();
            children.setPid(providerResources.getId());
            children.setScope(ProviderResources.S_PROVIDER);
            children.setUrl(providerResources.getUrl() + entry.getKey());
            children.setContent(providerResources.getContent() + entry.getValue());
            providerResourcesWriteDao.post(children);
        }
    }

    /**
     * 查询子资源 
     */
    private List<ProviderResources> getChildrenList(Integer pid) {
        Map<String, Object> childrenMap = new HashMap<>();
        childrenMap.put("pid", pid);
        childrenMap.put("status", ProviderResources.NORMAL);
        return providerResourcesReadDao.get(childrenMap);
    }
    
    /**
     * 查询子资源 是否选中
     */
    private List<ProviderResources> getChildrenList(Integer pid,List<Integer> urls) {
        Map<String, Object> childrenMap = new HashMap<>();
        childrenMap.put("pid", pid);
        childrenMap.put("status", ProviderResources.NORMAL);
        List<ProviderResources> list = providerResourcesReadDao.get(childrenMap);
        for(ProviderResources providerResources : list){
            if(urls.contains(providerResources.getId())){
                providerResources.setChecked(true);
            }
        }
        return list;
    }

    /**
     * 删除该资源
     * 对于资源(权限)是不能随意从数据库中删除掉的，可以通过其状态判断其是否可用
     */
    private boolean deleteResources(Integer id) {
        //删除该资源
        ProviderResources providerResources = new ProviderResources();
        providerResources.setId(id);
        providerResources.setStatus(ProviderResources.DELETE);
        int result = providerResourcesWriteDao.put(providerResources);
        return result > 0;
    }

}
