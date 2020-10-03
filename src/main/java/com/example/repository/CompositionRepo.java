package com.example.repository;

import com.example.domain.Composition;
import org.springframework.data.repository.CrudRepository;

public interface CompositionRepo  extends CrudRepository<Composition,Integer> {
}
