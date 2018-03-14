package com.lzl.bean.javashop.repository;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-03-12 10:28:45
 */
public class Repository implements Serializable{

    private static final long serialVersionUID = 1L;

    /** 仓库ID */
    private java.lang.Integer repositoryId;

    /** 仓库名称 */
    private java.lang.String repositoryName;

    /** 所属供应商ID */
    private java.lang.Integer providerId;

    /** 地区信息 */
    private java.lang.String address;

    /** 虚/实仓 */
    private Integer realVirtual;
    
    /** 库存状态 */
    private java.lang.String status;
    
    /** 是否停用 */
    private Integer available;

    /** 编码层次（中间小-区分父子级别） */
    private java.lang.String levelType;

    /** 创建时间 */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm",timezone="GMT+8")
    private java.util.Date createTime;

    /** 最后一次修改时间 */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm",timezone="GMT+8")
    private java.util.Date modifyTime;

    //**************************额外属性**************************
    private List<Repository> children;
    /** 虚/实仓 */
    private String realVirtualStr;
    /** 库存状态 */
    private String statusStr;
    /** 是否停用 */
    private String availableStr;
    /** 编码层次（中间小-区分父子级别） */
    private String levelStr;
    
    
    public String getRealVirtualStr() {
		return realVirtualStr;
	}

	public void setRealVirtualStr(String realVirtualStr) {
		this.realVirtualStr = realVirtualStr;
	}

	public String getStatusStr() {
		return statusStr;
	}

	public void setStatusStr(String statusStr) {
		this.statusStr = statusStr;
	}

	public String getAvailableStr() {
		return availableStr;
	}

	public void setAvailableStr(String availableStr) {
		this.availableStr = availableStr;
	}

	public String getLevelStr() {
		return levelStr;
	}

	public void setLevelStr(String levelStr) {
		this.levelStr = levelStr;
	}

	public List<Repository> getChildren() {
		return children;
	}

	public void setChildren(List<Repository> children) {
		this.children = children;
	}

	public void setRepositoryId(java.lang.Integer repositoryId) {
        this.repositoryId = repositoryId;
    }

    public java.lang.Integer getRepositoryId() {
        return this.repositoryId;
    }
    public void setRepositoryName(java.lang.String repositoryName) {
        this.repositoryName = repositoryName;
    }

    public java.lang.String getRepositoryName() {
        return this.repositoryName;
    }
    public void setProviderId(java.lang.Integer providerId) {
        this.providerId = providerId;
    }

    public java.lang.Integer getProviderId() {
        return this.providerId;
    }
    public void setAddress(java.lang.String address) {
        this.address = address;
    }

    public java.lang.String getAddress() {
        return this.address;
    }
    public void setRealVirtual(Integer realVirtual) {
        this.realVirtual = realVirtual;
    }

    public Integer getRealVirtual() {
        return this.realVirtual;
    }
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    public java.lang.String getStatus() {
        return this.status;
    }
    public void setAvailable(Integer available) {
        this.available = available;
    }

    public Integer getAvailable() {
        return this.available;
    }

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.lang.String getLevelType() {
		return levelType;
	}

	public void setLevelType(java.lang.String levelType) {
		this.levelType = levelType;
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
		return "Repository [repositoryId=" + repositoryId + ", repositoryName=" + repositoryName + ", providerId="
				+ providerId + ", address=" + address + ", realVirtual=" + realVirtual + ", status=" + status
				+ ", available=" + available + ", levelType=" + levelType + ", createTime=" + createTime
				+ ", modifyTime=" + modifyTime + ", children=" + children + ", realVirtualStr=" + realVirtualStr
				+ ", statusStr=" + statusStr + ", availableStr=" + availableStr + ", levelStr=" + levelStr + "]";
	}
	
}