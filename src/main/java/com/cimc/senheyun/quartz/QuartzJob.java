package com.cimc.senheyun.quartz;

import javax.annotation.Resource;

import com.cimc.senheyun.po.TaBusinessPo;
import com.cimc.senheyun.po.TaEquipmentPo;
import com.cimc.senheyun.po.TaPeraturePo;
import com.cimc.senheyun.po.WebBusinessPo;
import com.cimc.senheyun.po.WebPressurePo;
import com.cimc.senheyun.service.TaBusinessService;
import com.cimc.senheyun.service.TaEquipmentService;
import com.cimc.senheyun.service.TaPeratureService;
import com.cimc.senheyun.service.Webservice;
import com.cimc.senheyun.utils.DateUtils;
import com.cimc.senheyun.vo.PageOutVo;
import com.cimc.senheyun.vo.TaEquipmentVo;
import com.cimc.senheyun.vo.WebPressureVo;

public class QuartzJob {

	@Resource(name="taEquipmentService")
	private TaEquipmentService service;
	
	@Resource(name="webservice")
	private Webservice service2;
	
	@Resource(name="taPeratureService")
	private TaPeratureService service3;
	
	@Resource(name="taBusinessService")
	private TaBusinessService service4;
	
	public void workForToken() {
		System.out.println("=================workForToken================");
		handlePressure();// 压力
		handleBusiness();// 商情
	}
	
	private void handlePressure() {
		//System.out.println("=================handlePressure================");
		TaEquipmentVo vo=new TaEquipmentVo();
		vo.setEquipmentType(3);
		vo.setFirstIndex(0);
		vo.setPageSize(100);
		PageOutVo<TaEquipmentPo> list=service.selectByExample(vo);		
		if(list.getRows().size()>0) {
			for(TaEquipmentPo po:list.getRows()) {
				WebPressureVo wpvo=new WebPressureVo();
				wpvo.setGateway(po.getEquipmentNo());
				wpvo.setStartTime(DateUtils.getNewDate2BCDand(24));//
				wpvo.setEndTime(DateUtils.getDoDayTime());//
				PageOutVo<WebPressurePo> wplist=service2.selectPressureHistory(wpvo);
				if(wplist.getRows().size()>0) {
					//System.out.println("======================  "+wplist.getRows().size());
					for(WebPressurePo wppo:wplist.getRows()) {
						if(wppo.getLiquidLevelMPa()!=null) {
							TaPeraturePo record=new TaPeraturePo();
							record.setPkEquipment(po.getPkEquipment());
							record.setDatatime(wppo.getDataTime());
							record.setBatterycapacity(wppo.getBatteryCapacity()==null?null:Double.valueOf(wppo.getBatteryCapacity()));
							record.setLiquidlevelmpa(Double.valueOf(wppo.getLiquidLevelMPa()));
							record.setSignalValue(wppo.getSignal()==null?null:Double.valueOf(wppo.getSignal()) );
							//System.out.println(record.toString());
							service3.myinsertHistory(record);
						}
					}
				}
			}
		}
	}
	
	private void handleBusiness() {
		//System.out.println("=================handleBusiness================");
		TaEquipmentVo vo=new TaEquipmentVo();
		vo.setEquipmentType(9);
		vo.setFirstIndex(0);
		vo.setPageSize(100);
		PageOutVo<TaEquipmentPo> list=service.selectByExample(vo);		
		if(list.getRows().size()>0) {
			for(TaEquipmentPo po:list.getRows()) {
				WebPressureVo wpvo=new WebPressureVo();
				wpvo.setGateway(po.getEquipmentNo());
				wpvo.setStartTime(DateUtils.getNewDate2BCDand(24));//
				wpvo.setEndTime(DateUtils.getDoDayTime());//
				PageOutVo<WebBusinessPo> wplist=service2.selectBusinessHistory(wpvo);
				if(wplist.getRows().size()>0) {
					//System.out.println("======================  "+wplist.getRows().size());
					for(WebBusinessPo wppo:wplist.getRows()) {
						//if(wppo.getLiquidLevelMPa()!=null) {
						TaBusinessPo record=new TaBusinessPo();
							record.setPkEquipment(po.getPkEquipment());;
							record.setDatatime(wppo.getDataTime());;
							record.setBatterycapacity(wppo.getBatteryCapacity()==null?null:Double.valueOf(wppo.getBatteryCapacity()));;
							record.setSignalValue(wppo.getSignal()==null?null:Double.valueOf(wppo.getSignal()));;
							record.setDatanumber(wppo.getDataNumber());
							record.setImei(wppo.getIMEI());
							record.setIccid(wppo.getICCID());
							record.setSoiltemperature1(wppo.getSoilTemperature1()==null?null:Double.valueOf(wppo.getSoilTemperature1()));;
							record.setSoiltemperature2(wppo.getSoilTemperature2()==null?null:Double.valueOf(wppo.getSoilTemperature2()));;
							record.setSoiltemperature3(wppo.getSoilTemperature3()==null?null:Double.valueOf(wppo.getSoilTemperature3()));;
							record.setSoilmoisture1(wppo.getSoilMoisture1()==null?null:Double.valueOf(wppo.getSoilMoisture1()));;
							record.setSoilmoisture2(wppo.getSoilMoisture2()==null?null:Double.valueOf(wppo.getSoilMoisture2()));;
							record.setSoilmoisture3(wppo.getSoilMoisture3()==null?null:Double.valueOf(wppo.getSoilMoisture3()));;
							//System.out.println(record.toString());
							service4.myinsertHistory(record);
						//}
					}
				}
			}
		}
	}
	
}
