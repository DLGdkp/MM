package com.example.repository;

import com.example.domain.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepo extends CrudRepository<Event,Integer> {
}
