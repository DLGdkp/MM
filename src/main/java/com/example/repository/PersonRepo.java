package com.example.repository;

import com.example.domain.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepo extends CrudRepository<Person,Integer> {
}
