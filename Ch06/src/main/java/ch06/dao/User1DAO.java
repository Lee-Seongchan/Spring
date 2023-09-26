package ch06.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ch06.dto.User1DTO;

@Repository
public class User1DAO {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertUser1(User1DTO dto) {
		mybatis.insert("user1.insertUser1", dto);
	}
	
	public User1DTO selectUser1(String uid) {
		return mybatis.selectOne("user1.selectUser1", uid);
	}
	
	public List<User1DTO> selectUser1s(){
		
		return mybatis.selectList("user1.selectUser1s");
	}
	
	public void updateUser1(User1DTO dto) {
		mybatis.update("user1.updateUser1", dto);
	}
	
	public void deleteUser1(String uid) {
		mybatis.delete("user1.deleteUser1", uid);
	}
	
	
	
	
}
