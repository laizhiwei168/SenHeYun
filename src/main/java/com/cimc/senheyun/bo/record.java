package com.cimc.senheyun.bo;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="record")
public class record {

	private List<Field> field;

	public List<Field> getField() {
		return field;
	}
	
	@XmlElement(name="field")
	public void setField(List<Field> field) {
		this.field = field;
	}
}
