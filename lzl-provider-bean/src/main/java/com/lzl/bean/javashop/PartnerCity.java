package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 管理员城市绑定-目前用于市场管理员
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:19
 */
public class PartnerCity implements Serializable{

    private static final long serialVersionUID = 1L;

    private java.lang.Integer pcId;

    /** 城市 */
    private java.lang.String pcCity;

    private java.lang.String pcArea;

    /** 管理员ID */
    private java.lang.Integer adminId;

    /** 创建时间 */
    private java.util.Date createTime;


    public void setPcId(java.lang.Integer pcId) {
        this.pcId = pcId;
    }

    public java.lang.Integer getPcId() {
        return this.pcId;
    }
    public void setPcCity(java.lang.String pcCity) {
        this.pcCity = pcCity;
    }

    public java.lang.String getPcCity() {
        return this.pcCity;
    }
    public void setPcArea(java.lang.String pcArea) {
        this.pcArea = pcArea;
    }

    public java.lang.String getPcArea() {
        return this.pcArea;
    }
    public void setAdminId(java.lang.Integer adminId) {
        this.adminId = adminId;
    }

    public java.lang.Integer getAdminId() {
        return this.adminId;
    }
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }
	
	@Override
    public String toString() {
		return  "PcId="  + pcId +";"+  "PcCity="  + pcCity +";"+  "PcArea="  + pcArea +";"+  "AdminId="  + adminId +";"+  "CreateTime="  + createTime ; 
    }
}