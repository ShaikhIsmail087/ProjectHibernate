package com.app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "empTab")
@PrimaryKeyJoinColumn(name = "eid")
public class Employee extends Person{
	
	@Column(name = "esal")
	private double empSal;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [empSal=" + empSal + "]";
	}
	
	
}
