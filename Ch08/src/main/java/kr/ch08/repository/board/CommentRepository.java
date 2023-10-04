package kr.ch08.repository.board;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.ch08.entity.board.ArticleEntity;
import kr.ch08.entity.board.CommentEntity;

public interface CommentRepository extends JpaRepository<CommentEntity, Integer>{

	
}
