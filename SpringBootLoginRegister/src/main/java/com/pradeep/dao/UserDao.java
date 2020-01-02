package com.pradeep.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pradeep.model.Register;

public interface UserDao extends JpaRepository<Register, Long> {
	
	Register findByEmail(String email);

}
