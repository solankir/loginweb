package com.aciworldwide.entities;

import org.springframework.stereotype.Component;

@Component
public class User {
	
	private String username; //this will be automatically name of form html username
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
