package com.cimc.senheyun.vo;

public class Tj_TaBusinessVo  extends PageBasics{

	private String  pkEquipment ;// '装备主键',
	private String equipmentNo;
	private String  dataFormat;// '%Y-%m-%d'   '%Y-%m'  '%Y'  '%Y-%u'
	private boolean is_soiltemperature1;
    private boolean is_soiltemperature2;
    private boolean is_soiltemperature3;
    private boolean is_soilmoisture1;
    private boolean is_soilmoisture2;
    private boolean is_soilmoisture3;
    
    
    
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
	public boolean isIs_soiltemperature1() {
		return is_soiltemperature1;
	}
	public void setIs_soiltemperature1(boolean is_soiltemperature1) {
		this.is_soiltemperature1 = is_soiltemperature1;
	}
	public boolean isIs_soiltemperature2() {
		return is_soiltemperature2;
	}
	public void setIs_soiltemperature2(boolean is_soiltemperature2) {
		this.is_soiltemperature2 = is_soiltemperature2;
	}
	public boolean isIs_soiltemperature3() {
		return is_soiltemperature3;
	}
	public void setIs_soiltemperature3(boolean is_soiltemperature3) {
		this.is_soiltemperature3 = is_soiltemperature3;
	}
	public boolean isIs_soilmoisture1() {
		return is_soilmoisture1;
	}
	public void setIs_soilmoisture1(boolean is_soilmoisture1) {
		this.is_soilmoisture1 = is_soilmoisture1;
	}
	public boolean isIs_soilmoisture2() {
		return is_soilmoisture2;
	}
	public void setIs_soilmoisture2(boolean is_soilmoisture2) {
		this.is_soilmoisture2 = is_soilmoisture2;
	}
	public boolean isIs_soilmoisture3() {
		return is_soilmoisture3;
	}
	public void setIs_soilmoisture3(boolean is_soilmoisture3) {
		this.is_soilmoisture3 = is_soilmoisture3;
	}
	public String getEquipmentNo() {
		return equipmentNo;
	}
	public void setEquipmentNo(String equipmentNo) {
		this.equipmentNo = equipmentNo;
	}
    
    
}
