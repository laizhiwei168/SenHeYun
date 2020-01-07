package com.cimc.senheyun.vo;

public class PxTrainclassVo extends PageBasics {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String pkTrainclass;
	private String name;
	
	//培训类型
	private String pkTraintype;
	
	// 培训大纲
	private String pkTraintitle;
	private String traintitlename;
	 
	public String getPkTraintitle() {
		return pkTraintitle;
	}
	public void setPkTraintitle(String pkTraintitle) {
		this.pkTraintitle = pkTraintitle;
	}
	public String getTraintitlename() {
		return traintitlename;
	}
	public void setTraintitlename(String traintitlename) {
		this.traintitlename = traintitlename;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPkTraintype() {
		return pkTraintype;
	}
	public void setPkTraintype(String pkTraintype) {
		this.pkTraintype = pkTraintype;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getPkTrainclass() {
		return pkTrainclass;
	}
	public void setPkTrainclass(String pkTrainclass) {
		this.pkTrainclass = pkTrainclass;
	}
}
