package com.as.data.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.as.data.domain.Invoice;

public interface InvoiceRepository extends CrudRepository<Invoice, Long> {
    
}