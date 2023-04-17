package com.as.data.domain.repository;


import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.as.data.domain.Invoice;

public interface InvoiceCustomizedRepository extends CrudRepository<Invoice, Long> {
    
    @Override
    List<Invoice> findAll();

    // find all clients whoes name is abc
    // select * from invoice where client = name
    List<Invoice> findByClient(String name);

    // find all invoices who are having amount > 780
    List<Invoice> findByAmtGreaterThan(Double amt);

    // find all invoices which are generated between 2023-04-02 to 2023-04-10
    // select * from invoice where inv_dt between 
    List<Invoice> findByInvDtBetween(LocalDate st, LocalDate ed);

    List<Invoice> findByInvDtBetweenAndAmtGreaterThan(LocalDate st, LocalDate ed, Double amt);
}