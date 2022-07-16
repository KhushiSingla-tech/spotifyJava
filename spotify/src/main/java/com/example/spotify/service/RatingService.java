package com.example.spotify.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spotify.model.Rating;
import com.example.spotify.repository.RatingRepository;

@Service
public class RatingService {
	
	@Autowired
	RatingRepository ratingRepository;
	
	public void rating(int sid, int uid, int rate)
	{
		Rating rating = new Rating();
		rating.setRating(rate);
		rating.setS_id(sid);
		rating.setU_id(uid);
		
		ratingRepository.save(rating);
	}

}
