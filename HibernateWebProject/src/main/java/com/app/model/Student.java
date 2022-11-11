package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "StudentTab")
public class Student {
	
	@Id
	@Column(name = "sid")
	private Integer stdId;
	@Column(name = "sname")
	private String stdName;
	@Column(name = "sfee")
	private Double stdFee;
	@Column(name = "sage")
	private Integer stdAge;
	@Column(name = "smob")
	private Integer mob;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Integer stdId, String stdName, Double stdFee, Integer stdAge, Integer mob) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdFee = stdFee;
		this.stdAge = stdAge;
		this.mob = mob;
	}

	public Integer getStdId() {
		return stdId;
	}

	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public Double getStdFee() {
		return stdFee;
	}

	public void setStdFee(Double stdFee) {
		this.stdFee = stdFee;
	}

	public Integer getStdAge() {
		return stdAge;
	}

	public void setStdAge(Integer stdAge) {
		this.stdAge = stdAge;
	}

	public Integer getMob() {
		return mob;
	}

	public void setMob(Integer mob) {
		this.mob = mob;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdFee=" + stdFee + ", stdAge=" + stdAge
				+ ", mob=" + mob + "]";
	}
	
	
	
}
