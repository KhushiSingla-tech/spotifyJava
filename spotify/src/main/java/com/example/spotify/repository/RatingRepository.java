package com.example.spotify.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spotify.model.Rating;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Integer> {

}
