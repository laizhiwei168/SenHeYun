package com.cimc.senheyun.vo;

public class Tj_TaWeatherDetectorVo extends PageBasics{

	private String  pkEquipment ;// '装备主键',
	private String  dataFormat;// '%Y-%m-%d'   '%Y-%m'  '%Y'  '%Y-%u'
	private String equipmentNo;
	private boolean is_temperature ;// 温度
	private boolean is_humidity ;// '湿度
	private boolean is_illuminance ;// '照度
	private boolean is_soilTemperature;//'土壤温度 
	private boolean is_soliWater ;// '土壤水分
	private boolean  is_airPressure;// '大气压力
	private boolean  is_CO2;// 
	private boolean  is_windSpeed;// '风速
	private boolean  is_windDirection;// 风向
	private boolean  is_rainfall;//雨量
	
	public String getPkEquipment() {
		return pkEquipment;
	}
	public void setPkEquipment(String pkEquipment) {
		this.pkEquipment = pkEquipment;
	}
	public String getDataFormat() {
		return dataFormat;
	}
	public void setDataFormat(String dataFormat) {
		this.dataFormat = dataFormat;
	}
	public boolean isIs_temperature() {
		return is_temperature;
	}
	public void setIs_temperature(boolean is_temperature) {
		this.is_temperature = is_temperature;
	}
	public boolean isIs_humidity() {
		return is_humidity;
	}
	public void setIs_humidity(boolean is_humidity) {
		this.is_humidity = is_humidity;
	}
	public boolean isIs_illuminance() {
		return is_illuminance;
	}
	public void setIs_illuminance(boolean is_illuminance) {
		this.is_illuminance = is_illuminance;
	}
	public boolean isIs_soilTemperature() {
		return is_soilTemperature;
	}
	public void setIs_soilTemperature(boolean is_soilTemperature) {
		this.is_soilTemperature = is_soilTemperature;
	}
	public boolean isIs_soliWater() {
		return is_soliWater;
	}
	public void setIs_soliWater(boolean is_soliWater) {
		this.is_soliWater = is_soliWater;
	}
	public boolean isIs_airPressure() {
		return is_airPressure;
	}
	public void setIs_airPressure(boolean is_airPressure) {
		this.is_airPressure = is_airPressure;
	}
	public boolean isIs_CO2() {
		return is_CO2;
	}
	public void setIs_CO2(boolean is_CO2) {
		this.is_CO2 = is_CO2;
	}
	public boolean isIs_windSpeed() {
		return is_windSpeed;
	}
	public void setIs_windSpeed(boolean is_windSpeed) {
		this.is_windSpeed = is_windSpeed;
	}
	public boolean isIs_windDirection() {
		return is_windDirection;
	}
	public void setIs_windDirection(boolean is_windDirection) {
		this.is_windDirection = is_windDirection;
	}
	public boolean isIs_rainfall() {
		return is_rainfall;
	}
	public void setIs_rainfall(boolean is_rainfall) {
		this.is_rainfall = is_rainfall;
	}
	public String getEquipmentNo() {
		return equipmentNo;
	}
	public void setEquipmentNo(String equipmentNo) {
		this.equipmentNo = equipmentNo;
	}
	
}
