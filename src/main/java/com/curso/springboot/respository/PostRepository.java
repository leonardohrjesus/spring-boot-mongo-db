package com.curso.springboot.respository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.curso.springboot.domain.Post;

@Repository
public interface PostRepository  extends MongoRepository<Post, String>{

	
}
