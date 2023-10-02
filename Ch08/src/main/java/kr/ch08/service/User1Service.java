package kr.ch08.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.Entity;
import kr.ch08.dto.User1DTO;
import kr.ch08.entity.User1Entity;
import kr.ch08.repository.User1Repository;

@Service
public class User1Service {

	@Autowired
	private User1Repository repo;
	
	public void insertUser1(User1DTO dto) {
		//DTO를 Entity 변환
		User1Entity entity  = dto.toEntity();
		
		repo.save(entity);
	}
	
	public User1DTO selecttUser1(String uid) {
		
		Optional<User1Entity> result = repo.findById(uid);
		
		//Entity를 DTO로 변환
		User1DTO dto = result.get().toDTO();
		
		return dto;
	}
	
	public List<User1DTO> selecttUser1s() {
		
		//list<User1Entity>를 list<DTO>로 변환
		List<User1DTO> list = repo.findAll()
								.stream()
								.map(enrity -> User1DTO.builder()
										.uid(enrity.getUid())
										.name(enrity.getName())
										.hp(enrity.getHp())
										.age(enrity.getAge())
										.build())
								.collect(Collectors.toList());
							
		
		return list;
	}
	
	public void updateUser1(User1DTO dto) {
		//DTO를 Entity 변환
		User1Entity entity  = dto.toEntity();
		repo.save(entity);
	}
	
	public void deleteUser1(String uid) {
		repo.deleteById(uid);
	}
	
	
}
