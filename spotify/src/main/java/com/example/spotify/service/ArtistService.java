package com.example.spotify.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spotify.dto.ArtistDto;
import com.example.spotify.dto.SongDto;
import com.example.spotify.model.Artist;
import com.example.spotify.model.Song;
import com.example.spotify.repository.ArtistRepository;

@Service
public class ArtistService {
	
	@Autowired
	private ArtistRepository artistRepository;
	
	public Artist saveArtist(Artist artist)
	{
        return artistRepository.save(artist);
	}
	
	public Artist artistById(int id)
	{
		return artistRepository.findById(id);
	}
	
	@Transactional
	public List<ArtistDto> artistList() {
		List<Artist> artist = artistRepository.artists();
		
		return artist.stream().map(this::mapFromEntityToDto).collect(Collectors.toList());
	}
	
	public ArtistDto mapFromEntityToDto(Artist artist)
	{
		ArtistDto artistDto = new ArtistDto();
		artistDto.setBio(artist.getBio());
		artistDto.setDOB(artist.getDOB());
		artistDto.setName(artist.getName());
		artistDto.setId(artist.getId());
		artistDto.setSong(artist.getSong());
		
		return artistDto;
	}


}
