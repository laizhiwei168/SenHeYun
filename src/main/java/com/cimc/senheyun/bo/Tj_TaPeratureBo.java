package com.cimc.senheyun.bo;

public class Tj_TaPeratureBo {

	private String pkEquipment ;// '装备主键',
	private String dataTime ;// '数据时间',
	private Double liquidlevelmpa;
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
	public Double getLiquidlevelmpa() {
		return liquidlevelmpa;
	}
	public void setLiquidlevelmpa(Double liquidlevelmpa) {
		this.liquidlevelmpa = liquidlevelmpa;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	
}
