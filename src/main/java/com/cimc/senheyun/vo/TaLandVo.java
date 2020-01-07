package com.cimc.senheyun.vo;

public class TaLandVo extends PageBasics{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String landname;
	private String pkLand;
	private String pkCompany;
	
	public String getPkLand() {
		return pkLand;
	}
	public void setPkLand(String pkLand) {
		this.pkLand = pkLand;
	}
	public String getLandname() {
		return landname;
	}
	public void setLandname(String landname) {
		this.landname = landname;
	}
	public String getPkCompany() {
		return pkCompany;
	}
	public void setPkCompany(String pkCompany) {
		this.pkCompany = pkCompany;
	}
	
}
