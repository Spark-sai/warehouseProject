package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.model.WhUserType;

public interface WhUserTypeRepository 
	extends JpaRepository<WhUserType, Integer> {

	@Query("SELECT COUNT(userEmail) FROM WhUserType WHERE userEmail=:email")
	Integer getWhUserEmailCount(String email);
}
