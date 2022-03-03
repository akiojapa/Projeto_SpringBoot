package com.educandoweb.projeto.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.projeto.entities.User;
import com.educandoweb.projeto.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConifg implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Maikola Snow", "maikedasmeninas@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Akio Andrei", "akio@gmail.com", "988471531", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}

}
