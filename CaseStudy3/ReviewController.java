package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Review;
import com.model.ReviewDAO;

@RestController
public class ReviewController {
	@Autowired
	ReviewDAO reviewDAO;
	@PostMapping("/addreview")
	public String addReview(@RequestBody Review r) {
		reviewDAO.save(r);
		return "review added";
	}
}
