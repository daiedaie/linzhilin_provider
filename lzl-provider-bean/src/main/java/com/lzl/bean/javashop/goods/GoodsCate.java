package com.lzl.bean.javashop.goods;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-03-13 13:34:06
 */
/**
 * 商品分类
Include.NON_EMPTY 属性为 空（“”） 或者为 NULL 都不序列化
Include.NON_NULL 属性为NULL 不序列化
网络传输需要序列化，固态到磁盘也需要序列化
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GoodsCate implements Serializable{

    private static final long serialVersionUID = 1L;

    private java.lang.Integer id;

    /** 类型ID */
    private java.lang.Integer goodsTypeId;

    /** 0普通商品，1生鲜 （可扩展2，3，4等等） */
    private Integer type;

    /** 父类ID */
    private java.lang.Integer pid;

    /** 分类名称 */
    private java.lang.String name;

    /** 上级分类路径 */
    private java.lang.String path;

    /** 分类图标 */
    private java.lang.String pic;

    /** 分佣比例(商家给平台的分佣比例，填写1到100的数字) */
    private java.lang.Float scaling;

    /** 创建人 */
    private java.lang.Integer createId;

    /** 更新人 */
    private java.lang.Integer updateId;

    /** 创建时间 */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm",timezone="GMT+8")
    private java.util.Date createTime;

    /** 更新时间 */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm",timezone="GMT+8")
    private java.util.Date updateTime;

    /** 排序 */
    private java.lang.Integer sort;

    /** 0、默认；1、提交审核；2、审核通过；3、审核失败；4、停用 */
    private Integer status;

    /** 级别：1：一级；2：二级；3：三级（可扩展） */
    private Integer grade;

    //*******************额外属性***********************
    private List<GoodsCate> children;
    private Boolean loading;
    /** 0、默认；1、提交审核；2、审核通过；3、审核失败；4、停用 */
    private String statusStr;
    /** 级别：1：一级；2：二级；3：三级（可扩展） */
    private String gradeStr;
    
    private Integer value;
    private String label;
    
    
    public Boolean getLoading() {
		return loading;
	}

	public void setLoading(Boolean loading) {
		this.loading = loading;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getGradeStr() {
		return gradeStr;
	}

	public void setGradeStr(String gradeStr) {
		this.gradeStr = gradeStr;
	}

	public String getStatusStr() {
		return statusStr;
	}

	public void setStatusStr(String statusStr) {
		this.statusStr = statusStr;
	}

	public List<GoodsCate> getChildren() {
		return children;
	}

	public void setChildren(List<GoodsCate> children) {
		this.children = children;
	}

	public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Integer getId() {
        return this.id;
    }
    public void setGoodsTypeId(java.lang.Integer goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public java.lang.Integer getGoodsTypeId() {
        return this.goodsTypeId;
    }
    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return this.type;
    }
    public void setPid(java.lang.Integer pid) {
        this.pid = pid;
    }

    public java.lang.Integer getPid() {
        return this.pid;
    }
    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getName() {
        return this.name;
    }
    public void setPath(java.lang.String path) {
        this.path = path;
    }

    public java.lang.String getPath() {
        return this.path;
    }
    public void setPic(java.lang.String pic) {
        this.pic = pic;
    }

    public java.lang.String getPic() {
        return this.pic;
    }
    public void setScaling(java.lang.Float scaling) {
        this.scaling = scaling;
    }

    public java.lang.Float getScaling() {
        return this.scaling;
    }
    public void setCreateId(java.lang.Integer createId) {
        this.createId = createId;
    }

    public java.lang.Integer getCreateId() {
        return this.createId;
    }
    public void setUpdateId(java.lang.Integer updateId) {
        this.updateId = updateId;
    }

    public java.lang.Integer getUpdateId() {
        return this.updateId;
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
    public void setSort(java.lang.Integer sort) {
        this.sort = sort;
    }

    public java.lang.Integer getSort() {
        return this.sort;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return this.status;
    }
    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getGrade() {
        return this.grade;
    }
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((children == null) ? 0 : children.hashCode());
		result = prime * result + ((createId == null) ? 0 : createId.hashCode());
		result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((goodsTypeId == null) ? 0 : goodsTypeId.hashCode());
		result = prime * result + ((grade == null) ? 0 : grade.hashCode());
		result = prime * result + ((gradeStr == null) ? 0 : gradeStr.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((path == null) ? 0 : path.hashCode());
		result = prime * result + ((pic == null) ? 0 : pic.hashCode());
		result = prime * result + ((pid == null) ? 0 : pid.hashCode());
		result = prime * result + ((scaling == null) ? 0 : scaling.hashCode());
		result = prime * result + ((sort == null) ? 0 : sort.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((statusStr == null) ? 0 : statusStr.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((updateId == null) ? 0 : updateId.hashCode());
		result = prime * result + ((updateTime == null) ? 0 : updateTime.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GoodsCate other = (GoodsCate) obj;
		if (children == null) {
			if (other.children != null)
				return false;
		} else if (!children.equals(other.children))
			return false;
		if (createId == null) {
			if (other.createId != null)
				return false;
		} else if (!createId.equals(other.createId))
			return false;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (goodsTypeId == null) {
			if (other.goodsTypeId != null)
				return false;
		} else if (!goodsTypeId.equals(other.goodsTypeId))
			return false;
		if (grade == null) {
			if (other.grade != null)
				return false;
		} else if (!grade.equals(other.grade))
			return false;
		if (gradeStr == null) {
			if (other.gradeStr != null)
				return false;
		} else if (!gradeStr.equals(other.gradeStr))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (path == null) {
			if (other.path != null)
				return false;
		} else if (!path.equals(other.path))
			return false;
		if (pic == null) {
			if (other.pic != null)
				return false;
		} else if (!pic.equals(other.pic))
			return false;
		if (pid == null) {
			if (other.pid != null)
				return false;
		} else if (!pid.equals(other.pid))
			return false;
		if (scaling == null) {
			if (other.scaling != null)
				return false;
		} else if (!scaling.equals(other.scaling))
			return false;
		if (sort == null) {
			if (other.sort != null)
				return false;
		} else if (!sort.equals(other.sort))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (statusStr == null) {
			if (other.statusStr != null)
				return false;
		} else if (!statusStr.equals(other.statusStr))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (updateId == null) {
			if (other.updateId != null)
				return false;
		} else if (!updateId.equals(other.updateId))
			return false;
		if (updateTime == null) {
			if (other.updateTime != null)
				return false;
		} else if (!updateTime.equals(other.updateTime))
			return false;
		return true;
	}

	@Override
    public String toString() {
		return  "Id="  + id +";"+  "GoodsTypeId="  + goodsTypeId +";"+  "Type="  + type +";"+  "Pid="  + pid +";"+  "Name="  + name +";"+  "Path="  + path +";"+  "Pic="  + pic +";"+  "Scaling="  + scaling +";"+  "CreateId="  + createId +";"+  "UpdateId="  + updateId +";"+  "CreateTime="  + createTime +";"+  "UpdateTime="  + updateTime +";"+  "Sort="  + sort +";"+  "Status="  + status +";"+  "Grade="  + grade ; 
    }
}