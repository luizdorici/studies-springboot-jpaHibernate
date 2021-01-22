package com.nonon.jpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nonon.jpahibernate.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
