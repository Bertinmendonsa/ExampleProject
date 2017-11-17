package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.modal.Loguser;
import com.example.demo.repo.LogindetailRepo;

public class LoginController {

	public LogindetailRepo login;
	@Autowired
	public LoginController(LogindetailRepo login) {
		this.login = login;
	}
	@PostMapping("/auth")
	public @ResponseBody String login(@ModelAttribute Loguser loguser) {
		login.save(loguser);
		return "<h2>Hi</h2>";
	}
}
