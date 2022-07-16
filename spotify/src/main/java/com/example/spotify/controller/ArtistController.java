package com.example.spotify.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spotify.dto.ArtistDto;
import com.example.spotify.model.Artist;
import com.example.spotify.service.ArtistService;

@RestController
public class ArtistController {
	
	@Autowired
	private ArtistService artistService;
	
	@PostMapping("/addartist")
	public void add(@RequestBody Artist artist)
	{
		artistService.saveArtist(artist);
	}
	
	@GetMapping("/getartist")
	public List<ArtistDto> getArtist()
	{
		return artistService.artistList();
	}

}
