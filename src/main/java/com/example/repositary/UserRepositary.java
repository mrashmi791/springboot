package com.example.repositary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.DTO.User;

@Repository
public class UserRepositary {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public boolean saveUser(User user) {
		jdbcTemplate.execute("insert into user values("+user.getId()+",'"+user.getName()+"','" +user.getEmail()+"','"+user.getPassword()+"')");
	return true;
	}
}
