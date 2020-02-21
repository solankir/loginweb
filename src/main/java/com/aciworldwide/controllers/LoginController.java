package com.aciworldwide.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aciworldwide.entities.User;
import com.aciworldwide.services.UserService;

//Presentation layer - Request processing component aka controller
@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/signin") //handlermapping - when /signin comes it'll go to this function in the business layer or model
	public String validateUser(User user,ModelMap map) {
		
		if(userService.isValidUser(user)) {
			map.addAttribute("uname", user.getUsername()); //gets 'username' field from form with name field 'username'
			return "Success"; //view
		}
		else {
			map.addAttribute("logonerror", "Invalid username/password");
			return "login";
		}
	}
}
