package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 字典表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:16
 */
public class CodeMaster implements Serializable{

    private static final long serialVersionUID = 1L;

    /** code组id */
    private java.lang.String codeDiv;

    /** codeId */
    private java.lang.String codeCd;

    /** code中文名称 */
    private java.lang.String codeText;

    /** 组内顺序为 */
    private java.lang.Integer sortOrder;

    /** 是否使用 */
    private java.lang.Integer useYn;

    /** 创建人Id */
    private java.lang.Integer createUserId;

    /** 创建人 */
    private java.lang.String createUser;

    /** 创建时间 */
    private java.util.Date createTime;

    /** 修改人Id */
    private java.lang.Integer updateUserId;

    /** 修改人 */
    private java.lang.String updateUser;

    /** 修改时间 */
    private java.util.Date updateTime;


    public void setCodeDiv(java.lang.String codeDiv) {
        this.codeDiv = codeDiv;
    }

    public java.lang.String getCodeDiv() {
        return this.codeDiv;
    }
    public void setCodeCd(java.lang.String codeCd) {
        this.codeCd = codeCd;
    }

    public java.lang.String getCodeCd() {
        return this.codeCd;
    }
    public void setCodeText(java.lang.String codeText) {
        this.codeText = codeText;
    }

    public java.lang.String getCodeText() {
        return this.codeText;
    }
    public void setSortOrder(java.lang.Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public java.lang.Integer getSortOrder() {
        return this.sortOrder;
    }
    public void setUseYn(java.lang.Integer useYn) {
        this.useYn = useYn;
    }

    public java.lang.Integer getUseYn() {
        return this.useYn;
    }
    public void setCreateUserId(java.lang.Integer createUserId) {
        this.createUserId = createUserId;
    }

    public java.lang.Integer getCreateUserId() {
        return this.createUserId;
    }
    public void setCreateUser(java.lang.String createUser) {
        this.createUser = createUser;
    }

    public java.lang.String getCreateUser() {
        return this.createUser;
    }
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }
    public void setUpdateUserId(java.lang.Integer updateUserId) {
        this.updateUserId = updateUserId;
    }

    public java.lang.Integer getUpdateUserId() {
        return this.updateUserId;
    }
    public void setUpdateUser(java.lang.String updateUser) {
        this.updateUser = updateUser;
    }

    public java.lang.String getUpdateUser() {
        return this.updateUser;
    }
    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }
	
	@Override
    public String toString() {
		return  "CodeDiv="  + codeDiv +";"+  "CodeCd="  + codeCd +";"+  "CodeText="  + codeText +";"+  "SortOrder="  + sortOrder +";"+  "UseYn="  + useYn +";"+  "CreateUserId="  + createUserId +";"+  "CreateUser="  + createUser +";"+  "CreateTime="  + createTime +";"+  "UpdateUserId="  + updateUserId +";"+  "UpdateUser="  + updateUser +";"+  "UpdateTime="  + updateTime ; 
    }
}