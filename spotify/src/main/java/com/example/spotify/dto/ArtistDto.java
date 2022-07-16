package com.example.spotify.dto;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;

import com.example.spotify.model.Song;

public class ArtistDto {
	
	private int id;
	private String name;
	private Date DOB;
	private String bio;
	private Collection<Song> song = new ArrayList<>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public Collection<Song> getSong() {
		return song;
	}
	public void setSong(Collection<Song> song) {
		this.song = song;
	}
}
