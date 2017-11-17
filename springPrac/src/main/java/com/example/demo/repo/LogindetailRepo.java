package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modal.Loguser;

public interface LogindetailRepo extends  JpaRepository<Loguser,Integer> {
	
}
