package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.stereotype.Repository;

import com.example.demo.beans.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	 
	User findByUsername(String username);

}
