package com.lzl.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyProperties {
    /**图片基础路径*/
    @Value("${com.lzl.img.baseurl}")
    private String imgBaseUrl;
    /**二维码链接跳转地址*/
    @Value("${com.lzl.qccode.content}")
    private String qcContent;
    /**exl路径*/
    @Value("${com.lzl.exl.url}")
    private String exlUrl;
    /**exl生成不使用模板最大临界点*/
    @Value("${com.lzl.exl.template.max}")
    private Integer tempalteMax;
    /**合成二维码zip打包下载路径*/
    @Value("${com.lzl.zip.sellerCodeImage}")
    private String sellerCodeImage;
    /**合成二维码图片地址*/
    @Value("${com.lzl.img.sellerCodeImg}")
    private String sellerCodeImg;
    
    /**线程池最小数量*/
    @Value("${com.lzl.task.corePoolSize}")
    private int corePoolSize;  
    /**线程池最大数量*/
    @Value("${com.lzl.task.maxPoolSize}")
    private int maxPoolSize;  
    /**线程池队列大小*/
    @Value("${com.lzl.task.queueCapacity}")
    private int queueCapacity;  

    public int getCorePoolSize() {
        return corePoolSize;
    }

    public void setCorePoolSize(int corePoolSize) {
        this.corePoolSize = corePoolSize;
    }

    public int getMaxPoolSize() {
        return maxPoolSize;
    }

    public void setMaxPoolSize(int maxPoolSize) {
        this.maxPoolSize = maxPoolSize;
    }

    public int getQueueCapacity() {
        return queueCapacity;
    }

    public void setQueueCapacity(int queueCapacity) {
        this.queueCapacity = queueCapacity;
    }
    public String getSellerCodeImg() {
        return sellerCodeImg;
    }
    public void setSellerCodeImg(String sellerCodeImg) {
        this.sellerCodeImg = sellerCodeImg;
    }
    public String getSellerCodeImage() {
        return sellerCodeImage;
    }
    public void setSellerCodeImage(String sellerCodeImage) {
        this.sellerCodeImage = sellerCodeImage;
    }
    public Integer getTempalteMax() {
        return tempalteMax;
    }
    public void setTempalteMax(Integer tempalteMax) {
        this.tempalteMax = tempalteMax;
    }
    public String getExlUrl() {
        return exlUrl;
    }
    public void setExlUrl(String exlUrl) {
        this.exlUrl = exlUrl;
    }
    public String getImgBaseUrl() {
        return imgBaseUrl;
    }
    public void setImgBaseUrl(String imgBaseUrl) {
        this.imgBaseUrl = imgBaseUrl;
    }
    public String getQcContent() {
        return qcContent;
    }
    public void setQcContent(String qcContent) {
        this.qcContent = qcContent;
    }
    
}
