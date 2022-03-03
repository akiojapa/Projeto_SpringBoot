package com.educandoweb.projeto.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.projeto.entities.Category;
import com.educandoweb.projeto.entities.Order;
import com.educandoweb.projeto.entities.User;
import com.educandoweb.projeto.entities.enums.OrderStatus;
import com.educandoweb.projeto.repositories.CategoryRepository;
import com.educandoweb.projeto.repositories.OrderRepository;
import com.educandoweb.projeto.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Maikola Snow", "maikedasmeninas@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Akio Andrei", "akio@gmail.com", "988471531", "123456");
		
		Order o1 = new Order(null, Instant.parse("2022-03-01T19:53:07Z"),OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2022-03-02T03:42:10Z"),OrderStatus.WAITTING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2022-03-03T15:21:22Z"),OrderStatus.DELIVERED, u1);
		
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
	}

}
