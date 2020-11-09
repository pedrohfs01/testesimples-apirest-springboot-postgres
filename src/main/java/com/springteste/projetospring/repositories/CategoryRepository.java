package com.springteste.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springteste.projetospring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
}
