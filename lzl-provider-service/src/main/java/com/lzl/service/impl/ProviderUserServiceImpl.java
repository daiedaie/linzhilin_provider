package com.lzl.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lzl.bean.javashop.ProviderUser;
import com.lzl.common.Pager;
import com.lzl.dao.javashop.read.ProviderRolesReadDao;
import com.lzl.dao.javashop.read.ProviderUserReadDao;
import com.lzl.dao.javashop.write.ProviderUserWriteDao;
import com.lzl.service.IProviderUserService;

/**
 * 描述：ProviderUser 服务实现层
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:04
 */
@Service(value = "providerUserService")
public class ProviderUserServiceImpl implements IProviderUserService{

	@Resource
	private ProviderUserReadDao providerUserReadDao;
	@Resource
	private ProviderUserWriteDao providerUserWriteDao;
	
	@Resource
    private ProviderRolesReadDao  providerRolesReadDao;
	
	@Override
	public List<ProviderUser> get(Map<String, Object> queryMap, Pager pager) throws Exception {
		if (pager != null) {
            if (pager.isGetCount()) {
                pager.setRowsCount(providerUserReadDao.getCount(queryMap));
            }
            queryMap.put("startIndex", pager.getStart());
            queryMap.put("endIndex", pager.getStart() + pager.getPageSize() -1);
        }
		
		List<ProviderUser> providerUserList = providerUserReadDao.get(queryMap);
		
		return providerUserList;
	}

	@Override
	public Integer getCount(Map<String, Object> queryMap) throws Exception {
		return providerUserReadDao.getCount(queryMap);
	}

	@Override
	public Boolean post(ProviderUser providerUser) throws Exception {
		int result = providerUserWriteDao.post(providerUser);
		return result > 0;
	}

	@Override
	public Boolean put(ProviderUser providerUser) throws Exception {
		int result = providerUserWriteDao.put(providerUser);
		return result > 0;
	}

	@Override
	public Boolean deleteProviderUserById(Integer providerUserId) throws Exception {
		int result = providerUserWriteDao.deleteProviderUserById(providerUserId);
		return result > 0;
	}

	@Override
	public List<ProviderUser> getProviderUserByName(String username) throws Exception {
		List<ProviderUser> providerUserByName = providerUserReadDao.getProviderUserByName(username);
		return providerUserByName;
	}

	@Override
	public ProviderUser getById(Integer providerUserId) throws Exception {
		Map<String, Object> queryMap = new HashMap<>();
		queryMap.put("providerUserId", providerUserId);
		return providerUserReadDao.get(queryMap).get(0);
	}
	
	
	/**************************************************上面是公共方法，下面是私有方法***************************************************************/

    /*** 设置管理员角色名称*/
    /*private void setRoleName(List<ProviderUser> list) {
        for (ProviderUser user : list) {
            ProviderRoles pr = providerRolesReadDao.getById(user.getRoleId());
            if (pr != null)
            	user.setr
            	user.setRoleName(pr.getProviderRolesName());
        }
    }*/

}
