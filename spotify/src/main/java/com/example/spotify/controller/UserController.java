package com.example.spotify.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spotify.model.User;
import com.example.spotify.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/user")
	public void validuser(@RequestBody User user)
	{
		userService.findUser(user);
	}
	
	@PostMapping("/adduser")
	public void adduser(@RequestBody User user)
	{
		userService.addUser(user);
	}

}
