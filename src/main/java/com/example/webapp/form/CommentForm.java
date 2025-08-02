package com.example.webapp.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* すること：Form
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentForm {
	/** することID */
	//	private Integer id;
	//	private Integer todo_id;
	/** すること詳細 */
	@Size(min = 1, max = 500, message = "詳細は{min}～{max}文字以内で入力してください。")
	@NotBlank(message = "未入力は許可しません！")
	private String content;

	/** 新規判定 */
	//	private Boolean isNew;
}