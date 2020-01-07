package com.cimc.senheyun.po;

public class WebPressurePo {

	private String gateway;
	private String dataTime;
	private String liquidLevelMPa;//压力液位
	private String batteryCapacity;//设备电量
	private String signal;//信号
	
	@Override
	public String toString() {
		return "WebPressurePo [gateway=" + gateway + ", dataTime=" + dataTime + ", liquidLevelMPa=" + liquidLevelMPa
				+ ", batteryCapacity=" + batteryCapacity + ", signal=" + signal + "]";
	}
	public String getGateway() {
		return gateway;
	}
	public void setGateway(String gateway) {
		this.gateway = gateway;
	}
	
	public String getLiquidLevelMPa() {
		return liquidLevelMPa;
	}
	public void setLiquidLevelMPa(String liquidLevelMPa) {
		this.liquidLevelMPa = liquidLevelMPa;
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
	public String getDataTime() {
		return dataTime;
	}
	public void setDataTime(String dataTime) {
		this.dataTime = dataTime;
	}
}
