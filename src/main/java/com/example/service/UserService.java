package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DTO.User;
import com.example.repositary.UserRepositary;

@Service
public class UserService {

	@Autowired
	private UserRepositary userRepositary;
	public boolean saveUser(User user) {
		return userRepositary.saveUser(user);
		
	}
}
