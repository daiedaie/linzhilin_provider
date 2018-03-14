package com.lzl.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.util.StringUtils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by liangbo on 2015/1/8 16:50.
 */
public class JacksonUtil {
    
    /** 设置忽略null值 */
    private static ObjectMapper objectMapper = new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL);

    /**
     * javaBean,list,array convert to json string
     */
    public static String obj2json(Object obj) throws Exception {
    	if(null == obj){
        	throw new Exception("obj为null不能转json");
        }
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        return objectMapper.writeValueAsString(obj);
    }
    
    @SuppressWarnings("unchecked")
	public static  <T> Map<String, Object> obj2map(Object obj) throws Exception {
    	if(null == obj){
        	throw new Exception("obj为null不能转json");
        }
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        
        return objectMapper.readValue(objectMapper.writeValueAsString(obj), Map.class);
    }
    
    public static String obj2json(Object obj, String dateFormat) throws Exception {
        if (!StringUtils.isEmpty(dateFormat)) {
            objectMapper.setDateFormat(new SimpleDateFormat(dateFormat));
        }
        else
        objectMapper=new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL);
        return objectMapper.writeValueAsString(obj);
    }

    /**
     * json string convert to javaBean
     */
    public static <T> T json2pojo(String jsonStr, Class<T> clazz) throws Exception{
        return objectMapper.readValue(jsonStr, clazz);
    }

    /**
     * json string convert to map
     */
    @SuppressWarnings("unchecked")
    public static <T> Map<String, Object> json2map(String jsonStr) throws Exception{
        return objectMapper.readValue(jsonStr, Map.class);
    }
    
    /**
     * 通过key获取value
     * @Lgq 先将json string 转换成map，再获取map的key
     * @param jsonStr
     * @return
     * @throws Exception
     */
    public static Object getValue(String jsonStr,String key) throws Exception{
        return objectMapper.readValue(jsonStr, Map.class).get(key);
    }
    

    /**
     * map convert to javaBean
     * @Lgq T为要转换成的JavaBean，map中的key为该JavaBean中的属性
     */
    @SuppressWarnings("rawtypes")
    public static <T> T map2pojo(Map map, Class<T> clazz){
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        return objectMapper.convertValue(map, clazz);
    }
    
    @SuppressWarnings("rawtypes")
    public static <T> T map2pojo(Map map, Class<T> clazz, String dateFormat) {
        if (!StringUtils.isEmpty(dateFormat)) {
            objectMapper.setDateFormat(new SimpleDateFormat(dateFormat));
        }else
        {
        	objectMapper=new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL);
        }
        
        return objectMapper.convertValue(map, clazz);
    }

    /**
     * @Lgq 将json string转换成 list，该list的泛型为指定的T（JavaBean）
     * json array string convert to list with javaBean
     */
    public static <T> List<T> json2list(String jsonArrayStr, Class<T> clazz) throws Exception{
        List<Map<String,Object>> list = objectMapper.readValue(jsonArrayStr, new TypeReference<List<T>>() {});
        List<T> result = new ArrayList<T>();
        for (Map<String, Object> map : list) {
            result.add(map2pojo(map, clazz));
        }
        return result;
    }

    /**
     * @Lgq 将json string转换成 list，该list的泛型为指定的Map<,>
     * json array string convert to list with map
     */
    @SuppressWarnings("rawtypes")
    public static List<Map<String, Object>> json2list(String jsonArrayStr) throws Exception {
        return objectMapper.readValue(jsonArrayStr, new TypeReference<List>() {});
    }
    
    public static ObjectMapper getMapper(){
    	return objectMapper;
    }
}
