package ch05.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ch05.dto.User1DTO;
import ch05.service.User1Service;

@Controller
public class User1Controller {
	
	@Autowired
	private User1Service service;
	
	@GetMapping("/user1/register")
	public String register() {
		return "/user1/register";
	}
	
	@PostMapping("/user1/register")
	public String register(User1DTO dto) {
		service.insertUser1(dto);
		return "redirect:/user1/list";
	}
	
	
	@GetMapping("/user1/list")
	public String list(Model model) {
		List<User1DTO> users = service.selectUser1s();
		model.addAttribute("users",users);
		
		return "/user1/list";
	}
	
	@GetMapping("/user1/modify")
	public String modify(String uid, Model model) {
		
		User1DTO user = service.selectUser1(uid);
		model.addAttribute(user); //key값을 지정안하면 타입의 소문자가 키값이 됨
		
		
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
