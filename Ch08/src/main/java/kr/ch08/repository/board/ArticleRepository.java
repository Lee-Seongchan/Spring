package kr.ch08.repository.board;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.ch08.entity.board.ArticleEntity;

public interface ArticleRepository extends JpaRepository<ArticleEntity, Integer>{

	
}
