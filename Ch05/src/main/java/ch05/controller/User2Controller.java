package ch05.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ch05.dto.User2DTO;
import ch05.service.User2Service;

@Controller
public class User2Controller {
	
	@Autowired
	private User2Service service;
	
	
	@GetMapping("/user2/list")
	public String list(Model model) {
		
	List<User2DTO> users = service.selectUser2s();
		model.addAttribute("users",users);
		return "/user2/list";
	}
	
	
	@GetMapping("/user2/register")
	public String register(Model model) {
		
		return "/user2/register";
	}
	
	@PostMapping("/user2/register")
	public String register(User2DTO dto) {
		
		service.insertUser2(dto);
		
		return "redirect:/user2/list";
	}
	
	@GetMapping("/user2/modify")
	public String modify(String uid, Model model) {
		User2DTO user = service.selectUser2(uid);
		model.addAttribute(user);
		
		return "/user2/modify";
	}
	
	@PostMapping("/user2/modify")
	public String modify(User2DTO dto) {
		
		service.updateUser2(dto);
		
		return "redirect:/user2/list";
	}
	
	@GetMapping("/user2/delete")
	public String delete(String uid) {
		
		service.deleteUser2(uid);
		
		return "redirect:/user2/list";
	}
	
	
}
