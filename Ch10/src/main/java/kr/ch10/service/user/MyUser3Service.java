package kr.ch10.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ch10.dto.User3DTO;
import kr.ch10.mapper.User3Mapper;

@Service
public class MyUser3Service {
	
	@Autowired
	private User3Mapper mapper;
	
	public int insertUser3(User3DTO dto) {
		return mapper.insertUser3(dto);
	};
	public User3DTO selectUser3(String id) {
		return mapper.selectUser3(id);
	};
	public List<User3DTO> selectUser3s(){
		return mapper.selectUser3s();
	};
	public int updateUser3(User3DTO dto) {
		return mapper.updateUser3(dto);
	};
	public int deleteUser3(String id) {
		return mapper.deleteUser3(id);
	};
}
