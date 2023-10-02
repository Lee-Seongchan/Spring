package kr.ch08.dto;

import jakarta.persistence.Id;
import kr.ch08.entity.User1Entity;
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
public class User1DTO {

	@Id
	private String uid;
	private String name;
	private String hp;
	private int age;
	
	
	// Entity 변환 메서드
	public User1Entity toEntity() {
		return User1Entity.builder()
				.uid(uid)
				.name(name)
				.hp(hp)
				.age(age)
				.build();
	}
	
}
