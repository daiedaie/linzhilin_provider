package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:04
 */
public class Repository implements Serializable{

    private static final long serialVersionUID = 1L;

    /** 仓库ID */
    private java.lang.Integer repositoryId;

    /** 仓库名称 */
    private java.lang.String repositoryName;

    /** 所属供应商ID */
    private java.lang.Integer providerId;

    /** 地区信息 */
    private java.lang.String address;

    /** 虚/实仓 */
    private Integer realVirtual;

    /** 库存状态 */
    private java.lang.String status;

    /** 是否停用 */
    private Integer available;

    /** 编码层次（中间小-区分父子级别） */
    private java.lang.String level;

    /** 创建时间 */
    private java.util.Date createTime;

    /** 最后一次修改时间 */
    private java.util.Date modifyTime;


    public void setRepositoryId(java.lang.Integer repositoryId) {
        this.repositoryId = repositoryId;
    }

    public java.lang.Integer getRepositoryId() {
        return this.repositoryId;
    }
    public void setRepositoryName(java.lang.String repositoryName) {
        this.repositoryName = repositoryName;
    }

    public java.lang.String getRepositoryName() {
        return this.repositoryName;
    }
    public void setProviderId(java.lang.Integer providerId) {
        this.providerId = providerId;
    }

    public java.lang.Integer getProviderId() {
        return this.providerId;
    }
    public void setAddress(java.lang.String address) {
        this.address = address;
    }

    public java.lang.String getAddress() {
        return this.address;
    }
    public void setRealVirtual(Integer realVirtual) {
        this.realVirtual = realVirtual;
    }

    public Integer getRealVirtual() {
        return this.realVirtual;
    }
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    public java.lang.String getStatus() {
        return this.status;
    }
    public void setAvailable(Integer available) {
        this.available = available;
    }

    public Integer getAvailable() {
        return this.available;
    }
    public void setLevel(java.lang.String level) {
        this.level = level;
    }

    public java.lang.String getLevel() {
        return this.level;
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
		return  "RepositoryId="  + repositoryId +";"+  "RepositoryName="  + repositoryName +";"+  "ProviderId="  + providerId +";"+  "Address="  + address +";"+  "RealVirtual="  + realVirtual +";"+  "Status="  + status +";"+  "Available="  + available +";"+  "Level="  + level +";"+  "CreateTime="  + createTime +";"+  "ModifyTime="  + modifyTime ; 
    }
}