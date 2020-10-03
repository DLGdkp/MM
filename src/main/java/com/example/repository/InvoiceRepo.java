package com.example.repository;

import com.example.domain.Invoice;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceRepo extends CrudRepository<Invoice,Integer> {
}
