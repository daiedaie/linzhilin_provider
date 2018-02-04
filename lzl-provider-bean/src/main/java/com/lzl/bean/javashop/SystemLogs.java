package com.lzl.bean.javashop;

import java.io.Serializable;
/**
 * 系统操作日志表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:24
 */
public class SystemLogs implements Serializable{

    private static final long serialVersionUID = 1L;

    private java.lang.Integer id;

    /** 操作人ID */
    private java.lang.Integer optId;

    /** 操作人姓名 */
    private java.lang.String optName;

    /** 操作内容 */
    private java.lang.String optContent;

    /** 创建时间 */
    private java.lang.Integer createTime;

    /** member_rule */
    private java.lang.Integer memberRuleId;

    /** 操作表 */
    private java.lang.String optObject;

    /** 操作表ID */
    private java.lang.Integer optObjectId;


    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Integer getId() {
        return this.id;
    }
    public void setOptId(java.lang.Integer optId) {
        this.optId = optId;
    }

    public java.lang.Integer getOptId() {
        return this.optId;
    }
    public void setOptName(java.lang.String optName) {
        this.optName = optName;
    }

    public java.lang.String getOptName() {
        return this.optName;
    }
    public void setOptContent(java.lang.String optContent) {
        this.optContent = optContent;
    }

    public java.lang.String getOptContent() {
        return this.optContent;
    }
    public void setCreateTime(java.lang.Integer createTime) {
        this.createTime = createTime;
    }

    public java.lang.Integer getCreateTime() {
        return this.createTime;
    }
    public void setMemberRuleId(java.lang.Integer memberRuleId) {
        this.memberRuleId = memberRuleId;
    }

    public java.lang.Integer getMemberRuleId() {
        return this.memberRuleId;
    }
    public void setOptObject(java.lang.String optObject) {
        this.optObject = optObject;
    }

    public java.lang.String getOptObject() {
        return this.optObject;
    }
    public void setOptObjectId(java.lang.Integer optObjectId) {
        this.optObjectId = optObjectId;
    }

    public java.lang.Integer getOptObjectId() {
        return this.optObjectId;
    }
	
	@Override
    public String toString() {
		return  "Id="  + id +";"+  "OptId="  + optId +";"+  "OptName="  + optName +";"+  "OptContent="  + optContent +";"+  "CreateTime="  + createTime +";"+  "MemberRuleId="  + memberRuleId +";"+  "OptObject="  + optObject +";"+  "OptObjectId="  + optObjectId ; 
    }
}