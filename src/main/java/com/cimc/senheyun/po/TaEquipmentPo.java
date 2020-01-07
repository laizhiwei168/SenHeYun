package com.cimc.senheyun.po;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TaEquipmentPo {
	private String  pkEquipment ;//'装备主键',
	private String  pkCompany ;// '公司主键',
	private String   equipmentNo ;// '装备号',
	private Integer   equipmentType ;// '装备类型1:推肥机 2:气象站 3:压力泵  4:网关  5:电池阀  6:液肥灌  7:孢子捕捉器  8:昆虫捕捉器',
    private String  creator ;// '创建人',
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private String  creatortime ;// '创建时间',
    private String  modifier ;// '修改人',
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private String   modifiedtime ;//'修改时间',
    private Integer  enablestate ;//T '启用状态  1为启动  2为未启动',
	
	@Override
	public String toString() {
		return "TaEquipmentPo [pk_equipment=" + pkEquipment + ", pk_company=" + pkCompany + ", equipmentNo="
				+ equipmentNo + ", equipmentType=" + equipmentType + ", creator=" + creator + ", creatortime="
				+ creatortime + ", modifier=" + modifier + ", modifiedtime=" + modifiedtime + ", enablestate="
				+ enablestate + "]";
	}
	
	public String getPkEquipment() {
		return pkEquipment;
	}

	public void setPkEquipment(String pkEquipment) {
		this.pkEquipment = pkEquipment;
	}

	public String getPkCompany() {
		return pkCompany;
	}

	public void setPkCompany(String pkCompany) {
		this.pkCompany = pkCompany;
	}

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
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getCreatortime() {
		return creatortime;
	}
	public void setCreatortime(String creatortime) {
		this.creatortime = creatortime;
	}
	public String getModifier() {
		return modifier;
	}
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}
	public String getModifiedtime() {
		return modifiedtime;
	}
	public void setModifiedtime(String modifiedtime) {
		this.modifiedtime = modifiedtime;
	}
	public Integer getEnablestate() {
		return enablestate;
	}
	public void setEnablestate(Integer enablestate) {
		this.enablestate = enablestate;
	}
}
