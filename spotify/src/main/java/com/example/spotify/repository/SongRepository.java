package com.example.spotify.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.spotify.model.Artist;
import com.example.spotify.model.Song;

@Repository
public interface SongRepository extends JpaRepository<Song, Integer> {
	
	public Song findById(int id);
	
	@Query(nativeQuery = true, value="select song.id, song.dr, song.name, rating.rate from song INNER JOIN rating ON song.id = rating.s_id where (song.id , rating.rate) IN (select s_id, avg(rate) as rrate from rating group by rate order by rrate DESC) ")
	public List<Song> songs();
	

}
