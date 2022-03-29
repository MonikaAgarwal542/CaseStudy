package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.FinancialProduct;
import com.model.FinancialProductDAO;

@RestController
public class FinancialProductController {
	@Autowired
	FinancialProductDAO financialProductDAO;
	@PostMapping("/addproduct")
	public String addFinancialProduct(@RequestBody FinancialProduct fb) {
		financialProductDAO.save(fb);
		return "product added";
	}
}
