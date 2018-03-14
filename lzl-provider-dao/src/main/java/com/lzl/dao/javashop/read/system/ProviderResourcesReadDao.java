package com.lzl.dao.javashop.read.system;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lzl.bean.javashop.system.ProviderResources;
/**
 * 资源表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:24
 */
public interface ProviderResourcesReadDao {
	
	List<ProviderResources> get(Map<String, Object> queryMap);
	
	Integer getCount(Map<String, Object> queryMap);
	
	/**
	 * 此角色下的资源url
	 * @param roleId
	 * @param scope
	 */
	List<String> getResourceByRoleId(@Param("roleId") Integer roleId,@Param("scope") Integer scope);
	
	/**
     * 此角色下的资源id
     * @param roleId
     * @param scope
     */
    List<Integer> getResourceIdByRoleId(@Param("roleId") Integer roleId,@Param("scope") Integer scope);

    /**
     * 查询资源的父资源ID
     * @param childResourceId 子资源ID
     * @return
     */
	Integer getParentResourceId(Integer childResourceId);

}