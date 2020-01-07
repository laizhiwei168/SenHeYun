package com.cimc.senheyun.utils;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;
import org.codehaus.jackson.type.JavaType;
import org.codehaus.jackson.type.TypeReference;

import com.cimc.senheyun.po.TaEquipmentPo;


public class JsonUtil {

	private static ObjectMapper objectMapper =new ObjectMapper();
	
	static {
		//对象的所有字段全部列入
		objectMapper.setSerializationInclusion(Inclusion.ALWAYS);
		
		// 取消默认转换timestamps形式
		objectMapper.configure(SerializationConfig.Feature.WRITE_DATES_AS_TIMESTAMPS,false);
		
		// 忽略空Bean转json的错误
		objectMapper.configure(SerializationConfig.Feature.FAIL_ON_EMPTY_BEANS,false);
		
		//所有的日期格式都统一一样的格式
		objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
		
		// 忽略 在json字符串中存在，但是在java对象中不存在对应属性的情况。防止错误
		objectMapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
	}
	
	public static <T>String obj2String(T obj){
		if(obj == null) {
			return null;
		}
		try {
			return obj instanceof String ? (String)obj :objectMapper.writeValueAsString(obj);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} 
	}
	
	public static <T>String obj2StringPretty(T obj){
		if(obj == null) {
			return null;
		}
		try {
			return obj instanceof String ? (String)obj :objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} 
	}
	
	public static <T> T string2Obj(String str,Class<T>clazz){
		if(str == null || str.length()==0 || clazz==null) {
			return null;
		}
		try {
			return clazz.equals(String.class)? (T)str : objectMapper.readValue(str, clazz);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static <T> T string2Obj(String str,TypeReference<T> typeReference){
		if(str == null || str.length()==0 || typeReference==null) {
			return null;
		}
		try {
			return (T)(typeReference.getType().equals(String.class)?str : objectMapper.readValue(str, typeReference));
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static <T> T string2Obj(String str,Class<?>collectionClass , Class<?>...elementClasses ){
		JavaType javaType= objectMapper.getTypeFactory().constructParametricType(collectionClass, elementClasses);
		try {
			return  objectMapper.readValue(str, javaType);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/*public static void main(String[] args) {
		List<TaEquipmentPo> lpo=new ArrayList<TaEquipmentPo>();
		TaEquipmentPo po =new TaEquipmentPo();
		po.setPkEquipment("1231345");
		po.setEquipmentNo("qwerwer");
		po.setCreator("xiaoming");
		po.setCreatortime("2019-08-15 14:11:01");
		
		TaEquipmentPo po1 =new TaEquipmentPo();
		po1.setPkEquipment("1231345");
		po1.setEquipmentNo("qwerwer");
		po1.setCreator("xiaoming");
		po1.setCreatortime("2019-08-15 14:11:01");
		lpo.add(po);
		lpo.add(po1);
		String str=JsonUtil.obj2StringPretty(lpo);
		
		List<TaEquipmentPo> lpo2=JsonUtil.string2Obj(str, new TypeReference<List<TaEquipmentPo>>(){});
		System.out.println(lpo2);
	}*/
	
}
