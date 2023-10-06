package kr.ch10.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ch10.entity.User2Entity;
import kr.ch10.repository.User2Repository;

@Service
public class User2Service {

	@Autowired
	private User2Repository repo;
	
	public void insertUser2(User2Entity user2) {
		repo.save(user2);
	}
	
	public User2Entity selectUser2(String id) {
		return repo.findById(id).get();
	}
	
	public List<User2Entity> selectUser2s() {
		return repo.findAll();
	}
	
	
	public void updateUser2(User2Entity user2) {
		repo.save(user2);
	}
	
	public void deleteUser2(String id) {
		repo.deleteById(id);
	}
	
}
