package com.vital.example;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "employee")

public class EmployeeXml {
	private String name;
	private String id;
	@XmlElement
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@XmlAttribute
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
