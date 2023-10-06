package kr.ch10.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.ch10.entity.User1Entity;

@Repository
public interface User1Repository extends JpaRepository<User1Entity, String>{
	
	
}
