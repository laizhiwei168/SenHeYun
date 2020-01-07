package com.cimc.senheyun.service.impl;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.logging.log4j.core.pattern.AbstractStyleNameConverter.Black;
import org.springframework.stereotype.Component;

import com.cimc.senheyun.bo.Data;
import com.cimc.senheyun.bo.Field;
import com.cimc.senheyun.bo.record;
import com.cimc.senheyun.po.WebBusinessPo;
import com.cimc.senheyun.po.WebPressurePo;
import com.cimc.senheyun.service.Webservice;
import com.cimc.senheyun.vo.PageOutVo;
import com.cimc.senheyun.vo.WebPressureVo;
import com.cimc.senheyun.webservice.IotDataService;
import com.cimc.senheyun.webservice.IotDataServicePortType;

@Component("webservice")
public class WebserviceImpl implements Webservice{

	@Override
	public PageOutVo<WebPressurePo> selectPressure(String gateway) {
		List<WebPressurePo> list=new ArrayList<WebPressurePo>();
		IotDataService ids=new IotDataService();
		IotDataServicePortType ispt=ids.getIotDataServiceHttpSoap11Endpoint();
		String xml=ispt.gatewayData("中程智能", "111111",gateway);//"867726033041874"
		if(xml!=null && !"".equals(xml)) {
			WebPressurePo po=new WebPressurePo();
			po.setGateway(gateway);
			try {
				JAXBContext context = JAXBContext.newInstance(Data.class);  
		        Unmarshaller unmarshaller = context.createUnmarshaller();  
		        Data data = (Data)unmarshaller.unmarshal(new StringReader(xml));
		        String id = null;
		        String value = null;
		        for(record record:data.getRecord()) {
		        	 for(Field s:record.getField()) {
		        		 if("data_time".equals(s.getColumn_name())) {
		        			 po.setDataTime(s.getValue());
		        		 }else if("channel_name".equals(s.getColumn_name())){
		        			 id=s.getValue();
		        		 }else if("value".equals(s.getColumn_name())){
		        			 value=s.getValue();
		        		 }
					}
		        	 setValue(id, value, po);
		        }
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			// 添加压力入库
			list.add(po);
		}
		PageOutVo<WebPressurePo> page = new PageOutVo<WebPressurePo>();
		page.setRows(list);
		return page;
	}
	
	private void setValue(String id,String value,WebPressurePo po) {
		switch (id) {
		case "130":
			po.setLiquidLevelMPa(value);
			break;
		case "242":
			po.setBatteryCapacity(value);	
			break;
		case "256":
			po.setSignal(value);
			break;

		default:
			break;
		}
	}
	
	private void setValue(String id,String value,WebBusinessPo po) {
		switch (id) {		
		case "242":
			po.setBatteryCapacity(value);	
			break;
		case "256":
			po.setSignal(value);
			break;
		case "260":
			po.setDataNumber(value);;
			break;
		case "270":
			po.setIMEI(value);
			break;
		case "271":
			po.setICCID(value);
			break;
		case "300":
			po.setSoilTemperature1(value);;
			break;
		case "301":
			po.setSoilTemperature2(value);;
			break;
		case "302":
			po.setSoilTemperature3(value);;
			break;
		case "309":
			po.setSoilMoisture1(value);;
			break;
		case "310":
			po.setSoilMoisture2(value);;
			break;
		case "311":
			po.setSoilMoisture3(value);;
			break;

		default:
			break;
		}
	}

	@Override
	public PageOutVo<WebPressurePo> selectPressureHistory(WebPressureVo vo) {
		List<WebPressurePo> list=new ArrayList<WebPressurePo>();
		IotDataService ids=new IotDataService();
		IotDataServicePortType ispt=ids.getIotDataServiceHttpSoap11Endpoint();
		String xml=null;
		try {
		 xml=ispt.gatewayHistory("中程智能", "111111",vo.getGateway(),vo.getStartTime(),vo.getEndTime());//"867726033041874"
		} catch (Exception e) {
			
		}
		if(xml!=null && !"".equals(xml)) {
			try {
				JAXBContext context = JAXBContext.newInstance(Data.class);  
		        Unmarshaller unmarshaller = context.createUnmarshaller();  
		        Data data = (Data)unmarshaller.unmarshal(new StringReader(xml));
		        String id = null;
		        String value = null;
		        if(data.getRecord()!=null&&!data.getRecord().isEmpty()) {
		        	Map<String, WebPressurePo> po_map=new LinkedHashMap<String, WebPressurePo>();
		        for(record record:data.getRecord()) {
		        	//判断map中的key值是否相等
		        	WebPressurePo po = null;
		        	 for(Field s:record.getField()) {
		        		 if("data_time".equals(s.getColumn_name())) {
		        			if( po_map.containsKey(s.getValue())) {
		        				po=po_map.get(s.getValue());
		        				break;
		        			}else {
		        				po=new WebPressurePo();
		        				po.setGateway(vo.getGateway());
		        				po_map.put(s.getValue(), po);
		        			}		        			 
		        		 }
		        	 }		        	
		        	
		        	 for(Field s:record.getField()) {
		        		 if("data_time".equals(s.getColumn_name())) {
		        			 po.setDataTime(s.getValue());
		        		 }else if("channel_name".equals(s.getColumn_name())){
		        			 id=s.getValue();
		        		 }else if("value".equals(s.getColumn_name())){
		        			 value=s.getValue();
		        		 }
					}
		        	 setValue(id, value, po);
		        	 
		        }
		        
		        // 处理添加压力类
		        for(String key:po_map.keySet()) {
		        	list.add(po_map.get(key));
		        }
		        
		        }
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		PageOutVo<WebPressurePo> page = new PageOutVo<WebPressurePo>();
		page.setRows(list);
		return page;
	}

	@Override
	public PageOutVo<WebBusinessPo> selectBusiness(String gateway) {
		List<WebBusinessPo> list=new ArrayList<WebBusinessPo>();
		IotDataService ids=new IotDataService();
		IotDataServicePortType ispt=ids.getIotDataServiceHttpSoap11Endpoint();
		String xml=null;
		try {
			xml=ispt.gatewayData("中程智能", "111111",gateway);//"867726033041874"
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		if(xml!=null && !"".equals(xml)) {
			WebBusinessPo po=new WebBusinessPo();
			po.setGateway(gateway);
			try {
				JAXBContext context = JAXBContext.newInstance(Data.class);  
		        Unmarshaller unmarshaller = context.createUnmarshaller();  
		        Data data = (Data)unmarshaller.unmarshal(new StringReader(xml));
		        String id = null;
		        String value = null;
		        for(record record:data.getRecord()) {
		        	 for(Field s:record.getField()) {
		        		 if("data_time".equals(s.getColumn_name())) {
		        			 po.setDataTime(s.getValue());
		        		 }else if("channel_name".equals(s.getColumn_name())){
		        			 id=s.getValue();
		        		 }else if("value".equals(s.getColumn_name())){
		        			 value=s.getValue();
		        		 }
					}
		        	 setValue(id, value, po);
		        }
			} catch (Exception e) {
				e.printStackTrace();
			}
			list.add(po);
		}
		PageOutVo<WebBusinessPo> page = new PageOutVo<WebBusinessPo>();
		page.setRows(list);
		return page;
	}

	@Override
	public PageOutVo<WebBusinessPo> selectBusinessHistory(WebPressureVo vo) {
		List<WebBusinessPo> list=new ArrayList<WebBusinessPo>();
		IotDataService ids=new IotDataService();
		IotDataServicePortType ispt=ids.getIotDataServiceHttpSoap11Endpoint();
		String xml = null;
		try {
			xml=ispt.gatewayHistory("中程智能", "111111",vo.getGateway(),vo.getStartTime(),vo.getEndTime());//"867726033041874"
		} catch (Exception e) {
			
		}		
		if(xml!=null && !"".equals(xml)) {
			try {
				JAXBContext context = JAXBContext.newInstance(Data.class);  
		        Unmarshaller unmarshaller = context.createUnmarshaller();  
		        Data data = (Data)unmarshaller.unmarshal(new StringReader(xml));
		        String id = null;
		        String value = null;
		        if(data.getRecord()!=null&&!data.getRecord().isEmpty()) {
		        	Map<String, WebBusinessPo> po_map=new LinkedHashMap<String, WebBusinessPo>();
		        for(record record:data.getRecord()) {
		        	//判断map中的key值是否相等
		        	WebBusinessPo po = null;
		        	 for(Field s:record.getField()) {
		        		 if("data_time".equals(s.getColumn_name())) {
		        			if( po_map.containsKey(s.getValue())) {
		        				po=po_map.get(s.getValue());
		        				break;
		        			}else {
		        				po=new WebBusinessPo();
		        				po.setGateway(vo.getGateway());
		        				po_map.put(s.getValue(), po);
		        			}		        			 
		        		 }
		        	 }	
					
		        	 for(Field s:record.getField()) {
		        		 if("data_time".equals(s.getColumn_name())) {
		        			 po.setDataTime(s.getValue());
		        		 }else if("channel_name".equals(s.getColumn_name())){
		        			 id=s.getValue();
		        		 }else if("value".equals(s.getColumn_name())){
		        			 value=s.getValue();
		        		 }
					}
		        	 setValue(id, value, po);
		        	
		        }
		        
		        // 处理添加压力类
		        for(String key:po_map.keySet()) {
		        	list.add(po_map.get(key));
		        }
		        }
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		PageOutVo<WebBusinessPo> page = new PageOutVo<WebBusinessPo>();
		page.setRows(list);
		return page;
	}

}
