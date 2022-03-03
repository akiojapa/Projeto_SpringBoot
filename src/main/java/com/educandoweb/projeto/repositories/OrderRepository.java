package com.educandoweb.projeto.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.projeto.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {




}
