package com.curso.springboot.config;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.curso.springboot.domain.Post;
import com.curso.springboot.domain.User;
import com.curso.springboot.dto.AuthorDTO;
import com.curso.springboot.respository.PostRepository;
import com.curso.springboot.respository.UserRepository;

@Configuration
public class Instantiation implements  CommandLineRunner{
	
	@Autowired 
	UserRepository userReposiroty;
	
	@Autowired 
	PostRepository postReposiroty;


	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		postReposiroty.deleteAll();
		userReposiroty.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		userReposiroty.saveAll(Arrays.asList(maria, alex, bob));
		
		Post post1 = new Post(null, sdf.parse("21/03/2018"), "Partiu viagem",  "Vou viajar para São Paulo. Abraços!",new AuthorDTO( maria));	
		Post post2 = new Post(null, sdf.parse("23/03/2018"), "Bom dia",  "Acorde Feliz hoje!",new AuthorDTO( maria));
		
		postReposiroty.saveAll(Arrays.asList(post1,post2));
	}

}
