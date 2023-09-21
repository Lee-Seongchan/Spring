package ch05.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch05.dao.User1DAO;
import ch05.dto.User1DTO;

@Service
public class User1Service {

	@Autowired
	private User1DAO dao;
	
	public void insertUser1(User1DTO dto) {
		dao.insertUser1(dto);
	}
	
	public User1DTO selectUser1(String uid) {
		return dao.selectUser1(uid);
	}
	
	public List<User1DTO> selectUser1s() {
		return dao.selectUser1s();
	}
	
	public void updateUser1(User1DTO dto) {
		dao.updateUser1(dto);
	}
	
	public void deleteUser1(String uid) {
		dao.deleteUser1(uid);
	}
}
