
package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modal.RegUser;

public interface UserReg extends JpaRepository<RegUser,Integer> {

}
