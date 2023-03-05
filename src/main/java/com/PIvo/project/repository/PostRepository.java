package com.PIvo.project.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.PIvo.project.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {

	List<Post>findByTitleContainingIgnoreCase(String text);
}
