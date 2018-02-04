package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 系统配置
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:24
 */
public class SystemConfig implements Serializable{

    private static final long serialVersionUID = 1L;

    private java.lang.Integer id;

    /** 类型(1:app版本更新  2:商家提现周期 3:新品热销猜你喜欢图片 4:微信转账设置) */
    private java.lang.Integer type;

    private java.lang.Integer smallType;

    private java.lang.String content;

    private java.util.Date updateTime;

    /** 创建时间 */
    private java.util.Date createTime;


    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Integer getId() {
        return this.id;
    }
    public void setType(java.lang.Integer type) {
        this.type = type;
    }

    public java.lang.Integer getType() {
        return this.type;
    }
    public void setSmallType(java.lang.Integer smallType) {
        this.smallType = smallType;
    }

    public java.lang.Integer getSmallType() {
        return this.smallType;
    }
    public void setContent(java.lang.String content) {
        this.content = content;
    }

    public java.lang.String getContent() {
        return this.content;
    }
    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }
	
	@Override
    public String toString() {
		return  "Id="  + id +";"+  "Type="  + type +";"+  "SmallType="  + smallType +";"+  "Content="  + content +";"+  "UpdateTime="  + updateTime +";"+  "CreateTime="  + createTime ; 
    }
}