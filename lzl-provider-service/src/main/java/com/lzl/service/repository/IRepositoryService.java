package com.lzl.service.repository;

import java.util.List;
import java.util.Map;

import org.springframework.util.MultiValueMap;

import com.lzl.bean.javashop.repository.Repository;
import com.lzl.common.Pager;

/**
 * 描述：Repository 服务实现层接口
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-03-12 10:28:45
 */
public interface IRepositoryService {
	/**列表查询*/
	List<Repository> get(Map<String, Object> queryMap, Pager pager)throws Exception;
	/**新增*/
    Boolean post(Repository repository) throws Exception;
	/**更新*/
    Boolean put(Repository repository) throws Exception;
    /**根据Id删除*/
    Boolean deleteById(Integer repositoryId);
    
    List<Repository> getRepositoryForProviderOrders(Map<String, Object> queryMap);

}
