package com.example.spotify.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spotify.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

	boolean findByEmail(String email);

}
