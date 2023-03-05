package com.PIvo.project.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.PIvo.project.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {

}
