package com.curso.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.springboot.domain.User;
import com.curso.springboot.respository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public  List<User> findAll() {
		return repo.findAll();
		
	}
}
