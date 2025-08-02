package com.example.webapp.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.webapp.entity.Comment;
import com.example.webapp.repository.CommentMapper;
import com.example.webapp.service.CommentService;

import lombok.RequiredArgsConstructor;

/**
* ToDo：サービス実装クラス
*/
@Service
@Transactional
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {
	/** DI */
	private final CommentMapper commentMapper;

	@Override
	public void insertComment(Comment comment) {
		commentMapper.insert(comment);
	}

}