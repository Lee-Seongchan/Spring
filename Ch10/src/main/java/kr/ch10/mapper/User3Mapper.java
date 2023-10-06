package kr.ch10.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.ch10.dto.User3DTO;


@Mapper
public interface User3Mapper {

	
	public int insertUser3(User3DTO dto);
	public User3DTO selectUser3(String id);
	public List<User3DTO> selectUser3s();
	public int updateUser3(User3DTO dto);
	public int deleteUser3(String id);
	
}
