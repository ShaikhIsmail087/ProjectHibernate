package com.app.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "CLS")
public class Classes extends Student1{
	
	@Column(name = "cname")
	private String class_name;

	public Classes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getClass_name() {
		return class_name;
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	@Override
	public String toString() {
		return "Classes [class_name=" + class_name + "]";
	}
	
	
}
