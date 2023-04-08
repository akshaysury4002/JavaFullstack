package com.as.crud.repsitory;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.as.crud.domain.Item;

@Repository
public interface ItemRepository extends MongoRepository<Item, Long> {
    
}