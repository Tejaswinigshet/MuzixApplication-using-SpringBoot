package com.stackroute.muzixservices.repository;
import java.util.List;
import com.stackroute.muzixservices.domain.Track;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TrackRepository extends CrudRepository<Track, Integer> {

    @Query(value = "select * from track where track_name=?1", nativeQuery = true)
    public List<Track> getTrackByName(String trackName);
}