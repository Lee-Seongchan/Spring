package kr.ch10.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.ch10.dto.User6DTO;


@Mapper
public interface User6Mapper {

	
	public int insertUser6(User6DTO dto);
	public User6DTO selectUser6(int seq);
	public List<User6DTO> selectUser6s();
	public int updateUser6(User6DTO dto);
	public int deleteUser6(int seq);
	
}
