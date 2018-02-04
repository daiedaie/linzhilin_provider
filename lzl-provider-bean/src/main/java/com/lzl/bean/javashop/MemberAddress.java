package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 收货地址
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:18
 */
public class MemberAddress implements Serializable{

    private static final long serialVersionUID = 1L;

    private java.lang.Integer id;

    private java.lang.Integer memberId;

    /** 收货人 */
    private java.lang.String memberName;

    /** 省ID */
    private java.lang.Integer provinceId;

    /** 市ID */
    private java.lang.Integer cityId;

    /** 地区ID */
    private java.lang.Integer areaId;

    /** 乡镇街道ID */
    private java.lang.Integer townId;

    /** 坐标经度 */
    private java.lang.String longitude;

    /** 坐标纬度 */
    private java.lang.String latitude;

    /** 市区 */
    private java.lang.String town;

    /** 详细地址 */
    private java.lang.String addressInfo;

    /** 门牌号 */
    private java.lang.String houseNo;

    /** 地址名称 */
    private java.lang.String name;

    /** 手机 */
    private java.lang.String mobile;

    /** 电话 */
    private java.lang.String phone;

    /** 邮箱 */
    private java.lang.String email;

    /** 邮编 */
    private java.lang.String zipCode;

    /** 1、默认；2、不是默认 */
    private Integer state;

    private java.util.Date createTime;

    private java.util.Date updateTime;


    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Integer getId() {
        return this.id;
    }
    public void setMemberId(java.lang.Integer memberId) {
        this.memberId = memberId;
    }

    public java.lang.Integer getMemberId() {
        return this.memberId;
    }
    public void setMemberName(java.lang.String memberName) {
        this.memberName = memberName;
    }

    public java.lang.String getMemberName() {
        return this.memberName;
    }
    public void setProvinceId(java.lang.Integer provinceId) {
        this.provinceId = provinceId;
    }

    public java.lang.Integer getProvinceId() {
        return this.provinceId;
    }
    public void setCityId(java.lang.Integer cityId) {
        this.cityId = cityId;
    }

    public java.lang.Integer getCityId() {
        return this.cityId;
    }
    public void setAreaId(java.lang.Integer areaId) {
        this.areaId = areaId;
    }

    public java.lang.Integer getAreaId() {
        return this.areaId;
    }
    public void setTownId(java.lang.Integer townId) {
        this.townId = townId;
    }

    public java.lang.Integer getTownId() {
        return this.townId;
    }
    public void setLongitude(java.lang.String longitude) {
        this.longitude = longitude;
    }

    public java.lang.String getLongitude() {
        return this.longitude;
    }
    public void setLatitude(java.lang.String latitude) {
        this.latitude = latitude;
    }

    public java.lang.String getLatitude() {
        return this.latitude;
    }
    public void setTown(java.lang.String town) {
        this.town = town;
    }

    public java.lang.String getTown() {
        return this.town;
    }
    public void setAddressInfo(java.lang.String addressInfo) {
        this.addressInfo = addressInfo;
    }

    public java.lang.String getAddressInfo() {
        return this.addressInfo;
    }
    public void setHouseNo(java.lang.String houseNo) {
        this.houseNo = houseNo;
    }

    public java.lang.String getHouseNo() {
        return this.houseNo;
    }
    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getName() {
        return this.name;
    }
    public void setMobile(java.lang.String mobile) {
        this.mobile = mobile;
    }

    public java.lang.String getMobile() {
        return this.mobile;
    }
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }

    public java.lang.String getPhone() {
        return this.phone;
    }
    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    public java.lang.String getEmail() {
        return this.email;
    }
    public void setZipCode(java.lang.String zipCode) {
        this.zipCode = zipCode;
    }

    public java.lang.String getZipCode() {
        return this.zipCode;
    }
    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getState() {
        return this.state;
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
	
	@Override
    public String toString() {
		return  "Id="  + id +";"+  "MemberId="  + memberId +";"+  "MemberName="  + memberName +";"+  "ProvinceId="  + provinceId +";"+  "CityId="  + cityId +";"+  "AreaId="  + areaId +";"+  "TownId="  + townId +";"+  "Longitude="  + longitude +";"+  "Latitude="  + latitude +";"+  "Town="  + town +";"+  "AddressInfo="  + addressInfo +";"+  "HouseNo="  + houseNo +";"+  "Name="  + name +";"+  "Mobile="  + mobile +";"+  "Phone="  + phone +";"+  "Email="  + email +";"+  "ZipCode="  + zipCode +";"+  "State="  + state +";"+  "CreateTime="  + createTime +";"+  "UpdateTime="  + updateTime ; 
    }
}