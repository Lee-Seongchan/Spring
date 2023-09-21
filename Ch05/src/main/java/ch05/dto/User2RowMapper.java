package ch05.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class User2RowMapper implements RowMapper<User2DTO>{

	@Override
	public User2DTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		User2DTO dto = new User2DTO();
		dto.setUid(rs.getString(1));
		dto.setName(rs.getString(2));
		dto.setHp(rs.getString(3));
		dto.setAge(rs.getInt(4));
		
		return dto;
	}
}
