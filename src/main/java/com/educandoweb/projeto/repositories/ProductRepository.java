package com.educandoweb.projeto.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.projeto.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {




}
