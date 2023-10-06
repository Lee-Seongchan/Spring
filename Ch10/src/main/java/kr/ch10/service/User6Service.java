package kr.ch10.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ch10.entity.User4Entity;
import kr.ch10.entity.User6Entity;
import kr.ch10.repository.User4Repository;
import kr.ch10.repository.User6Repository;

@Service
public class User6Service {

	@Autowired
	private User6Repository repo;
	
	public void insertUser6(User6Entity user6) {
		repo.save(user6);
	}
	
	public User6Entity selectUser6(int seq) {
		return repo.findById(seq).get();
	}
	
	public List<User6Entity> selectUser6s() {
		return repo.findAll();
	}
	
	
	public void updateUser6(User6Entity user6) {
		repo.save(user6);
	}
	
	public void deleteUser6(int seq) {
		repo.deleteById(seq);
	}
	
}
