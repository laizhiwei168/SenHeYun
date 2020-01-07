package com.cimc.senheyun.bo;

import com.cimc.senheyun.po.BsUserPo;

public class Lg_BsUserBo extends BsUserPo {

	
	private String rolename;
	private Integer roleType;
	private Integer sort;
	private String pkOrgRole;
	
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	public Integer getRoleType() {
		return roleType;
	}
	public void setRoleType(Integer roleType) {
		this.roleType = roleType;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public String getPkOrgRole() {
		return pkOrgRole;
	}
	public void setPkOrgRole(String pkOrgRole) {
		this.pkOrgRole = pkOrgRole;
	}
	
}
