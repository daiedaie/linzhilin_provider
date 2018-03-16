package com.lzl.service.impl.goods;

import java.util.ArrayList;
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

import com.lzl.bean.javashop.goods.GoodsCate;
import com.lzl.common.Pager;
import com.lzl.dao.javashop.read.goods.GoodsCateReadDao;
import com.lzl.dao.javashop.write.goods.GoodsCateWriteDao;
import com.lzl.exception.BusinessException;
import com.lzl.service.goods.IGoodsCateService;

/**
 * 描述：GoodsCate 服务实现层
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-03-13 13:34:06
 */
@Service(value = "goodsCateService")
public class GoodsCateServiceImpl implements IGoodsCateService{
	
	@Resource
    private GoodsCateWriteDao goodsCateWriteDao;

	@Resource
    private GoodsCateReadDao goodsCateReadDao;
	
	@Resource
    private DataSourceTransactionManager transactionManager;
	
	/**列表查询*/
    public List<GoodsCate> get(Map<String, Object> queryMap, Pager pager)throws Exception {
		if (pager != null) {
			if(pager.isGetCount()){
				pager.setRowsCount(goodsCateReadDao.getCount(queryMap));
			}
            queryMap.put("start", pager.getStart());
            queryMap.put("size", pager.getPageSize());
        }
		
		queryMap.put("pid", 0);
        List<GoodsCate> parents = goodsCateReadDao.get(queryMap);
        if(parents != null && parents.size() > 0){
        	this.transferData(parents);
        	queryMap.remove("pid");
        	this.setGoodsCateChildren(parents, queryMap);
        	return parents;
        }else{
        	queryMap.remove("pid");
        	List<GoodsCate> children = goodsCateReadDao.get(queryMap);
        	if(children != null && children.size() > 0){
        		this.transferData(children);
        		List<GoodsCate> parentsWithChildren = this.getGoodsCateParents(children);
        		return parentsWithChildren;
        	}else{
        		return null;
        	}
        }
    }
    /**无条件获取所有商品分类*/
    @Override
	public List<GoodsCate> getGoodsCateForAttribute(Map<String, Object> queryMap) {
    	if(queryMap.get("iviewCascader") != null){
    		if(Integer.parseInt((String)queryMap.get("pid")) == 0){
    			List<GoodsCate> parents = goodsCateReadDao.getTopLevel();
    			for(GoodsCate goodsCate : parents){
    				goodsCate.setValue(goodsCate.getId());
    				goodsCate.setLabel(goodsCate.getName());
    				goodsCate.setChildren(new ArrayList<GoodsCate>());
    				goodsCate.setLoading(false);
    			}
    			return parents;
    		}else{
    			List<GoodsCate> children = goodsCateReadDao.getChildren(Integer.parseInt((String)queryMap.get("pid")));
    			for(GoodsCate goodsCate : children){
    				goodsCate.setValue(goodsCate.getId());
    				goodsCate.setLabel(goodsCate.getName());
    			}
    			return children;
    		}
		}
    	return null;
	}
	
    /**新增*/
    public Boolean post(GoodsCate goodsCate) throws Exception {
        int result = goodsCateWriteDao.post(goodsCate);
        return result > 0 ;
    }

	/**更新*/
    public Boolean put(GoodsCate goodsCate) throws Exception {
        int result = goodsCateWriteDao.put(goodsCate);
        return result > 0 ;
    }
    
    @Override
	public Boolean deleteById(Integer id) {
    	List<GoodsCate> list = new ArrayList<>();
    	GoodsCate goodsCate = goodsCateReadDao.getById(id);
    	
    	DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        TransactionStatus status = transactionManager.getTransaction(def);
        
    	try {
			if(goodsCate != null){
				List<GoodsCate> children = goodsCateReadDao.getGoodsCateChildren(id);
				if(children != null && children.size() > 0){
					list.addAll(children);
				} 
				list.add(goodsCate);
			}else{
				throw new BusinessException("不存在该商品类别，请重新选择！");
			}
			int result = goodsCateWriteDao.batchDelete(list);
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
	/*******************上面是公共方法，下面是私有方法********/

    private void setGoodsCateChildren(List<GoodsCate> parents, Map<String, Object> queryMap) {
    	for(GoodsCate parent : parents){
    		queryMap.put("pid", parent.getId());
    		List<GoodsCate> children = goodsCateReadDao.get(queryMap);
    		this.transferData(children);
    		parent.setChildren(children);
    	}
	}
    
    private List<GoodsCate> getGoodsCateParents(List<GoodsCate> children) {
    	//Set集合必须重写equals和hashCode方法
    	Set<GoodsCate> parents = new HashSet<>();
    	for(GoodsCate goodsCate : children){
    		GoodsCate parent = goodsCateReadDao.getById(goodsCate.getPid());
    		parents.add(parent);
		}
    	this.transferData(new ArrayList<>(parents));
    	for(GoodsCate parent : parents){
    		List<GoodsCate> list = new ArrayList<>();
    		for(GoodsCate child : children){
    			if(child.getPid() == parent.getId()){
    				list.add(child);
    			}
    		}
    		parent.setChildren(list);
    	}
    	return new ArrayList<>(parents);
	}
    
	@Override
	public List<GoodsCate> getTopLevel() {
		return goodsCateReadDao.getTopLevel();
	}
	
	private void transferData(List<GoodsCate> goodsCates) {
    	for(GoodsCate goodsCate : goodsCates){
    		//进行级联显示
    		goodsCate.setValue(goodsCate.getId());
    		goodsCate.setLabel(goodsCate.getName());
    		/** 状态 */
    		if(goodsCate.getStatus() != null){
    			Integer temp = goodsCate.getStatus();
    			if(temp == 1){
    				goodsCate.setStatusStr("提交审核");
    			}
    			if(temp == 2){
    				goodsCate.setStatusStr("审核通过");
    			}
    			if(temp == 3){
    				goodsCate.setStatusStr("审核失败");
    			}
    			if(temp == 4){
    				goodsCate.setStatusStr("停用");
    			}
    		}
    		/** 分类级别 */
    		if(goodsCate.getGrade() != null){
    			Integer temp = goodsCate.getGrade();
    			if(temp == 1){
    				goodsCate.setGradeStr("一级");
    			}
    			if(temp == 2){
    				goodsCate.setGradeStr("二级");
    			}
    			if(temp != 1 && temp != 2){
    				goodsCate.setGradeStr("三级");
    			}
    		}
    	}
	}

}
