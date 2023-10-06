package kr.ch10.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.ch10.dto.User1DTO;

@Mapper
public interface User1Mapper {

	
	
	public int insertUser1(User1DTO dto);
	public User1DTO selectUser1(String id);
	public List<User1DTO> selectUser1s();
	public int updateUser1(User1DTO dto);
	public int deleteUser1(String id);
	
}
