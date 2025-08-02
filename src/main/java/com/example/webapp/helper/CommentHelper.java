package com.example.webapp.helper;

import com.example.webapp.entity.Comment;
import com.example.webapp.form.CommentForm;

/**
* Comment：ヘルパー
*/
public class CommentHelper {
	/**
	* Commentへの変換
	*/
	public static Comment convertComment(CommentForm form) {
		Comment Comment = new Comment();
		Comment.setId(form.getId());
		Comment.setContent(form.getContent());
		return Comment;
	}

	/**
	* CommentFormへの変換
	*/
	public static CommentForm convertCommentForm(Comment Comment) {
		CommentForm form = new CommentForm();
		form.setId(Comment.getId());
		form.setContent(Comment.getContent());
		// 更新画面設定
		//		form.setIsNew(false);
		return form;
	}
}