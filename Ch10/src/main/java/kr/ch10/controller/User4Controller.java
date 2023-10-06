package kr.ch10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.ch10.entity.User1Entity;
import kr.ch10.entity.User2Entity;
import kr.ch10.entity.User4Entity;
import kr.ch10.service.User2Service;
import kr.ch10.service.User4Service;

//일반 컨트롤러와 responseBody가 합쳐진것
@RestController
public class User4Controller {

	@Autowired
	private User4Service service;
	
	@GetMapping("/user4")
	public List<User4Entity> list(){
		List<User4Entity> user4s = service.selectUser4s();
		return user4s;
	}
	
	@GetMapping("/user4/{name}")
	public User4Entity user4(@PathVariable("name") String name) {
		return service.selectUser4(name); 
	}
	
	@PostMapping("/user4")
	public void register(User4Entity user4) {
		service.insertUser4(user4);
	}
	
	@PutMapping("/user4")
	public void modify(User4Entity user4) {
		service.updateUser4(user4);
	}
	
	@DeleteMapping("/user4/{name}")
	public void delete(@PathVariable("name") String name) {
		service.deleteUser4(name);
	}
	
}
