package kr.ch08.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.ch08.dto.User1DTO;
import kr.ch08.service.User1Service;

@Controller
public class User1Controller {
	
	@Autowired
	private User1Service service;
	
	@GetMapping("/user1/list")
	public String list(Model model) {
		
		List<User1DTO> users = service.selecttUser1s();
		model.addAttribute("users", users);
		
		return "/user1/list";
	}
	
	
	@GetMapping("/user1/register")
	public String register() {
		return "/user1/register";
	}
	
	@PostMapping("/user1/register")
	public String register(User1DTO dto) {
		
		service.insertUser1(dto);
		
		return "redirect:/user1/register";
	}
	
	@GetMapping("/user1/modify")
	public String modify(String uid, Model model) {
		
		User1DTO user = service.selecttUser1(uid);
		model.addAttribute("user", user);
		
		return "/user1/modify";
	}
	
	@PostMapping("/user1/modify")
	public String modify(User1DTO dto) {
		
		service.updateUser1(dto);
		
		return "redirect:/user1/list";
	}
	
	
	@GetMapping("/user1/delete")
	public String delete(String uid) {
		service.deleteUser1(uid);
		
		return "redirect:/user1/list"; 
	}
}
