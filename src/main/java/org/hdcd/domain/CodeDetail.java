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
@ToString
@EqualsAndHashCode(of = {"groupCode", "codeValue"})
@Entity
@IdClass(CodeDetailId.class)
@Table(name="code_detail")
public class CodeDetail {

	@NotBlank
	@Id
	@Column(length = 3)
	private String groupCode;
	
	@NotBlank
	@Id
	@Column(length = 3)
	private String codeValue;
	
	@NotBlank
	@Column(length = 30, nullable = false)
	private String codeName;
	
	private int sortSeq;
	
	@Column(length = 1)
	private String useYn = "Y";
	
	@CreationTimestamp
	private LocalDateTime regDate;
	@UpdateTimestamp
	private LocalDateTime updDate;

}
