package com.example.spotify.dto;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;

import com.example.spotify.model.Artist;


public class SongDto {

	private int id;
	private String name;
	private Date dR;
	private Collection<Artist> artists = new ArrayList<>();
	private int rate;
	
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
	public Date getdR() {
		return dR;
	}
	public void setdR(Date dR) {
		this.dR = dR;
	}
	public Collection<Artist> getArtists() {
		return artists;
	}
	public void setArtists(Collection<Artist> artists) {
		this.artists = artists;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}	
}
