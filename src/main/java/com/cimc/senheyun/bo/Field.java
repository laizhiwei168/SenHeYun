package com.cimc.senheyun.bo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="field")
public class Field {
	private String column_name;
	private String value;
	public String getColumn_name() {
		return column_name;
	}
	 @XmlElement 
	public void setColumn_name(String column_name) {
		this.column_name = column_name;
	}
	public String getValue() {
		return value;
	}
	 @XmlElement 
	public void setValue(String value) {
		this.value = value;
	}
}
