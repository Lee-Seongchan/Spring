package kr.ch10.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ch10.entity.User1Entity;
import kr.ch10.repository.User1Repository;

@Service
public class User1Service {
	
	@Autowired
	private User1Repository repo;
	
	public void insertUser1(User1Entity user1) {
		repo.save(user1);
	}
	public User1Entity selectUser1(String id) {
		return repo.findById(id).get();
	}
	public List<User1Entity> selectUser1s() {
		return repo.findAll();
	}
	
	public void updateUser1(User1Entity user1) {
		repo.save(user1);
	}
	public void deleteUser1(String id) {
		repo.deleteById(id);
	}
}
