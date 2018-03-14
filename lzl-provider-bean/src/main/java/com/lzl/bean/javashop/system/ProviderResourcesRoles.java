package com.lzl.bean.javashop.system;

import java.io.Serializable;
import java.util.List;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:04
 */
public class ProviderResourcesRoles implements Serializable{

    private static final long serialVersionUID = 1L;

    /** 编码 */
    private java.lang.Integer id;

    /**  资源ID */
    private java.lang.Integer systemResourcesId;

    /** 角色ID */
    private java.lang.Integer providerRolesId;

    /** 创建时间 */
    private java.util.Date createTime;

    /** 最后一次修改时间 */
    private java.util.Date modifyTime;

    
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
    public void setSystemResourcesId(java.lang.Integer systemResourcesId) {
        this.systemResourcesId = systemResourcesId;
    }

    public java.lang.Integer getSystemResourcesId() {
        return this.systemResourcesId;
    }
    public void setProviderRolesId(java.lang.Integer providerRolesId) {
        this.providerRolesId = providerRolesId;
    }

    public java.lang.Integer getProviderRolesId() {
        return this.providerRolesId;
    }
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }
    public void setModifyTime(java.util.Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public java.util.Date getModifyTime() {
        return this.modifyTime;
    }
	
	@Override
    public String toString() {
		return  "Id="  + id +";"+  "SystemResourcesId="  + systemResourcesId +";"+  "ProviderRolesId="  + providerRolesId +";"+  "CreateTime="  + createTime +";"+  "ModifyTime="  + modifyTime ; 
    }
}