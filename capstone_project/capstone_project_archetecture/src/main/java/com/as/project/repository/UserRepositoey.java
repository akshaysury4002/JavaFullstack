package com.as.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.as.project.domain.User;

public interface UserRepositoey extends CrudRepository<User,Long> {
    
}
