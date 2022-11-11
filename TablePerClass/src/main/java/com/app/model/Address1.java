package com.app.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "ADD")
public class Address1 extends Student1 {
	
	@Column(name = "vill")
	private String village;
	@Column(name = "hno")
	private int house_no;
	@Column(name = "city")
	private String city;
	
	public Address1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public int getHouse_no() {
		return house_no;
	}
	public void setHouse_no(int house_no) {
		this.house_no = house_no;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Address1 [village=" + village + ", house_no=" + house_no + ", city=" + city + "]";
	}
	
	
}
