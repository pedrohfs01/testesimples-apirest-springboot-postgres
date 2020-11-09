package com.springteste.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springteste.projetospring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
}
