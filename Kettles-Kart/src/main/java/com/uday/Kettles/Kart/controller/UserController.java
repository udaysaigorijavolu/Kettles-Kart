package com.uday.Kettles.Kart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uday.Kettles.Kart.model.User;
import com.uday.Kettles.Kart.repository.UserRepo;

@Controller
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserRepo repository;
	
	@GetMapping("/req1")
	public String home()
	{
		return "auth";
	}
	
	@PostMapping("/req2")
	public String register(@ModelAttribute User user)
	{
		repository.save(user);
		return "auth1";
	}

}
