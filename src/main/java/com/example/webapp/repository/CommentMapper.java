package com.example.webapp.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.webapp.entity.Comment;

/**
* ToDo：リポジトリ
*/
@Mapper
public interface CommentMapper {

	/**
	*「すること」を登録します。
	*/
	void insert(Comment comment);

}
