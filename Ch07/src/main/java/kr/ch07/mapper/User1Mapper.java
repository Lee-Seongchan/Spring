package kr.ch07.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.ch07.dto.User1DTO;

@Mapper
public interface User1Mapper {
	public void insertUser1(User1DTO dto);
	public User1DTO selectUser1(String uid) ;
	public List<User1DTO> selectUser1s() ;
	public void updateUser1(User1DTO dto);
	public void deleteUser1(String uid);
}
