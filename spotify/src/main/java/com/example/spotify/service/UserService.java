package com.example.spotify.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.spotify.model.User;
import com.example.spotify.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void findUser(User user)
	{
		userRepository.findByEmail(user.getEmail());
	}

	public void addUser(User user) {
		userRepository.save(user);		
	}

}
