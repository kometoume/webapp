package com.example.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.webapp.service.CommentService;

import lombok.RequiredArgsConstructor;

/**
 * Comment：コントローラ
 */
@Controller
@RequestMapping("/comments")
@RequiredArgsConstructor
public class CommentController {
	/** DI */
	private final CommentService commentService;

	/**
	 *「すること」の一覧を表示します。
	 */
	@GetMapping
	public String list(Model model) {
		model.addAttribute("todos", toDoService.findAllToDo());
		return "todo/list";
	}

}
