package com.nonon.jpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nonon.jpahibernate.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
