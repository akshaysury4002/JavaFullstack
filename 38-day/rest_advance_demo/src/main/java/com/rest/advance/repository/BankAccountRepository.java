package com.rest.advance.repository;

import java.util.Collection;

import com.rest.advance.domain.BankAccount;


public interface BankAccountRepository {
    
    BankAccount save(BankAccount account);

    Collection<BankAccount> findAll();
}