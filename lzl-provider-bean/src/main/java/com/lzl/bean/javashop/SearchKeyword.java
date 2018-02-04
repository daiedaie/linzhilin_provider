package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 搜索敏感词过滤
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:21
 */
public class SearchKeyword implements Serializable{

    private static final long serialVersionUID = 1L;

    private java.lang.Integer id;

    /** 关键字 */
    private java.lang.String keyword;

    /** 添加时间 */
    private java.util.Date createTime;

    private java.lang.Integer createId;

    private java.lang.String createName;

    private java.util.Date updateTime;


    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Integer getId() {
        return this.id;
    }
    public void setKeyword(java.lang.String keyword) {
        this.keyword = keyword;
    }

    public java.lang.String getKeyword() {
        return this.keyword;
    }
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }
    public void setCreateId(java.lang.Integer createId) {
        this.createId = createId;
    }

    public java.lang.Integer getCreateId() {
        return this.createId;
    }
    public void setCreateName(java.lang.String createName) {
        this.createName = createName;
    }

    public java.lang.String getCreateName() {
        return this.createName;
    }
    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }
	
	@Override
    public String toString() {
		return  "Id="  + id +";"+  "Keyword="  + keyword +";"+  "CreateTime="  + createTime +";"+  "CreateId="  + createId +";"+  "CreateName="  + createName +";"+  "UpdateTime="  + updateTime ; 
    }
}