package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.Repository;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:04
 */
public interface RepositoryWriteDao {
	
    Integer post(Repository repository);

	Integer put(Repository repository);
	
	Integer deleteRepositoryById(Integer repositoryId);
	
	
}