package com.cimc.senheyun.bo;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="data")
public class Data {
	private List<record> record;

	public List<record> getRecord() {
		return record;
	}
	@XmlElement(name="record") 
	public void setRecord(List<record> record) {
		this.record = record;
	}

}

