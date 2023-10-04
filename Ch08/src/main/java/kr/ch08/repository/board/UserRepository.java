package kr.ch08.repository.board;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.ch08.entity.board.ArticleEntity;
import kr.ch08.entity.board.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String>{

	
}
