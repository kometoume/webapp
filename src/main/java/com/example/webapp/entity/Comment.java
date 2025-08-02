package com.example.webapp.entity;

import java.time.LocalDateTime;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* すること：エンティティ
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
	/** することID */
	private Integer id;
	private Integer todo_id;
	private Integer user_id;
	private String content;
	/** 作成日時 */
	private LocalDateTime createdAt;
	/** 更新日時 */
	private LocalDateTime updatedAt;

	@ManyToOne //多対1
	@JoinColumn(name = "todo_id", nullable = false)
	private ToDo todo; // 外部キー (企業ID)

}