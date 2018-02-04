package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 配送员申请表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:17
 */
public class DeliverymanApply implements Serializable{

    private static final long serialVersionUID = 1L;

    private java.lang.Integer id;

    /** 会员编号 */
    private java.lang.Integer memberId;

    /** 真实姓名 */
    private java.lang.String realName;

    /** 1:男 2:女 0:保密 */
    private java.lang.Integer gender;

    private java.lang.String phone;

    /** 真实头像 */
    private java.lang.String pic;

    /** 身份证照片 */
    private java.lang.String cardPic;

    /** 身份证号 */
    private java.lang.String cardNo;

    /** 坐标经度 */
    private java.lang.String longitude;

    /** 坐标纬度 */
    private java.lang.String latitude;

    /** 1:待审核 2:审核通过 3:审核失败 */
    private java.lang.Integer applyStatus;

    /** 1:正常 2:禁用 */
    private java.lang.Integer status;

    /** 提交时间 */
    private java.util.Date applyTime;

    /** 最近的审核时间 */
    private java.util.Date checkTime;

    /** 申请说明 */
    private java.lang.String applyDescription;


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
    public void setRealName(java.lang.String realName) {
        this.realName = realName;
    }

    public java.lang.String getRealName() {
        return this.realName;
    }
    public void setGender(java.lang.Integer gender) {
        this.gender = gender;
    }

    public java.lang.Integer getGender() {
        return this.gender;
    }
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }

    public java.lang.String getPhone() {
        return this.phone;
    }
    public void setPic(java.lang.String pic) {
        this.pic = pic;
    }

    public java.lang.String getPic() {
        return this.pic;
    }
    public void setCardPic(java.lang.String cardPic) {
        this.cardPic = cardPic;
    }

    public java.lang.String getCardPic() {
        return this.cardPic;
    }
    public void setCardNo(java.lang.String cardNo) {
        this.cardNo = cardNo;
    }

    public java.lang.String getCardNo() {
        return this.cardNo;
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
    public void setApplyStatus(java.lang.Integer applyStatus) {
        this.applyStatus = applyStatus;
    }

    public java.lang.Integer getApplyStatus() {
        return this.applyStatus;
    }
    public void setStatus(java.lang.Integer status) {
        this.status = status;
    }

    public java.lang.Integer getStatus() {
        return this.status;
    }
    public void setApplyTime(java.util.Date applyTime) {
        this.applyTime = applyTime;
    }

    public java.util.Date getApplyTime() {
        return this.applyTime;
    }
    public void setCheckTime(java.util.Date checkTime) {
        this.checkTime = checkTime;
    }

    public java.util.Date getCheckTime() {
        return this.checkTime;
    }
    public void setApplyDescription(java.lang.String applyDescription) {
        this.applyDescription = applyDescription;
    }

    public java.lang.String getApplyDescription() {
        return this.applyDescription;
    }
	
	@Override
    public String toString() {
		return  "Id="  + id +";"+  "MemberId="  + memberId +";"+  "RealName="  + realName +";"+  "Gender="  + gender +";"+  "Phone="  + phone +";"+  "Pic="  + pic +";"+  "CardPic="  + cardPic +";"+  "CardNo="  + cardNo +";"+  "Longitude="  + longitude +";"+  "Latitude="  + latitude +";"+  "ApplyStatus="  + applyStatus +";"+  "Status="  + status +";"+  "ApplyTime="  + applyTime +";"+  "CheckTime="  + checkTime +";"+  "ApplyDescription="  + applyDescription ; 
    }
}