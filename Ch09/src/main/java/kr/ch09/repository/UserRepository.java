package kr.ch09.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.ch09.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String>{
	
	public UserEntity findUserEntityByUidAndPass(String uid, String pass);
	
	
}
