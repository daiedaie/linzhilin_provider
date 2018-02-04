package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 系统配置表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:17
 */
public class Config implements Serializable{

    private static final long serialVersionUID = 1L;

    private java.lang.Integer id;

    /** 积分换算比例，多少积分换算成1元人民币 */
    private java.lang.Integer integralScale;


    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Integer getId() {
        return this.id;
    }
    public void setIntegralScale(java.lang.Integer integralScale) {
        this.integralScale = integralScale;
    }

    public java.lang.Integer getIntegralScale() {
        return this.integralScale;
    }
	
	@Override
    public String toString() {
		return  "Id="  + id +";"+  "IntegralScale="  + integralScale ; 
    }
}