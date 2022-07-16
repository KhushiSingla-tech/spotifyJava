package com.example.spotify.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.spotify.model.Artist;



@Repository
public interface ArtistRepository extends JpaRepository<Artist, Integer>{
	
	Artist findById(int id);
	
	@Query(nativeQuery = true, value="select artist.id, artist.name, artist.dob, artist.bio, rating.rate from artist INNER JOIN rating ON artist.id = rating.u_id where (artist.id , rating.rate) IN (select u_id, avg(rate) as rrate from rating group by rate order by rrate DESC) ")
	public List<Artist> artists();
	

}
