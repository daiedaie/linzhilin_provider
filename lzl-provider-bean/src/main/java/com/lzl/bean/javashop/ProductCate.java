package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 商品分类
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:20
 */
public class ProductCate implements Serializable{

    private static final long serialVersionUID = 1L;

    private java.lang.Integer id;

    /** 类型ID */
    private java.lang.Integer productTypeId;

    /** 0普通商品，1生鲜 （可扩展2，3，4等等） */
    private Integer type;

    /** 父类ID */
    private java.lang.Integer pid;

    /** 分类名称 */
    private java.lang.String name;

    /** 上级分类路径 */
    private java.lang.String path;

    /** 分类图标 */
    private java.lang.String pic;

    /** 分佣比例(商家给平台的分佣比例，填写1到100的数字) */
    private java.lang.Float scaling;

    /** 创建人 */
    private java.lang.Integer createId;

    /** 更新人 */
    private java.lang.Integer updateId;

    /** 创建时间 */
    private java.util.Date createTime;

    /** 更新时间 */
    private java.util.Date updateTime;

    /** 排序 */
    private java.lang.Integer sort;

    /** 0、默认；1、提交审核；2、审核通过；3、审核失败；4、停用 */
    private Integer status;

    /** 级别：1：一级；2：二级；3：三级（可扩展） */
    private Integer grade;


    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Integer getId() {
        return this.id;
    }
    public void setProductTypeId(java.lang.Integer productTypeId) {
        this.productTypeId = productTypeId;
    }

    public java.lang.Integer getProductTypeId() {
        return this.productTypeId;
    }
    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return this.type;
    }
    public void setPid(java.lang.Integer pid) {
        this.pid = pid;
    }

    public java.lang.Integer getPid() {
        return this.pid;
    }
    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getName() {
        return this.name;
    }
    public void setPath(java.lang.String path) {
        this.path = path;
    }

    public java.lang.String getPath() {
        return this.path;
    }
    public void setPic(java.lang.String pic) {
        this.pic = pic;
    }

    public java.lang.String getPic() {
        return this.pic;
    }
    public void setScaling(java.lang.Float scaling) {
        this.scaling = scaling;
    }

    public java.lang.Float getScaling() {
        return this.scaling;
    }
    public void setCreateId(java.lang.Integer createId) {
        this.createId = createId;
    }

    public java.lang.Integer getCreateId() {
        return this.createId;
    }
    public void setUpdateId(java.lang.Integer updateId) {
        this.updateId = updateId;
    }

    public java.lang.Integer getUpdateId() {
        return this.updateId;
    }
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }
    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }
    public void setSort(java.lang.Integer sort) {
        this.sort = sort;
    }

    public java.lang.Integer getSort() {
        return this.sort;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return this.status;
    }
    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getGrade() {
        return this.grade;
    }
	
	@Override
    public String toString() {
		return  "Id="  + id +";"+  "ProductTypeId="  + productTypeId +";"+  "Type="  + type +";"+  "Pid="  + pid +";"+  "Name="  + name +";"+  "Path="  + path +";"+  "Pic="  + pic +";"+  "Scaling="  + scaling +";"+  "CreateId="  + createId +";"+  "UpdateId="  + updateId +";"+  "CreateTime="  + createTime +";"+  "UpdateTime="  + updateTime +";"+  "Sort="  + sort +";"+  "Status="  + status +";"+  "Grade="  + grade ; 
    }
}