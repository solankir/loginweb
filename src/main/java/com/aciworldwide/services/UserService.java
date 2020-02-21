package com.aciworldwide.services;


import com.aciworldwide.entities.User;

//business layer interface

public interface UserService {
	
	//business logic methods
	boolean isValidUser(User user);

}
