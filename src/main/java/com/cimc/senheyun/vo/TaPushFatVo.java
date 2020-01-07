package com.cimc.senheyun.vo;

public class TaPushFatVo extends PageBasics{

	private Integer equipmentType;
	private String pkEquipment;
	private String equipmentNo;

	public String getEquipmentNo() {
		return equipmentNo;
	}

	public void setEquipmentNo(String equipmentNo) {
		this.equipmentNo = equipmentNo;
	}
	
	public Integer getEquipmentType() {
		return equipmentType;
	}

	public void setEquipmentType(Integer equipmentType) {
		this.equipmentType = equipmentType;
	}

	public String getPkEquipment() {
		return pkEquipment;
	}

	public void setPkEquipment(String pkEquipment) {
		this.pkEquipment = pkEquipment;
	}
}
