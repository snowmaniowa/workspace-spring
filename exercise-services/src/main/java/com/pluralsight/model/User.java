package com.pluralsight.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//DO
@XmlRootElement		//Prevents --> MessageBodyWriter not found for media type=application/xml
public class User {

	private String name;
	private int id;
	
	@XmlElement(name = "UserName")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElement(name = "UserId")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
}
