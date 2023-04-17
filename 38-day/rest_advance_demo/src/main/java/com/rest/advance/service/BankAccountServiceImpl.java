package com.rest.advance.service;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.rest.advance.dto.BankAccountDto;
import com.rest.advance.repository.BankAccountRepository;
import com.rest.advance.util.DmDtConverter;

import lombok.AllArgsConstructor;

@AllArgsConstructor // to enable constructor injection
@Service
public class BankAccountServiceImpl implements BankAccountService{

    private final BankAccountRepository repository;
    private final DmDtConverter converter;

    @Override
    public Integer createNewAccount(BankAccountDto dto) {
        repository.save(converter.toDomain(dto));
        return 1;
    }

    @Override
    public Collection<BankAccountDto> listAllAccounts() {

        return repository.findAll()
                            .stream()
                            // .map(account -> converter.toDto(account))
                           .map(converter::toDto)
                           .collect(Collectors.toList());
    }
}
