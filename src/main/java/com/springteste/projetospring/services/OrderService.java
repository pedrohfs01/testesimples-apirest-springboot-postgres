package com.springteste.projetospring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springteste.projetospring.entities.Order;
import com.springteste.projetospring.repositories.OrderRepository;


@Service
public class OrderService {
	
	
	@Autowired
	OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
