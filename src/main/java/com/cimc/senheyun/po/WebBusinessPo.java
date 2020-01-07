package com.cimc.senheyun.po;

public class WebBusinessPo {
	
	private String gateway;
	private String dataTime;
	
	private String batteryCapacity;//设备电量
	private String signal;//信号
	private String dataNumber;//数据序号 260
	private String IMEI; //270
	private String ICCID; //271
	
	private String soilTemperature1;//第1路土壤温度  300
	private String soilTemperature2;//第2路土壤温度 301
	private String soilTemperature3;//第3路土壤温度 302
	
	private String soilMoisture1;//第1路土壤水分 309
	private String soilMoisture2;//第2路土壤水分 310
	private String soilMoisture3;//第3路土壤水分 311
	
	public String getGateway() {
		return gateway;
	}
	public void setGateway(String gateway) {
		this.gateway = gateway;
	}
	public String getDataTime() {
		return dataTime;
	}
	public void setDataTime(String dataTime) {
		this.dataTime = dataTime;
	}
	public String getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(String batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	public String getSignal() {
		return signal;
	}
	public void setSignal(String signal) {
		this.signal = signal;
	}
	public String getDataNumber() {
		return dataNumber;
	}
	public void setDataNumber(String dataNumber) {
		this.dataNumber = dataNumber;
	}
	public String getIMEI() {
		return IMEI;
	}
	public void setIMEI(String iMEI) {
		IMEI = iMEI;
	}
	public String getICCID() {
		return ICCID;
	}
	public void setICCID(String iCCID) {
		ICCID = iCCID;
	}
	public String getSoilTemperature1() {
		return soilTemperature1;
	}
	public void setSoilTemperature1(String soilTemperature1) {
		this.soilTemperature1 = soilTemperature1;
	}
	public String getSoilTemperature2() {
		return soilTemperature2;
	}
	public void setSoilTemperature2(String soilTemperature2) {
		this.soilTemperature2 = soilTemperature2;
	}
	public String getSoilTemperature3() {
		return soilTemperature3;
	}
	public void setSoilTemperature3(String soilTemperature3) {
		this.soilTemperature3 = soilTemperature3;
	}
	public String getSoilMoisture1() {
		return soilMoisture1;
	}
	public void setSoilMoisture1(String soilMoisture1) {
		this.soilMoisture1 = soilMoisture1;
	}
	public String getSoilMoisture2() {
		return soilMoisture2;
	}
	public void setSoilMoisture2(String soilMoisture2) {
		this.soilMoisture2 = soilMoisture2;
	}
	public String getSoilMoisture3() {
		return soilMoisture3;
	}
	public void setSoilMoisture3(String soilMoisture3) {
		this.soilMoisture3 = soilMoisture3;
	}
	
	
}
