package kr.ch08.entity.board;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
/*
 * @ToString에서 exclude 속성을 통한 무한참조(StackOverFlow) 에러를 방지
 * toString() 메서드에서 양방향 참조를 모두 처리하면 무한 순환 참조가 발생 할 수 있기 때문에
 * 어느 한쪽에서만 참조할 수 있게 exclude를 해줘야 됨
 * 
 */
@ToString(exclude = "article")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="BoardComment")
public class CommentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // cno값에 대한  자동생성(auto increment)추가
	private int cno;
	private String content;
	
	@CreationTimestamp
	private LocalDateTime rdate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "writer")
	private UserEntity user;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent")
	private ArticleEntity article;
	
}
