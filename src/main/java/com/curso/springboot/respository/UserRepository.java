package com.curso.springboot.respository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.curso.springboot.domain.User;

@Repository
public interface UserRepository  extends MongoRepository<User, String>{

	
}
