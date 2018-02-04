package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:21
 */
public class Regions implements Serializable{

    private static final long serialVersionUID = 1L;

    private java.lang.Integer id;

    private java.lang.Integer parentId;

    private java.lang.String regionName;

    private java.lang.String parentPath;

    private java.lang.String firstLetter;

    private Integer regionType;

    private Integer agencyId;

    /** 市场级别 */
    private java.lang.Integer shippingId;

    /** 1、开通；2、未开通 */
    private Integer visible;

    /** HP地址库映射字段 */
    private java.lang.String rowId;


    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Integer getId() {
        return this.id;
    }
    public void setParentId(java.lang.Integer parentId) {
        this.parentId = parentId;
    }

    public java.lang.Integer getParentId() {
        return this.parentId;
    }
    public void setRegionName(java.lang.String regionName) {
        this.regionName = regionName;
    }

    public java.lang.String getRegionName() {
        return this.regionName;
    }
    public void setParentPath(java.lang.String parentPath) {
        this.parentPath = parentPath;
    }

    public java.lang.String getParentPath() {
        return this.parentPath;
    }
    public void setFirstLetter(java.lang.String firstLetter) {
        this.firstLetter = firstLetter;
    }

    public java.lang.String getFirstLetter() {
        return this.firstLetter;
    }
    public void setRegionType(Integer regionType) {
        this.regionType = regionType;
    }

    public Integer getRegionType() {
        return this.regionType;
    }
    public void setAgencyId(Integer agencyId) {
        this.agencyId = agencyId;
    }

    public Integer getAgencyId() {
        return this.agencyId;
    }
    public void setShippingId(java.lang.Integer shippingId) {
        this.shippingId = shippingId;
    }

    public java.lang.Integer getShippingId() {
        return this.shippingId;
    }
    public void setVisible(Integer visible) {
        this.visible = visible;
    }

    public Integer getVisible() {
        return this.visible;
    }
    public void setRowId(java.lang.String rowId) {
        this.rowId = rowId;
    }

    public java.lang.String getRowId() {
        return this.rowId;
    }
	
	@Override
    public String toString() {
		return  "Id="  + id +";"+  "ParentId="  + parentId +";"+  "RegionName="  + regionName +";"+  "ParentPath="  + parentPath +";"+  "FirstLetter="  + firstLetter +";"+  "RegionType="  + regionType +";"+  "AgencyId="  + agencyId +";"+  "ShippingId="  + shippingId +";"+  "Visible="  + visible +";"+  "RowId="  + rowId ; 
    }
}