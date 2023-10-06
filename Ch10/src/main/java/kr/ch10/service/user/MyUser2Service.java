package kr.ch10.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ch10.dto.User2DTO;
import kr.ch10.mapper.User2Mapper;

@Service
public class MyUser2Service {
	
	@Autowired
	private User2Mapper mapper;
	
	public int insertUser2(User2DTO dto) {
		return mapper.insertUser2(dto);
	};
	public User2DTO selectUser2(String id) {
		return mapper.selectUser2(id);
	};
	public List<User2DTO> selectUser2s(){
		return mapper.selectUser2s();
	};
	public int updateUser2(User2DTO dto) {
		return mapper.updateUser2(dto);
	};
	public int deleteUser2(String id) {
		return mapper.deleteUser2(id);
	};
}
