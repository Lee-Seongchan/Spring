package kr.ch08.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import kr.ch08.dto.User1DTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "user1")
public class User1Entity {
	
	@Id
	private String uid;
	private String name;
	private String hp;
	private int age;
	
	
	// DTO 변환 메서드
		public User1DTO toDTO() {
			return User1DTO.builder()
					.uid(uid)
					.name(name)
					.hp(hp)
					.age(age)
					.build();
		}
	
	
}
