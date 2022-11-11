package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "perTab1")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Person1 {
	@Id
	@Column(name = "pid")
	private int perId;
	@Column(name = "pname")
	private String perName;
	
	public Person1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPerId() {
		return perId;
	}
	public void setPerId(int perId) {
		this.perId = perId;
	}
	public String getPerName() {
		return perName;
	}
	public void setPerName(String perName) {
		this.perName = perName;
	}
	@Override
	public String toString() {
		return "Person1 [perId=" + perId + ", perName=" + perName + "]";
	}
	
	
}
