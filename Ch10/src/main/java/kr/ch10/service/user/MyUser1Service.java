package kr.ch10.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ch10.dto.User1DTO;
import kr.ch10.mapper.User1Mapper;

@Service
public class MyUser1Service {
	
	@Autowired
	private User1Mapper mapper;
	
	public int insertUser1(User1DTO dto) {
		return mapper.insertUser1(dto);
	};
	public User1DTO selectUser1(String id) {
		return mapper.selectUser1(id);
	};
	public List<User1DTO> selectUser1s(){
		return mapper.selectUser1s();
	};
	public int updateUser1(User1DTO dto) {
		return mapper.updateUser1(dto);
	};
	public int deleteUser1(String id) {
		return mapper.deleteUser1(id);
	};
}
