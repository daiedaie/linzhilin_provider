package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 搜索设置
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:21
 */
public class SearchSetting implements Serializable{

    private static final long serialVersionUID = 1L;

    private java.lang.Integer id;

    /** 搜索框下关键字设置 */
    private java.lang.String keyword;

    /** 关键字过滤1、不过滤；2、过滤 */
    private Integer keywordFilter;

    /** 索引处理到最大得商品ID，0为没有处理 */
    private java.lang.Integer indexProductId;

    /** 上次索引处理的时间 */
    private java.util.Date indexProductTime;

    /** 更新时间 */
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
    public void setKeywordFilter(Integer keywordFilter) {
        this.keywordFilter = keywordFilter;
    }

    public Integer getKeywordFilter() {
        return this.keywordFilter;
    }
    public void setIndexProductId(java.lang.Integer indexProductId) {
        this.indexProductId = indexProductId;
    }

    public java.lang.Integer getIndexProductId() {
        return this.indexProductId;
    }
    public void setIndexProductTime(java.util.Date indexProductTime) {
        this.indexProductTime = indexProductTime;
    }

    public java.util.Date getIndexProductTime() {
        return this.indexProductTime;
    }
    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }
	
	@Override
    public String toString() {
		return  "Id="  + id +";"+  "Keyword="  + keyword +";"+  "KeywordFilter="  + keywordFilter +";"+  "IndexProductId="  + indexProductId +";"+  "IndexProductTime="  + indexProductTime +";"+  "UpdateTime="  + updateTime ; 
    }
}