package com.cimc.senheyun.bo;

public class Tj_TaPushFatBo {

	private String pkEquipment ;// '装备主键',
	private String dataTime ;// '数据时间',
	private Double KPFatWeight ;// '当前推K,P肥重量',
	private Double KPSecondFatWeight ;// '当前推K,P副肥重量',
	private Double XSAFatWeight ;// '当前推硫酸铵肥重量',
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
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	
}
