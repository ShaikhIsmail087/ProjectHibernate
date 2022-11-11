package com.app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "stdTab")
@PrimaryKeyJoinColumn(name = "sid")
public class Student extends Person{
	@Column(name = "fee")
	private double stdFee;
	@Column(name = "grd")
	private String grade;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getStdFee() {
		return stdFee;
	}
	public void setStdFee(double stdFee) {
		this.stdFee = stdFee;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [stdFee=" + stdFee + ", grade=" + grade + "]";
	}
		
}
