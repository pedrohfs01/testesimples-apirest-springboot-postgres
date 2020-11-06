package com.springteste.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springteste.projetospring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
