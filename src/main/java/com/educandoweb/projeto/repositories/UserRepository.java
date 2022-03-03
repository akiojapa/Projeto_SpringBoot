package com.educandoweb.projeto.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.projeto.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {




}
