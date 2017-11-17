package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.modal.RegUser;
import com.example.demo.repo.UserReg;

@Controller
public class LoginPageController {
	
	@RequestMapping("/login")
	public String Logi() {
		return "login";
	}

	public UserReg one;
	@Autowired
	public LoginPageController(UserReg one) {
		this.one = one;
	}
	
	@GetMapping("/reg")
	ModelAndView create(){
		ModelAndView m1=new ModelAndView();
		m1.setViewName("reg");
		m1.addObject("reguser",new RegUser());
		return m1;
	}
	
	
	@PostMapping("/register")
	public @ResponseBody String save(@ModelAttribute RegUser reguser) {
		one.save(reguser);
		return "<h1>Hi"+" "+reguser.getUsername() +" "+"details are saved</h1>";
	}
	
	
	
	@GetMapping("/show")
	public String show(Model model) {
		model.addAttribute("reguser", new RegUser());
		model.addAttribute("reguser", one.findAll());
		return "admin";
		
	}
	
	

	
}
