package com.lzl.bean.javashop;

import java.io.Serializable;
import java.util.List;
/**
 * 角色资源对应表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:24
 */
public class SystemResourcesRoles implements Serializable{

    private static final long serialVersionUID = 1L;

    private java.lang.Integer id;

    private java.lang.Integer resourcesId;

    private java.lang.Integer rolesId;

    private java.util.Date createTime;
    
    /**********************************************************************/
    
    /**创建者角色id：通过该角色id查询对应的资源，他赋予的资源不能大于他本身所拥有的资源*/
    private Integer createRolesId;
    
    private List<String> resourcesIds;

    public Integer getCreateRolesId() {
        return createRolesId;
    }

    public void setCreateRolesId(Integer createRolesId) {
        this.createRolesId = createRolesId;
    }

    public List<String> getResourcesIds() {
        return resourcesIds;
    }

    public void setResourcesIds(List<String> resourcesIds) {
        this.resourcesIds = resourcesIds;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Integer getId() {
        return this.id;
    }
    public void setResourcesId(java.lang.Integer resourcesId) {
        this.resourcesId = resourcesId;
    }

    public java.lang.Integer getResourcesId() {
        return this.resourcesId;
    }
    public void setRolesId(java.lang.Integer rolesId) {
        this.rolesId = rolesId;
    }

    public java.lang.Integer getRolesId() {
        return this.rolesId;
    }
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }
	
	@Override
    public String toString() {
		return  "Id="  + id +";"+  "ResourcesId="  + resourcesId +";"+  "RolesId="  + rolesId +";"+  "CreateTime="  + createTime ; 
    }
}