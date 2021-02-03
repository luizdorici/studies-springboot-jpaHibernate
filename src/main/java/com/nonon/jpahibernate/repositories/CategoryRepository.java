package com.nonon.jpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nonon.jpahibernate.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
