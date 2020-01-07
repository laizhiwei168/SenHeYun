package com.cimc.senheyun.bo;

public class Tj_TaWeatherDetectorBo {

	private String pkEquipment ;// '装备主键',
	private String dataTime ;// '数据时间',
	
	private Double temperature ;// 温度
	private Double humidity ;// '湿度
	private Double illuminance ;// '照度
	private Double soilTemperature;//'土壤温度 
	private Double soliWater ;// '土壤水分
	private Double  airPressure;// '大气压力
	private Double  CO2;// 
	private Double  windSpeed;// '风速
	private Double  windDirection;// 风向
	private Double  rainfall;//雨量
	
	private Integer amount;//总数

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

	public Double getTemperature() {
		return temperature;
	}

	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}

	public Double getHumidity() {
		return humidity;
	}

	public void setHumidity(Double humidity) {
		this.humidity = humidity;
	}

	public Double getIlluminance() {
		return illuminance;
	}

	public void setIlluminance(Double illuminance) {
		this.illuminance = illuminance;
	}

	public Double getSoilTemperature() {
		return soilTemperature;
	}

	public void setSoilTemperature(Double soilTemperature) {
		this.soilTemperature = soilTemperature;
	}

	public Double getSoliWater() {
		return soliWater;
	}

	public void setSoliWater(Double soliWater) {
		this.soliWater = soliWater;
	}

	public Double getAirPressure() {
		return airPressure;
	}

	public void setAirPressure(Double airPressure) {
		this.airPressure = airPressure;
	}

	public Double getCO2() {
		return CO2;
	}

	public void setCO2(Double cO2) {
		CO2 = cO2;
	}

	public Double getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(Double windSpeed) {
		this.windSpeed = windSpeed;
	}

	public Double getWindDirection() {
		return windDirection;
	}

	public void setWindDirection(Double windDirection) {
		this.windDirection = windDirection;
	}

	public Double getRainfall() {
		return rainfall;
	}

	public void setRainfall(Double rainfall) {
		this.rainfall = rainfall;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}
		
}
