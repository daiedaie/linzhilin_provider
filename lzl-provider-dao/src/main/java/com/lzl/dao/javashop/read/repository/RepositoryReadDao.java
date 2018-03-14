package com.lzl.dao.javashop.read.repository;

import java.util.List;
import java.util.Map;
import com.lzl.bean.javashop.repository.Repository;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-03-12 10:28:45
 */
public interface RepositoryReadDao {
	/**通过id查询*/
	Repository getById(Integer id);
	/**查询列表*/
	List<Repository> get(Map<String, Object> queryMap);
	/**查询数量*/
	Integer getCount(Map<String, Object> queryMap);
	/**查询子仓库*/
	List<Repository> getChildrenById(Integer repositoryId);

}