package com.example.spotify.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spotify.service.RatingService;

@RestController
public class RatingController {
	
	@Autowired
	RatingService ratingService;
	
	@PostMapping("/rating/{sid}/{uid}/{rate}")
	public void addRating(@PathVariable int sid, @PathVariable int uid, @PathVariable int rate)
	{
		ratingService.rating(sid, uid, rate);
	}

}
