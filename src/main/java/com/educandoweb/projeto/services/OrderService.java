package com.educandoweb.projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.projeto.entities.Order;
import com.educandoweb.projeto.entities.User;
import com.educandoweb.projeto.repositories.OrderRepository;
import com.educandoweb.projeto.repositories.UserRepository;



@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}

}
