package com.lzl.bean.javashop.tax;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-03-10 16:28:18
 */
public class TaxRate implements Serializable{

    private static final long serialVersionUID = 1L;

    /** 税率编码 */
    private java.lang.Integer taxRateId;

    /** 税率名称 */
    private java.lang.String taxRateName;

    /** 税率，如：0.12 */
    private java.lang.Float rate;

    /** 创建时间 */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm",timezone="GMT+8")
    private java.util.Date createTime;

    /** 最后一次修改时间 */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm",timezone="GMT+8")
    private java.util.Date modifyTime;


    public void setTaxRateId(java.lang.Integer taxRateId) {
        this.taxRateId = taxRateId;
    }

    public java.lang.Integer getTaxRateId() {
        return this.taxRateId;
    }
    public void setTaxRateName(java.lang.String taxRateName) {
        this.taxRateName = taxRateName;
    }

    public java.lang.String getTaxRateName() {
        return this.taxRateName;
    }
    public void setRate(java.lang.Float rate) {
        this.rate = rate;
    }

    public java.lang.Float getRate() {
        return this.rate;
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
		return  "TaxRateId="  + taxRateId +";"+  "TaxRateName="  + taxRateName +";"+  "Rate="  + rate +";"+  "CreateTime="  + createTime +";"+  "ModifyTime="  + modifyTime ; 
    }
}