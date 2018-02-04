package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 商品品牌
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:20
 */
public class ProductBrand implements Serializable{

    private static final long serialVersionUID = 1L;

    private java.lang.Integer id;

    /** 品牌名称 */
    private java.lang.String name;

    /** 品牌首字母 */
    private java.lang.String nameFirst;

    /** 品牌图片 */
    private java.lang.String image;

    /** 展示方式1、图片；2、文字 */
    private Integer lookMethod;

    /** 推荐1、推荐；2、不推荐 */
    private Integer top;

    /** 排序 */
    private java.lang.Integer sort;

    /** 创建人 */
    private java.lang.Integer createId;

    /** 创建时间 */
    private java.util.Date createTime;

    /** 更新人 */
    private java.lang.Integer updateId;

    /** 更新时间 */
    private java.util.Date updateTime;

    /** 状态 0、默认；1、提交审核；2、显示中；3、审核失败；4、删除 */
    private Integer state;


    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Integer getId() {
        return this.id;
    }
    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getName() {
        return this.name;
    }
    public void setNameFirst(java.lang.String nameFirst) {
        this.nameFirst = nameFirst;
    }

    public java.lang.String getNameFirst() {
        return this.nameFirst;
    }
    public void setImage(java.lang.String image) {
        this.image = image;
    }

    public java.lang.String getImage() {
        return this.image;
    }
    public void setLookMethod(Integer lookMethod) {
        this.lookMethod = lookMethod;
    }

    public Integer getLookMethod() {
        return this.lookMethod;
    }
    public void setTop(Integer top) {
        this.top = top;
    }

    public Integer getTop() {
        return this.top;
    }
    public void setSort(java.lang.Integer sort) {
        this.sort = sort;
    }

    public java.lang.Integer getSort() {
        return this.sort;
    }
    public void setCreateId(java.lang.Integer createId) {
        this.createId = createId;
    }

    public java.lang.Integer getCreateId() {
        return this.createId;
    }
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }
    public void setUpdateId(java.lang.Integer updateId) {
        this.updateId = updateId;
    }

    public java.lang.Integer getUpdateId() {
        return this.updateId;
    }
    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }
    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getState() {
        return this.state;
    }
	
	@Override
    public String toString() {
		return  "Id="  + id +";"+  "Name="  + name +";"+  "NameFirst="  + nameFirst +";"+  "Image="  + image +";"+  "LookMethod="  + lookMethod +";"+  "Top="  + top +";"+  "Sort="  + sort +";"+  "CreateId="  + createId +";"+  "CreateTime="  + createTime +";"+  "UpdateId="  + updateId +";"+  "UpdateTime="  + updateTime +";"+  "State="  + state ; 
    }
}