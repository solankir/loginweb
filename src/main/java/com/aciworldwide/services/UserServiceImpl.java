package com.aciworldwide.services;

import org.springframework.stereotype.Service;

import com.aciworldwide.entities.User;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public boolean isValidUser(User user) {
		
		if(user!=null && user.getUsername().equals("saunak") && user.getPassword().equals("Welcome123")) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
