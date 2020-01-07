package com.cimc.senheyun.bo;

import com.cimc.senheyun.po.PxTrainclassPo;

public class PxTrainclassBaseBo  extends PxTrainclassPo{

	private String  cuserName;
	private String orgName;
		
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getCuserName() {
		return cuserName;
	}
	public void setCuserName(String cuserName) {
		this.cuserName = cuserName;
	}	
}
