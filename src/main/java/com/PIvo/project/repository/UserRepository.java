package com.PIvo.project.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.PIvo.project.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

}
