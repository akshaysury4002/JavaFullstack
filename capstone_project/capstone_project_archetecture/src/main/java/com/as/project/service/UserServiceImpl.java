package com.as.project.service;

import org.springframework.stereotype.Service;

import com.as.project.domain.User;
import com.as.project.dto.UserDto;
import com.as.project.repository.UserRepositoey;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService{
    
    private final UserRepositoey repositoey;

    @Override
    public Integer createNewUser(UserDto user)
    {

        User
        

        repositoey.save(null)
     
    }
}
