package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.DTO.User;
import com.example.service.UserService;

@RestController
//@RequestMapping("/shop-mngt/api")
public class UserController {

	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value="/save-user", method=RequestMethod.POST)
	public boolean saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	@RequestMapping(value="/get-details", method=RequestMethod.GET)
	public String getDetails() {
		return "hello spring boot";
	}
}
