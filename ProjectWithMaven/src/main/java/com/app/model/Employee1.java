package com.app.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emptabcom")
public class Employee1 {
	
	@Id
	@Column(name="eid")
	private int empId;
	@Column(name ="ename")
	private String empName;
	@Column(name="esal")
	private double empSal;
	@Embedded
	private Address addr;
	
	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Employee1 [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", addr=" + addr + "]";
	}
	
	
}
