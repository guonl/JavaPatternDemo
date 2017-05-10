package com.guonl.listutils;

public class UserBean {
	
	private String name;
	
	private String gender;
	
	private String mobile;
	
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		
		return this.getName() + "/" + this.getGender() + "/" + this.getMobile() + "/" + this.getEmail();
	}
	
}
