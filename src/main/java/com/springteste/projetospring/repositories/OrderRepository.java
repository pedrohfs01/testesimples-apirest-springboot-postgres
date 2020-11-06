package com.springteste.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springteste.projetospring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
