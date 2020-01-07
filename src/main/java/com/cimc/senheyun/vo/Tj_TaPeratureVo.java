package com.cimc.senheyun.vo;

public class Tj_TaPeratureVo extends PageBasics{

	private String  pkEquipment ;// '装备主键',
	private String equipmentNo;
	private String  dataFormat;// '%Y-%m-%d'   '%Y-%m'  '%Y'  '%Y-%u'
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
	public String getEquipmentNo() {
		return equipmentNo;
	}
	public void setEquipmentNo(String equipmentNo) {
		this.equipmentNo = equipmentNo;
	}
	
}
