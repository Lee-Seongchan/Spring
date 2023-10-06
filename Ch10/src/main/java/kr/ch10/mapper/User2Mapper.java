package kr.ch10.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.ch10.dto.User1DTO;
import kr.ch10.dto.User2DTO;

@Mapper
public interface User2Mapper {

	
	public int insertUser2(User2DTO dto);
	public User2DTO selectUser2(String id);
	public List<User2DTO> selectUser2s();
	public int updateUser2(User2DTO dto);
	public int deleteUser2(String id);
	
}
