package com.example.spotify.service;


import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spotify.dto.SongDto;
import com.example.spotify.model.Artist;
import com.example.spotify.model.Song;
import com.example.spotify.repository.SongRepository;

@Service
public class SongService {
	
	@Autowired
	private SongRepository songRepository;
	
	@Autowired
	private ArtistService artistService;
	
	public Song songByID(int id)
	{
		return songRepository.findById(id);
	}
	
	public Song saveSong(Song song)
	{		
		Song newsong = new Song();
        newsong.setName(song.getName());
        newsong.setdR(song.getdR());
        newsong.setArtists(song.getArtists().stream().map(s -> {
                		Artist sng = s;
                			if(sng.getId() > 0)
                			{
                				sng = artistService.artistById(sng.getId());
                			}
                            sng.getSong().add(newsong);
                            return sng;
                        }).collect(Collectors.toList()));
        return songRepository.save(newsong);
	}

	@Transactional
	public List<SongDto> songList() {
		List<Song> songs = songRepository.songs();
		
		return songs.stream().map(this::mapFromEntityToDto).collect(Collectors.toList());
	}
	
	public SongDto mapFromEntityToDto(Song song)
	{
		SongDto songDto = new SongDto();
		songDto.setName(song.getName());
		songDto.setdR(song.getdR());
		songDto.setArtists(song.getArtists());
		
		return songDto;
	}

}
