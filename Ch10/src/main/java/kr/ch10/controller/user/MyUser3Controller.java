package kr.ch10.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.ch10.dto.User3DTO;
import kr.ch10.service.user.MyUser3Service;

@Controller
public class MyUser3Controller {
	
	@Autowired
	private MyUser3Service service;
	
	@GetMapping("/user3/list")
	public String list(Model model) {
		
		List<User3DTO> users = service.selectUser3s();
		model.addAttribute("users",users);
		return "/user3/list";
	}
	
	
	@GetMapping("/user3/register")
	public String register() {
		return "/user3/register";
	}
	
	@PostMapping("/user3/register")
	public String register(User3DTO dto) {
		
		service.insertUser3(dto);
		
		return "redirect:/user3/list";
	}
	
	
	@GetMapping("/user3/modify")
	public String modify(Model model, String id) {
		
		User3DTO user = service.selectUser3(id);
		model.addAttribute("user",user);
		return "/user3/modify";
	}
	
	@PostMapping("/user3/modify")
	public String modify(User3DTO dto) {
		
		service.updateUser3(dto);
		
		return "redirect:/user3/list";
	}
	
	
	@GetMapping("/user3/delete")
	public String delete(String id) {
		service.deleteUser3(id);
		return "redirect:/user3/list";
	}
	
}
