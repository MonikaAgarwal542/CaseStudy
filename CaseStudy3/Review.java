package com.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class Review {
	@Id
	@GeneratedValue
	private int reviewId;
	private String reviewText;
	@OneToOne
	private FinancialProduct financialProductReviewed;
	@OneToMany
	private List<Comment> comments;
	public Review() {}
	public int getReviewId() {
		return reviewId;
	}
	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}
	public String getReviewText() {
		return reviewText;
	}
	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}
	public FinancialProduct getFinancialProductReviewed() {
		return financialProductReviewed;
	}
	public void setFinancialProductReviewed(FinancialProduct financialProductReviewed) {
		this.financialProductReviewed = financialProductReviewed;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
	
}
