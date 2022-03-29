package com.model;

import javax.persistence.*;

@Entity
public class FinancialProduct {
	@Id
	@GeneratedValue
	private int financialProductId;
	private String financialProductName;
	private String description;
	private int rating;
	@OneToOne
	private Review review;
	public FinancialProduct() {}
	public int getFinancialProductId() {
		return financialProductId;
	}
	public void setFinancialProductId(int financialProductId) {
		this.financialProductId = financialProductId;
	}
	public String getFinancialProductName() {
		return financialProductName;
	}
	public void setFinancialProductName(String financialProductName) {
		this.financialProductName = financialProductName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Review getReview() {
		return review;
	}
	public void setReview(Review review) {
		this.review = review;
	}
	
	
}
