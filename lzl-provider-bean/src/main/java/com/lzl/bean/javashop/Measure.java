package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-16 13:05:03
 */
public class Measure implements Serializable{

    private static final long serialVersionUID = 1L;

    /** 计量单位ID */
    private java.lang.Integer measureId;

    /** 计量单位名称 */
    private java.lang.String measureName;

    /** 所属计量单位组ID */
    private java.lang.Integer measureGroupId;

    /** 计量规格 */
    private java.lang.Integer measureSize;

    /** 最小计量单位标志 */
    private Integer minSize;

    /** 小数位数 */
    private Integer decimalNum;

    /** 创建时间 */
    private java.util.Date createTime;

    /** 最后一次修改时间 */
    private java.util.Date modifyTime;


    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }

    public java.lang.Integer getMeasureId() {
        return this.measureId;
    }
    public void setMeasureName(java.lang.String measureName) {
        this.measureName = measureName;
    }

    public java.lang.String getMeasureName() {
        return this.measureName;
    }
    public void setMeasureGroupId(java.lang.Integer measureGroupId) {
        this.measureGroupId = measureGroupId;
    }

    public java.lang.Integer getMeasureGroupId() {
        return this.measureGroupId;
    }
    public void setMeasureSize(java.lang.Integer measureSize) {
        this.measureSize = measureSize;
    }

    public java.lang.Integer getMeasureSize() {
        return this.measureSize;
    }
    public void setMinSize(Integer minSize) {
        this.minSize = minSize;
    }

    public Integer getMinSize() {
        return this.minSize;
    }
    public void setDecimalNum(Integer decimalNum) {
        this.decimalNum = decimalNum;
    }

    public Integer getDecimalNum() {
        return this.decimalNum;
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
		return  "MeasureId="  + measureId +";"+  "MeasureName="  + measureName +";"+  "MeasureGroupId="  + measureGroupId +";"+  "MeasureSize="  + measureSize +";"+  "MinSize="  + minSize +";"+  "DecimalNum="  + decimalNum +";"+  "CreateTime="  + createTime +";"+  "ModifyTime="  + modifyTime ; 
    }
}