package com.dataOne.userService.model;

public class UserRegistrationForm {

	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String password;

	private String rePassword;
	

	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void serRePassword(String rePassword) {
		this.rePassword = rePassword;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public String getRePassword() {
		return this.rePassword;
	}

}
