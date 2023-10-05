package kr.ch09.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.ch09.entity.UserEntity;
import kr.ch09.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/user/login")
	public String login() {
		return "/user/login";
	}
	
	@GetMapping("/user/register")
	public String register() {
		return "/user/register";
	}
	
	@PostMapping("/user/register")
	public String register(UserEntity user) {
		service.insertUser(user);
		return "redirect:/user/login";
	}
	
	@GetMapping("/user/success")
	public String success() {
		return "/user/success";
	}
	
	
}
