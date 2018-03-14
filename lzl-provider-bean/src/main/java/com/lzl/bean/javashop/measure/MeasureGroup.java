package com.lzl.bean.javashop.measure;

import java.io.Serializable;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:03
 */
public class MeasureGroup implements Serializable{

    private static final long serialVersionUID = 1L;

    /** 商品计量单位组ID */
    private java.lang.Integer measureGroupId;

    /** 商品计量单位组名称 */
    private java.lang.String measureGroupName;

    /** 创建时间 */
    private java.util.Date createTime;

    /** 最后一次修改时间 */
    private java.util.Date modifyTime;


    public void setMeasureGroupId(java.lang.Integer measureGroupId) {
        this.measureGroupId = measureGroupId;
    }

    public java.lang.Integer getMeasureGroupId() {
        return this.measureGroupId;
    }
    public void setMeasureGroupName(java.lang.String measureGroupName) {
        this.measureGroupName = measureGroupName;
    }

    public java.lang.String getMeasureGroupName() {
        return this.measureGroupName;
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
		return  "MeasureGroupId="  + measureGroupId +";"+  "MeasureGroupName="  + measureGroupName +";"+  "CreateTime="  + createTime +";"+  "ModifyTime="  + modifyTime ; 
    }
}