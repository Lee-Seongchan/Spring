package kr.ch08.entity.board;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(exclude = "article")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="BoardFile")
public class FileEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // cno값에 대한  자동생성(auto increment)추가
	private int fno;
	private String oName;
	private String sName;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ano")
	private ArticleEntity article;
}
