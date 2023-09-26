package kr.ch07.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ch07.dto.User6DTO;
import kr.ch07.mapper.User6Mapper;

@Service
public class User6Service {

	@Autowired
	private User6Mapper mapper;
	
	public void insertUser6(User6DTO dto) {
		mapper.insertUser6(dto);
		
	}
	
	public User6DTO selectUser6(String uid) {
		return mapper.selectUser6(uid);
	}
	
	public List<User6DTO> selectUser6s(){
		return mapper.selectUser6s();
	}
	
	public void updateUser6(User6DTO dto) {
		mapper.updateUser6(dto);
	}
	
	public void deleteUser6(String uid) {
		mapper.deleteUser6(uid);
	}
	
	
	
	
}
