package com.rest.advance.service;

import java.util.Collection;

import com.rest.advance.dto.BankAccountDto;


public interface BankAccountService {
 
    Integer createNewAccount(BankAccountDto account);

    Collection<BankAccountDto> listAllAccounts();
}
