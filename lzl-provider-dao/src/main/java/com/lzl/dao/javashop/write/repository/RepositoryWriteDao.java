package com.lzl.dao.javashop.write.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lzl.bean.javashop.repository.Repository;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-03-12 10:28:45
 */
public interface RepositoryWriteDao {
	/**新增*/
    Integer post(Repository repository);
	/**更新*/
    Integer put(Repository repository);
	Integer deleteById(Integer repositoryId);
	Integer deleteChildrenByIds(@Param("childrenIds") List<Integer> childrenIds);

}