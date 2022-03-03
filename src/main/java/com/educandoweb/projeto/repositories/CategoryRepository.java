package com.educandoweb.projeto.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.projeto.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {




}
