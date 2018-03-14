package com.lzl.service.impl.repository;

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

import com.lzl.bean.javashop.repository.Repository;
import com.lzl.common.Pager;
import com.lzl.dao.javashop.read.repository.RepositoryReadDao;
import com.lzl.dao.javashop.write.repository.RepositoryWriteDao;
import com.lzl.exception.BusinessException;
import com.lzl.service.repository.IRepositoryService;

/**
 * 描述：Repository 服务实现层
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-03-12 10:28:45
 */ 
@Service(value = "repositoryService")
public class RepositoryServiceImpl implements IRepositoryService{
	
	@Resource
    private RepositoryWriteDao repositoryWriteDao;

	@Resource
    private RepositoryReadDao repositoryReadDao;
	
	@Resource
    private DataSourceTransactionManager transactionManager;
	
	/**列表查询*/
    public List<Repository> get(Map<String, Object> queryMap, Pager pager)throws Exception {
		if (pager != null) {
			if(pager.isGetCount()){
				pager.setRowsCount(repositoryReadDao.getCount(queryMap));
			}
            queryMap.put("start", pager.getStart());
            queryMap.put("size", pager.getPageSize());
        }
		queryMap.put("levelType", "0");
        List<Repository> parents = repositoryReadDao.get(queryMap);
        //存在父仓库
        //此处有一个问题，如果只查到部分parents，那么该if也符合。所以在保存数据时一定要保证数据的完整性
        //如：当新建父仓库时levelType一定要设定为0，不能为null
        if(parents != null && parents.size() > 0){
        	this.transferData(parents);
        	queryMap.remove("levelType");
        	this.setRepositoryChildren(parents, queryMap);
        	return parents;
        }else {
        	//不存在父仓库，只有子仓库符合该条件
        	queryMap.remove("levelType");
        	List<Repository> children = repositoryReadDao.get(queryMap);
        	if(children != null && children.size() > 0){
        		//只需将该Repository的父仓库找出来即可，不必在乎该父仓库是否符合条件，因为根本就不存在符合条件的父仓库
        		this.transferData(children);
        		List<Repository> parentsWithChildren = this.getRepositoryParents(children);
        		return parentsWithChildren;
        	}else{
        		//没有仓库符合该条件
        		return null;
        	}
        }
    }

	/**新增*/
    public Boolean post(Repository repository) throws Exception {
        int result = repositoryWriteDao.post(repository);
        return result > 0;
    }

	/**更新*/
    public Boolean put(Repository repository) throws Exception {
    	int result = repositoryWriteDao.put(repository);
        return result > 0 ;
    }
	
	/*****************上面是公共方法，下面是私有方法*******************/

    private void setRepositoryChildren(List<Repository> parents, Map<String, Object> queryMap) {
		for(Repository repository : parents){
			queryMap.put("levelType", repository.getRepositoryId());
			List<Repository> children = repositoryReadDao.get(queryMap);
			this.transferData(children);
			repository.setChildren(children);
		}
	}
    
    private List<Repository> getRepositoryParents(List<Repository> children) {
		//Set集合必须重写equals和hashCode方法
    	Set<Repository> parents = new HashSet<>();
    	for(Repository repository : children){
			Map<String, Object> queryMap = new HashMap<String, Object>();
    		queryMap.put("repositoryId", repository.getLevelType());
			Repository parent = repositoryReadDao.get(queryMap).get(0);
			parents.add(parent);
		}
    	this.transferData(new ArrayList<>(parents));
    	for(Repository parent : parents){
    		List<Repository> list = new ArrayList<>();
    		for(Repository child : children){
    			if(Integer.parseInt(child.getLevelType()) == parent.getRepositoryId()){
    				list.add(child);
    			}
    		}
    		parent.setChildren(list);
    	}
    	
    	return new ArrayList<>(parents);
	}
    
    private void transferData(List<Repository> repositories) {
    	for(Repository repository : repositories){
    		/** 虚/实仓 */
    		if(repository.getRealVirtual() != null && !"".equals(repository.getRealVirtual())){
    			int temp = repository.getRealVirtual();
    			if(temp == 1){
    				repository.setRealVirtualStr("实仓");
    			}else if(temp == 0) {
    				repository.setRealVirtualStr("虚仓");
    			}
    		}
    		/** 库存状态 */
    		if(repository.getStatus() != null && !"".equals(repository.getStatus())){
    			int temp = Integer.parseInt(repository.getStatus());
    			if(temp == 1){
    				repository.setStatusStr("正常");
    			}
    			if(temp == 2){
    				repository.setStatusStr("缺货");
    			}
    			if(temp == 3){
    				repository.setStatusStr("已满");
    			}
    		}
    		/** 是否停用 */
    		if(repository.getAvailable() != null && !"".equals(repository.getAvailable())){
    			int temp = repository.getAvailable();
    			if(temp == 1){
    				repository.setAvailableStr("正常");
    			}else if(temp == 0) {
    				repository.setAvailableStr("停用");
    			}
    		}
    		/** 编码层次（中间小-区分父子级别） */
    		if(repository.getLevelType() != null && !"".equals(repository.getLevelType())){
    			int temp = Integer.parseInt(repository.getLevelType());
    			if(temp == 0){
    				repository.setLevelStr("一级");
    			}else{
    				repository.setLevelStr("二级");
    			}
    		}
    	}
	}

	@Override
	public Boolean deleteById(Integer repositoryId) {
		Repository repository = repositoryReadDao.getById(repositoryId);
		
		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        TransactionStatus status = transactionManager.getTransaction(def);
		
        Integer result = null;
        try {
			if(repository != null){
				if(repository.getLevelType().equals("0")){
					List<Integer> parentAndChildrenIds = new ArrayList<>();
					List<Repository> children = repositoryReadDao.getChildrenById(repositoryId);
					for(Repository child : children){
						parentAndChildrenIds.add(child.getRepositoryId());
					}
					parentAndChildrenIds.add(repositoryId);
					result = repositoryWriteDao.deleteChildrenByIds(parentAndChildrenIds);
				}else{
					result = repositoryWriteDao.deleteById(repositoryId);
				}
			}else{
				throw new BusinessException("不存在该用户，请重新选择！");
			}
			
			if(result > 0){
				transactionManager.commit(status);
				return true;
			}else{
				transactionManager.rollback(status);
				return false;
			}
		} catch (Exception e) {
			transactionManager.rollback(status);
            throw e;
		}
	}

}
