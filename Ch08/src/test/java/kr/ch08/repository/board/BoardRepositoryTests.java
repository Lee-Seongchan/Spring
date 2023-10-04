package kr.ch08.repository.board;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import jakarta.transaction.Transactional;
import kr.ch08.entity.board.ArticleEntity;
import kr.ch08.entity.board.CommentEntity;
import kr.ch08.entity.board.FileEntity;
import kr.ch08.entity.board.UserEntity;

@SpringBootTest
public class BoardRepositoryTests {

	@Autowired private ArticleRepository articleRepo;
	@Autowired private CommentRepository commentRepo;
	@Autowired private FileRepository fileRepo;
	@Autowired private UserRepository userRepo;
	

	@DisplayName("insertUser 테스트....")
	public void insertUser() {
		
		UserEntity user = UserEntity.builder()
							.uid("a101")
							.name("김유신")
							.hp("010-1234-1001")
							.build();
		
		userRepo.save(user);
		
	}
	
	
	@DisplayName("insertArticle 테스트....")
	public void insertArticle() {
		
		UserEntity user = UserEntity.builder()
								.uid("a101")
								.build();
		
		ArticleEntity article = ArticleEntity.builder()
									.title("제목8입니다")
									.content("내용8입니다.")
									.user(user)
									.build();
		
		articleRepo.save(article);
	}
	
	
	@DisplayName("insertComment 테스트....")
	public void insertComment() {
		UserEntity user = UserEntity.builder()
								.uid("a101")
								.build();

		ArticleEntity article = ArticleEntity.builder()
							.no(15)
							.build();
		
		
		CommentEntity comment = CommentEntity.builder()
							.content("댓글2 입니다.")
							.user(user)
							.article(article)
							.build();

		
		commentRepo.save(comment);
	}
	
	
	
	@DisplayName("insertFile 테스트....")
	public void insertFile() {
		
		ArticleEntity article = ArticleEntity.builder()
									.no(15)
									.build();
		
		FileEntity file = FileEntity.builder()
							.oName("테스트1.txt")
							.sName("asdasdasdsa.txt")
							.article(article)
							.build();
		
		fileRepo.save(file);
	}
	

	@Transactional
	@DisplayName("selectArticles 테스트....")
	public void selectArticles() {
		
		List<ArticleEntity> articles = articleRepo.findAll();
		System.out.println(articles);
		
		for(ArticleEntity article : articles) {
			//System.out.println(article);
		}
		
	}
	
	
	/*
	 * 양방향으로 처리되는 엔터티 관계에서 다수의 SELECT를 수행하기 때문에
	 * 단일 SELECT 처리 후 종료되는 특징으로 접속이 종료 됨.(no session) 
	 * 따라서 그 다음 SELECT 실행에서 no session 에러가 발생
	 * 이런 경우 @Transactional 선언으로 트랜잭션 처리를 해줘야 됨
	 */
	
	/*
	 * 메서드 체이닝(Method Chaining)은 객체 지향 프로그래밍에서 사용되는 기법 중 하나로, 객체의 메서드를 연속적으로 호출하여 한 줄로 여러 작업을 수행하는 패턴
	 * 자바에서 사용되는 Optional 클래스를 이용하여 데이터를 처리하는 방법 중 하나입니다. 
	 * 이것은 주로 데이터가 없을 수 있는 경우에 사용되며, 
	 * 데이터의 존재 여부를 나타내고 해당 데이터에 접근할 때 null 체크를 피하기 위해 도입된 개념
	 * 메서드 체이닝: Optional은 다양한 메서드를 제공하여 데이터를 다룰 때 유용하게 사용 
	 * 예를 들어 map, filter, orElse, ifPresent 등의 메서드를 사용하여 데이터 처리를 체이닝할 수 있습니다.
	 * 
	 */
	@Test
	@Transactional
	@DisplayName("selectArticle 테스트....")
	public void selectArticle() {
		
		Optional<ArticleEntity> result = articleRepo.findById(17);
		ArticleEntity article = result.orElseThrow();
		
		System.out.println(article);
		
	}
	
	
	
	
	
}
