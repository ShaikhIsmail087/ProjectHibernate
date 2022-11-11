package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "empTab1")
public class Employee1 extends Person1{
	
	@Column(name = "sal")
	private double empSal;
	@Column(name = "prj")
	private String empProj;
	
	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public String getEmpProj() {
		return empProj;
	}
	public void setEmpProj(String empProj) {
		this.empProj = empProj;
	}
	@Override
	public String toString() {
		return "Employee1 [empSal=" + empSal + ", empProj=" + empProj + "]";
	}
	
	
}
