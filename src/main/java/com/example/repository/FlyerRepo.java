package com.example.repository;

import com.example.domain.Flyer;
import org.springframework.data.repository.CrudRepository;

public interface FlyerRepo extends CrudRepository<Flyer,Integer> {
}
