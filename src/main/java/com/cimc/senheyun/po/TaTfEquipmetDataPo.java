package com.cimc.senheyun.po;

public class TaTfEquipmetDataPo {

	private String  pkEquipment ;// '装备主键',
	private String   dataTime ;// '数据时间',
	private Integer  deviceAlert ;// '有无报警',
	private Integer  deviceOperatePattern ;// '设备操作模式',
	private Integer  pushFatStatus ;// '推肥状态',
	private Integer  pushFatDoorStatus1 ;// '推肥门1',
	private Integer  pushFatDoorStatus2 ;// '推肥门2',
	private Integer  pushFatDoorStatus3 ;// '推肥门3',
	private Integer  pushFatDoorStatus4 ;// '推肥门4',
	private Integer  pushFatPumpStatus ;// '推肥泵状态',
	private Integer  pushFatNumber ;// '推肥次数',
	private Double   KPFatWeight ;// '当前推K,P肥重量',
	private Double  KPSecondFatWeight ;// '当前推K,P副肥重量',
	private Double XSAFatWeight ;// '当前推硫酸铵肥重量',
	private Double  KPFatGross ;// 'K,P肥总量',
	private Double  KPSecondFatGross ;// 'K,P副肥总量',
	private Double  XSAFatGross ;// '硫酸铵肥总量',
	private Double  KPFatLength ;// '当前推K,P(主)肥时长',
	private Double  KPSecondFatLength ;// '当前推K,P(备)肥时长',
	private Double  XSAFatLength ;// '推硫酸铵肥时长',
	private Double  KPFatTotalLength ;// '当前推K,P(主)肥总时长',
	private Double  KPSecondFatTotalLength ;// '当前推K,P(备)肥总时长',
	private Double  XSAFatTotalLength ;// '推硫酸铵肥总时长',
	private Double  instantFlow ;// '当前瞬时流量',
	private Double  pumpLaterPressure ;// '泵后压力',
	private Double  KPFatTanklevel ;// 'KP肥罐液位',
	private Double  KPSecondFatTanklevel ;// 'KP副肥罐液位',
	private Double  XSAFatTanklevel ;// '硫酸铵肥罐液位',
	private Double  KPFatWeightValue ;// '推P,K肥重量设定值',
	private Double KPSecondFatWeightValue ;// '推P,K副肥重量设定值	',
	private Double  XSAFatWeightValue ;// '推硫酸铵肥重量设定值',
	private Double  KPFatCompensationValue ;// 'K,P(主)肥补偿设定值',
	private Double KPSecondFatCompensationValue ;// 'K,P(备)肥补偿设定值',
	private Double XSAFatCompensationValue ;// '硫酸铵肥补偿设定值',
	private Double  pumpLaterPressureLowValue ;// '泵后压力低设定值',
	private Double  FlowLowValue ;// '流量低设定值',
	private Double  pumpFrequencyValue ;// '泵频率设定值',
	private Double  KPPushFatNumber ;// 'K,P(主)肥推肥次数',
	private Double KPSecondPushFatNumber ;// 'K,P(备)肥推肥次数',
	private Double  XSAPushFatNumber ;// '硫酸铵肥推肥次数',
	public String getPkEquipment() {
		return pkEquipment;
	}
	public void setPkEquipment(String pkEquipment) {
		this.pkEquipment = pkEquipment;
	}
	public String getDataTime() {
		return dataTime;
	}
	public void setDataTime(String dataTime) {
		this.dataTime = dataTime;
	}
	public Integer getDeviceAlert() {
		return deviceAlert;
	}
	public void setDeviceAlert(Integer deviceAlert) {
		this.deviceAlert = deviceAlert;
	}
	public Integer getDeviceOperatePattern() {
		return deviceOperatePattern;
	}
	public void setDeviceOperatePattern(Integer deviceOperatePattern) {
		this.deviceOperatePattern = deviceOperatePattern;
	}
	public Integer getPushFatStatus() {
		return pushFatStatus;
	}
	public void setPushFatStatus(Integer pushFatStatus) {
		this.pushFatStatus = pushFatStatus;
	}
	public Integer getPushFatDoorStatus1() {
		return pushFatDoorStatus1;
	}
	public void setPushFatDoorStatus1(Integer pushFatDoorStatus1) {
		this.pushFatDoorStatus1 = pushFatDoorStatus1;
	}
	public Integer getPushFatDoorStatus2() {
		return pushFatDoorStatus2;
	}
	public void setPushFatDoorStatus2(Integer pushFatDoorStatus2) {
		this.pushFatDoorStatus2 = pushFatDoorStatus2;
	}
	public Integer getPushFatDoorStatus3() {
		return pushFatDoorStatus3;
	}
	public void setPushFatDoorStatus3(Integer pushFatDoorStatus3) {
		this.pushFatDoorStatus3 = pushFatDoorStatus3;
	}
	public Integer getPushFatDoorStatus4() {
		return pushFatDoorStatus4;
	}
	public void setPushFatDoorStatus4(Integer pushFatDoorStatus4) {
		this.pushFatDoorStatus4 = pushFatDoorStatus4;
	}
	public Integer getPushFatPumpStatus() {
		return pushFatPumpStatus;
	}
	public void setPushFatPumpStatus(Integer pushFatPumpStatus) {
		this.pushFatPumpStatus = pushFatPumpStatus;
	}
	public Integer getPushFatNumber() {
		return pushFatNumber;
	}
	public void setPushFatNumber(Integer pushFatNumber) {
		this.pushFatNumber = pushFatNumber;
	}
	public Double getKPFatWeight() {
		return KPFatWeight;
	}
	public void setKPFatWeight(Double kPFatWeight) {
		KPFatWeight = kPFatWeight;
	}
	public Double getKPSecondFatWeight() {
		return KPSecondFatWeight;
	}
	public void setKPSecondFatWeight(Double kPSecondFatWeight) {
		KPSecondFatWeight = kPSecondFatWeight;
	}
	public Double getXSAFatWeight() {
		return XSAFatWeight;
	}
	public void setXSAFatWeight(Double xSAFatWeight) {
		XSAFatWeight = xSAFatWeight;
	}
	public Double getKPFatGross() {
		return KPFatGross;
	}
	public void setKPFatGross(Double kPFatGross) {
		KPFatGross = kPFatGross;
	}
	public Double getKPSecondFatGross() {
		return KPSecondFatGross;
	}
	public void setKPSecondFatGross(Double kPSecondFatGross) {
		KPSecondFatGross = kPSecondFatGross;
	}
	public Double getXSAFatGross() {
		return XSAFatGross;
	}
	public void setXSAFatGross(Double xSAFatGross) {
		XSAFatGross = xSAFatGross;
	}
	public Double getKPFatLength() {
		return KPFatLength;
	}
	public void setKPFatLength(Double kPFatLength) {
		KPFatLength = kPFatLength;
	}
	public Double getKPSecondFatLength() {
		return KPSecondFatLength;
	}
	public void setKPSecondFatLength(Double kPSecondFatLength) {
		KPSecondFatLength = kPSecondFatLength;
	}
	public Double getXSAFatLength() {
		return XSAFatLength;
	}
	public void setXSAFatLength(Double xSAFatLength) {
		XSAFatLength = xSAFatLength;
	}
	public Double getKPFatTotalLength() {
		return KPFatTotalLength;
	}
	public void setKPFatTotalLength(Double kPFatTotalLength) {
		KPFatTotalLength = kPFatTotalLength;
	}
	public Double getKPSecondFatTotalLength() {
		return KPSecondFatTotalLength;
	}
	public void setKPSecondFatTotalLength(Double kPSecondFatTotalLength) {
		KPSecondFatTotalLength = kPSecondFatTotalLength;
	}
	public Double getXSAFatTotalLength() {
		return XSAFatTotalLength;
	}
	public void setXSAFatTotalLength(Double xSAFatTotalLength) {
		XSAFatTotalLength = xSAFatTotalLength;
	}
	public Double getInstantFlow() {
		return instantFlow;
	}
	public void setInstantFlow(Double instantFlow) {
		this.instantFlow = instantFlow;
	}
	public Double getPumpLaterPressure() {
		return pumpLaterPressure;
	}
	public void setPumpLaterPressure(Double pumpLaterPressure) {
		this.pumpLaterPressure = pumpLaterPressure;
	}
	public Double getKPFatTanklevel() {
		return KPFatTanklevel;
	}
	public void setKPFatTanklevel(Double kPFatTanklevel) {
		KPFatTanklevel = kPFatTanklevel;
	}
	public Double getKPSecondFatTanklevel() {
		return KPSecondFatTanklevel;
	}
	public void setKPSecondFatTanklevel(Double kPSecondFatTanklevel) {
		KPSecondFatTanklevel = kPSecondFatTanklevel;
	}
	public Double getXSAFatTanklevel() {
		return XSAFatTanklevel;
	}
	public void setXSAFatTanklevel(Double xSAFatTanklevel) {
		XSAFatTanklevel = xSAFatTanklevel;
	}
	public Double getKPFatWeightValue() {
		return KPFatWeightValue;
	}
	public void setKPFatWeightValue(Double kPFatWeightValue) {
		KPFatWeightValue = kPFatWeightValue;
	}
	public Double getKPSecondFatWeightValue() {
		return KPSecondFatWeightValue;
	}
	public void setKPSecondFatWeightValue(Double kPSecondFatWeightValue) {
		KPSecondFatWeightValue = kPSecondFatWeightValue;
	}
	public Double getXSAFatWeightValue() {
		return XSAFatWeightValue;
	}
	public void setXSAFatWeightValue(Double xSAFatWeightValue) {
		XSAFatWeightValue = xSAFatWeightValue;
	}
	public Double getKPFatCompensationValue() {
		return KPFatCompensationValue;
	}
	public void setKPFatCompensationValue(Double kPFatCompensationValue) {
		KPFatCompensationValue = kPFatCompensationValue;
	}
	public Double getKPSecondFatCompensationValue() {
		return KPSecondFatCompensationValue;
	}
	public void setKPSecondFatCompensationValue(Double kPSecondFatCompensationValue) {
		KPSecondFatCompensationValue = kPSecondFatCompensationValue;
	}
	public Double getXSAFatCompensationValue() {
		return XSAFatCompensationValue;
	}
	public void setXSAFatCompensationValue(Double xSAFatCompensationValue) {
		XSAFatCompensationValue = xSAFatCompensationValue;
	}
	public Double getPumpLaterPressureLowValue() {
		return pumpLaterPressureLowValue;
	}
	public void setPumpLaterPressureLowValue(Double pumpLaterPressureLowValue) {
		this.pumpLaterPressureLowValue = pumpLaterPressureLowValue;
	}
	public Double getFlowLowValue() {
		return FlowLowValue;
	}
	public void setFlowLowValue(Double flowLowValue) {
		FlowLowValue = flowLowValue;
	}
	public Double getPumpFrequencyValue() {
		return pumpFrequencyValue;
	}
	public void setPumpFrequencyValue(Double pumpFrequencyValue) {
		this.pumpFrequencyValue = pumpFrequencyValue;
	}
	public Double getKPPushFatNumber() {
		return KPPushFatNumber;
	}
	public void setKPPushFatNumber(Double kPPushFatNumber) {
		KPPushFatNumber = kPPushFatNumber;
	}
	public Double getKPSecondPushFatNumber() {
		return KPSecondPushFatNumber;
	}
	public void setKPSecondPushFatNumber(Double kPSecondPushFatNumber) {
		KPSecondPushFatNumber = kPSecondPushFatNumber;
	}
	public Double getXSAPushFatNumber() {
		return XSAPushFatNumber;
	}
	public void setXSAPushFatNumber(Double xSAPushFatNumber) {
		XSAPushFatNumber = xSAPushFatNumber;
	}
	
}
