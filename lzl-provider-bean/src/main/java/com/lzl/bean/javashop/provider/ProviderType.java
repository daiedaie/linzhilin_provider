package com.lzl.bean.javashop.provider;

import java.io.Serializable;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:04
 */
public class ProviderType implements Serializable{

    private static final long serialVersionUID = 1L;

    /** 类别编码 */
    private java.lang.Integer providerTypeId;

    /** 类别名称 */
    private java.lang.String providerTypeName;

    /** 创建时间 */
    private java.util.Date createTime;

    /** 最后一次修改时间 */
    private java.util.Date modifyTime;


    public void setProviderTypeId(java.lang.Integer providerTypeId) {
        this.providerTypeId = providerTypeId;
    }

    public java.lang.Integer getProviderTypeId() {
        return this.providerTypeId;
    }
    public void setProviderTypeName(java.lang.String providerTypeName) {
        this.providerTypeName = providerTypeName;
    }

    public java.lang.String getProviderTypeName() {
        return this.providerTypeName;
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
		return  "ProviderTypeId="  + providerTypeId +";"+  "ProviderTypeName="  + providerTypeName +";"+  "CreateTime="  + createTime +";"+  "ModifyTime="  + modifyTime ; 
    }
}