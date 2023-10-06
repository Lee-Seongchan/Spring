package kr.ch10.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ch10.entity.User4Entity;
import kr.ch10.repository.User4Repository;

@Service
public class User4Service {

	@Autowired
	private User4Repository repo;
	
	public void insertUser4(User4Entity user4) {
		repo.save(user4);
	}
	
	public User4Entity selectUser4(String name) {
		return repo.findById(name).get();
	}
	
	public List<User4Entity> selectUser4s() {
		return repo.findAll();
	}
	
	
	public void updateUser4(User4Entity user4) {
		repo.save(user4);
	}
	
	public void deleteUser4(String name) {
		repo.deleteById(name);
	}
	
}
