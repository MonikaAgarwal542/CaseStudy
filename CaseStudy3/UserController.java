package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.model.UserDAO;

@RestController
public class UserController {
	@Autowired
	UserDAO userDAO;
	@PostMapping("/adduser")
	public String addUser(@RequestBody User u) {
		userDAO.save(u);
		return "user added";
	}

}
