package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Comment;
import com.model.CommentDAO;

@RestController
public class CommentController {
	@Autowired
	CommentDAO commentDAO;
	@PostMapping("/addcomment")
	public String addComment(@RequestBody Comment c) {
		commentDAO.save(c);
		return "comment added";
	}

}
