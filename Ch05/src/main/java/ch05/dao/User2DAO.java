package ch05.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import ch05.dto.User1DTO;
import ch05.dto.User1RowMapper;
import ch05.dto.User2DTO;
import ch05.dto.User2RowMapper;

@Repository
public class User2DAO {

	@Autowired
	private JdbcTemplate jdbc;
	
	public void insertUser2(User2DTO dto) {
		
		String sql = "INSERT INTO `user2` VALUES (?,?,?,?)";
		
		Object[] params = {
						dto.getUid(),
						dto.getName(),
						dto.getHp(),
						dto.getAge()
					};
		
		jdbc.update(sql, params);
		
	}
	
	public User2DTO selectUser2(String uid) {
		String sql = "SELECT * FROM `user2` WHERE `uid` = ? ";
		
		User2DTO user = jdbc.queryForObject(sql, new User2RowMapper(), uid);
			
		return user;
	}
	
	public List<User2DTO> selectUser2s() {
		String sql = "SELECT * FROM `user2`";
		List<User2DTO> users = jdbc.query(sql, new User2RowMapper());
		
		return users;
	}
	
	public void updateUser2(User2DTO dto) {
		String sql = "UPDATE `user2` SET `name` = ? , `hp` = ? , `age` = ? WHERE `uid` = ? "; 
		Object[] params = {
				dto.getName(),
				dto.getHp(),
				dto.getAge(),
				dto.getUid(),
			};
		
		jdbc.update(sql,params);
	}
	
	public void deleteUser2(String uid) {
		String sql = "DELETE FROM `user2` WHERE `uid` = ? ";
		
		jdbc.update(sql, uid);
	}
}
