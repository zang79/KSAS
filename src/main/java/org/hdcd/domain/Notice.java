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
@EqualsAndHashCode(of="noticeNo")
@ToString
@Entity
@Table(name="notice")
public class Notice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long noticeNo;
	
	@NotBlank
	@Column(length = 200, nullable = false)
	private String title;
	
	@Lob
	private String content;
	
	@CreationTimestamp
	private LocalDateTime regDate;
	@UpdateTimestamp
	private LocalDateTime updDate;

}
