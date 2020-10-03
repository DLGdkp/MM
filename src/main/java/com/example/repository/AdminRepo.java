package com.example.repository;

import com.example.domain.Admin;
import org.springframework.data.repository.CrudRepository;

public interface AdminRepo  extends CrudRepository<Admin,Integer> {
}
