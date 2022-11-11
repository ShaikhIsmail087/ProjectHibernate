package com.tut;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_details")
public class Employee {
	@Id
	@Column(name = "emp_id")
	private int eId;
	
	@Column(name = "emp_name")
	private String eName;
	
	@Column(name = "emp_salary")
	private double eSalary;
	
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double geteSalary() {
		return eSalary;
	}
	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}
	public Employee(int eId, String eName, double eSalary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
