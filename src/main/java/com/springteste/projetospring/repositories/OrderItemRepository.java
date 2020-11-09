package com.springteste.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springteste.projetospring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
}
