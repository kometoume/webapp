package com.example.webapp.service;

import com.example.webapp.entity.Comment;

/**
* ToDo：サービス
*/
public interface CommentService {

	/**
	*「すること」を新規登録します。
	*/
	void insertComment(Comment comment);

}