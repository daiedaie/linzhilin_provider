package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 用户地区申请开通商超记录
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:17
 */
public class LogRegionsApply implements Serializable{

    private static final long serialVersionUID = 1L;

    /** 用户id */
    private java.lang.Integer memberId;

    /** 城市 */
    private java.lang.String city;

    /** 详细地址 */
    private java.lang.String addressInfo;

    /** 坐标经度 */
    private java.lang.String latitude;

    /** 坐标经度 */
    private java.lang.String longitude;

    /** 创建时间 */
    private java.util.Date createTime;


    public void setMemberId(java.lang.Integer memberId) {
        this.memberId = memberId;
    }

    public java.lang.Integer getMemberId() {
        return this.memberId;
    }
    public void setCity(java.lang.String city) {
        this.city = city;
    }

    public java.lang.String getCity() {
        return this.city;
    }
    public void setAddressInfo(java.lang.String addressInfo) {
        this.addressInfo = addressInfo;
    }

    public java.lang.String getAddressInfo() {
        return this.addressInfo;
    }
    public void setLatitude(java.lang.String latitude) {
        this.latitude = latitude;
    }

    public java.lang.String getLatitude() {
        return this.latitude;
    }
    public void setLongitude(java.lang.String longitude) {
        this.longitude = longitude;
    }

    public java.lang.String getLongitude() {
        return this.longitude;
    }
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }
	
	@Override
    public String toString() {
		return  "MemberId="  + memberId +";"+  "City="  + city +";"+  "AddressInfo="  + addressInfo +";"+  "Latitude="  + latitude +";"+  "Longitude="  + longitude +";"+  "CreateTime="  + createTime ; 
    }
}