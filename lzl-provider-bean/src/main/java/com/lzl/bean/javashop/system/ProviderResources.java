package com.lzl.bean.javashop.system;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
/**
 * 资源表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:24
 */
public class ProviderResources implements Serializable{

    private static final long serialVersionUID = 1L;
    
    /*** 资源使用范围：1、商家*/
    public final static Integer SCOPE_SELLER = 1;
    /*** 资源使用范围：2、平台*/
    public final static Integer SCOPE_ADMIN  = 2;
    /*** 资源使用范围：3、供应商 */
    public final static Integer SCOPE_SUPPLIER = 3;
    
    /*** 新资源使用范围：6、平台*/
    public final static Integer S_ADMIN  = 6;
    
    /*** 资源使用范围：4、供应商 */
    public final static Integer S_PROVIDER  = 4;
    
    
    /*** 正常*/
    public final static Integer NORMAL  = 1;
    /*** 冻结*/
    public final static Integer FREEZE  = 0;
    /*** 删除*/
    public final static Integer DELETE  = 2;
    /********************************************************************/
    private java.lang.Integer id;

    private java.lang.Integer pid;

    private java.lang.String url;

    private java.lang.String content;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm",timezone="GMT+8")
    private java.util.Date createTime;

    /** 1、菜单；2、按钮 */
    private Integer type;

    /** 1、未删除2、删除 */
    private Integer status;

    /** 应用范围: 1-商家 2-平台 3-供应商 */
    private Integer scope;

    /** 资源id,有些菜单及按钮需要特定id以注册点击事件 */
    private java.lang.String resId;

    /** 资源图标,按钮资源可能需要指定图标 */
    private java.lang.String resIcon;
    
    /********************************************************************/
    List<ProviderResources> children;
    
    private Boolean checked;
    
    

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<ProviderResources> getChildren() {
        return children;
    }

    public void setChildren(List<ProviderResources> children) {
        this.children = children;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Integer getId() {
        return this.id;
    }
    public void setPid(java.lang.Integer pid) {
        this.pid = pid;
    }

    public java.lang.Integer getPid() {
        return this.pid;
    }
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    public java.lang.String getUrl() {
        return this.url;
    }
    public void setContent(java.lang.String content) {
        this.content = content;
    }

    public java.lang.String getContent() {
        return this.content;
    }
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }
    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return this.type;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return this.status;
    }
    public void setScope(Integer scope) {
        this.scope = scope;
    }

    public Integer getScope() {
        return this.scope;
    }
    public void setResId(java.lang.String resId) {
        this.resId = resId;
    }

    public java.lang.String getResId() {
        return this.resId;
    }
    public void setResIcon(java.lang.String resIcon) {
        this.resIcon = resIcon;
    }

    public java.lang.String getResIcon() {
        return this.resIcon;
    }
	
	@Override
    public String toString() {
		return  "Id="  + id +";"+  "Pid="  + pid +";"+  "Url="  + url +";"+  "Content="  + content +";"+  "CreateTime="  + createTime +";"+  "Type="  + type +";"+  "Status="  + status +";"+  "Scope="  + scope +";"+  "ResId="  + resId +";"+  "ResIcon="  + resIcon ; 
    }
}