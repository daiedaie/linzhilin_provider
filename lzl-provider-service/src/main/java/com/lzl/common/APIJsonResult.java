package com.lzl.common;

import java.io.Serializable;
import java.util.HashMap;

/**
 * @Version: 1.0
 * @Author: cx
 */
public class APIJsonResult<T> implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -8637111820477625638L;

    public APIJsonResult() {

    }

    public APIJsonResult(T rows) {
        this.rows = rows;
    }

    public APIJsonResult(String errorMessage) {
        this.code = 1;
        this.message = errorMessage;
    }
    
    //@Lgq 异常的分类
    private Integer code = 0;

    public Integer getCode() {
        return this.code;
    }

    public Integer setCode(Integer result){
    	this.code=result;
    	return code;
    }
    private T rows;

//    @SuppressWarnings("unchecked")
	public T getRows() {
//        return rows == null ? (T) new ArrayList<T>() : rows;
        return rows;
    }

    public void setRows(T rows) {
        this.rows = rows;
    }

    private T data;

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public T getData() {
//        return data;
        return data == null ? (T) new HashMap() : data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private String message = "success";

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.code = 1;
        this.message = message;
    }

    private Integer total;

    public void setTotal(Integer count) {
        this.total = count;
    }

    public Integer getTotal() {
        return this.total;
    }

    private String backUrl;

    public String getBackUrl() {
        return backUrl;
    }

    public void setBackUrl(String backUrl) {
        this.backUrl = backUrl;
    }

    private T footer;

//    @SuppressWarnings("unchecked")
	public T getFooter() {
//        return footer == null ? (T) new ArrayList<T>() : footer;
        return footer;
    }

    public void setFooter(T footer) {
        this.footer = footer;
    }
}
