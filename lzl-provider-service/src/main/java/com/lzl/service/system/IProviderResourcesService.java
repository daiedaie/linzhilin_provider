package com.lzl.service.system;

import java.util.List;
import java.util.Map;

import com.lzl.bean.javashop.system.ProviderResources;
import com.lzl.common.Pager;

/**
 * 资源表
 * 描述：SystemResources 服务实现层接口
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:24
 */
public interface IProviderResourcesService {
	
	List<ProviderResources> get(Map<String, Object> queryMap, Pager pager)throws Exception;

    Boolean post(ProviderResources providerResources) throws Exception;

    Boolean put(ProviderResources providerResources) throws Exception;
    
    Boolean delete(Integer id) throws Exception;
    
    /**
     * 获取该角色下的所有资源url列表
     * @param roleId
     * @param scope
     */
    List<String> getResourceByRoleId(Integer roleId, Integer scope);
    
    /**
     * 获取该角色下的所有资源Id列表
     * @param roleId
     * @param scope
     */
    List<Integer> getResourceIdByRoleId(Integer roleId, Integer scope);

}
