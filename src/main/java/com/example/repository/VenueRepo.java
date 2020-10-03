package com.example.repository;

import com.example.domain.Venue;
import org.springframework.data.repository.CrudRepository;

public interface VenueRepo extends CrudRepository<Venue,Integer> {
}
