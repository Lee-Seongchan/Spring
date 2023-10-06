package kr.ch10.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User1DTO {
	private String id;
	private String name;
	private String hp;
	private int age;
}
