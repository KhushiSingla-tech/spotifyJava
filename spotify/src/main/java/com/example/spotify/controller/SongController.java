package com.example.spotify.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spotify.dto.SongDto;
import com.example.spotify.model.Song;
import com.example.spotify.service.SongService;
import com.fasterxml.jackson.annotation.JsonIgnore;

@RestController
public class SongController {
	
	@Autowired
	private SongService songService;
	
	@PostMapping("/add")
	public void addSongs(@RequestBody Song song)
	{
		songService.saveSong(song);
	}
	
	@GetMapping("/getsong")
	public List<SongDto> getSongs()
	{
		return songService.songList();
	}
	
}
