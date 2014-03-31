package com.ymsino.water.view.web.common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.CycleDetectionStrategy;

public class JsonUtil {

	/**
	 * 从一个JSON 对象字符格式中得到一个java对象
	 * @param jsonString
	 * @param clazz
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static Object getObject(String jsonString, Class clazz){   
        JSONObject jsonObject = null;   
        try{   
            jsonObject = JSONObject.fromObject(jsonString);   
        }catch(Exception e){   
            e.printStackTrace();   
        }   
        return JSONObject.toBean(jsonObject, clazz);   
    }
	
	/**
	 * 从一个JSON数组得到一个java对象集合
	 * @param jsonString
	 * @param clazz
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static List getList(String jsonString, Class clazz){
        JSONArray array = JSONArray.fromObject(jsonString);
        List list = new ArrayList();
        for(Iterator iter = array.iterator(); iter.hasNext();){
            JSONObject jsonObject = (JSONObject)iter.next();
            list.add(JSONObject.toBean(jsonObject, clazz));
        }
        return list;
    }

	/**
	 * 把数据对象转换成json字符串
	 * @param object
	 * @param excludes 过滤的字段
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public static String getJSONString(Object object, String[] excludes) throws Exception{
        String jsonString = null;
        JsonConfig config = new JsonConfig(); 
        config.setIgnoreDefaultExcludes(false); 
        config.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
        if(excludes != null && excludes.length > 0){
        	config.setExcludes(excludes); 
        }
        if(object != null){
            if(object instanceof Collection || object instanceof Object[]){
                jsonString = JSONArray.fromObject(object,config).toString();
            }else{
                jsonString = JSONObject.fromObject(object,config).toString();
            }
        }
        return jsonString == null ? "{}" : jsonString;
    }
	
}