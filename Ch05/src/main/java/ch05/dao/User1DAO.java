package ch05.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ch05.dto.User1DTO;
import ch05.dto.User1RowMapper;

@Repository
public class User1DAO {

	@Autowired
	private JdbcTemplate jdbc;
	
	public void insertUser1(User1DTO dto) {
		
		String sql = "INSERT INTO `user1` VALUES (?,?,?,?)";
		
		Object[] params = {
						dto.getUid(),
						dto.getName(),
						dto.getHp(),
						dto.getAge()
						};
		
		jdbc.update(sql,params);
		
	}
	
	public User1DTO selectUser1(String uid) {
		String sql = "SELECT * FROM `user1` WHERE `uid` = ? ";
		User1DTO dto = jdbc.queryForObject(sql, new User1RowMapper(), uid);
		return dto;
	}
	
	public List<User1DTO> selectUser1s() {
		String sql = "SELECT * FROM `user1` ";
		List<User1DTO> users = jdbc.query(sql, new User1RowMapper());
		
		return users;
	}
	
	public void updateUser1(User1DTO dto) {
		String sql = "UPDATE `user1` SET `name` = ? , `hp` = ? , `age` = ? WHERE `uid` = ? "; 
		Object[] params = {
						dto.getName(),
						dto.getHp(),
						dto.getAge(),
						dto.getUid(),
					};
		jdbc.update(sql,params);
	}
	
	public void deleteUser1(String uid) {
		String sql = "DELETE FROM `user1` WHERE `uid` = ? ";
		
		jdbc.update(sql, uid);
	}
}
