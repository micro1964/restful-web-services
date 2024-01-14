package com.reggy.rest.webservices.restfulwebservices.user;

import java.util.Date;

public class User {
	
	private Integer id;
	
	private String name;
	
	private String mobileNumber;
	
	private Date dob;
	
	public User(Integer id, String name, String mobileNumber, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.dob = dob;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", mobileNumber=" + mobileNumber + ", dob=" + dob + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

}
