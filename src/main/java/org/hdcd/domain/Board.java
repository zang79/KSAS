package org.hdcd.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode(of="boardNo")
@ToString
@Entity
@Table(name="board")
public class Board {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long boardNo;

	@NotBlank
	@Column(length = 200, nullable = false)
	private String title;
	
	@Column(length = 50, nullable = false)
	private String writer;
	
	@Lob
	private String content;

	@CreationTimestamp
	private LocalDateTime regDate;
	@UpdateTimestamp
	private LocalDateTime updDate;

	@Column(columnDefinition = "integer default 0", nullable = false)
	private Integer views;

}
