package com.example.repository;

import com.example.domain.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepo  extends CrudRepository<Company,Integer> {
}
