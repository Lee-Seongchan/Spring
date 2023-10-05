package kr.ch09.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping(value = {",", "/index"})
	public String index() {
		return "/index";
		
	}
	
	@GetMapping("/admin/index")
	public String adminIndex() {
		return "/admin/index";
	}
	
	@GetMapping("/manager/index")
	public String managerIndex() {
		return "/manager/index";
	}
	
}
