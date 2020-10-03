package com.example.repository;

import com.example.domain.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepo extends CrudRepository<Address,Integer> {
}
