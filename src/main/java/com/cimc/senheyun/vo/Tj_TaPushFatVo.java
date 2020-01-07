package com.cimc.senheyun.vo;

public class Tj_TaPushFatVo extends PageBasics{

	private String  pkEquipment ;// '装备主键',
	private String equipmentNo;
	private String  dataFormat;// '%Y-%m-%d'   '%Y-%m'  '%Y'  '%Y-%u'
	private boolean is_KPFatWeight;
	private boolean is_KPSecondFatWeight;
	private boolean is_XSAFatWeight;
	
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
	public boolean isIs_KPFatWeight() {
		return is_KPFatWeight;
	}
	public void setIs_KPFatWeight(boolean is_KPFatWeight) {
		this.is_KPFatWeight = is_KPFatWeight;
	}
	public boolean isIs_KPSecondFatWeight() {
		return is_KPSecondFatWeight;
	}
	public void setIs_KPSecondFatWeight(boolean is_KPSecondFatWeight) {
		this.is_KPSecondFatWeight = is_KPSecondFatWeight;
	}
	public boolean isIs_XSAFatWeight() {
		return is_XSAFatWeight;
	}
	public void setIs_XSAFatWeight(boolean is_XSAFatWeight) {
		this.is_XSAFatWeight = is_XSAFatWeight;
	}
	public String getEquipmentNo() {
		return equipmentNo;
	}
	public void setEquipmentNo(String equipmentNo) {
		this.equipmentNo = equipmentNo;
	}
	
	
}
