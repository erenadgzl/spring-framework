package com.springprojects.repository;

/* 
Eren created on 18.07.2020 
*/

import com.springprojects.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
