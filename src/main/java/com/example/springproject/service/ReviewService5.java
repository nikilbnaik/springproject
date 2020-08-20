package com.example.springproject.service;

import java.util.List;


import com.example.springproject.model.Review5;

public interface ReviewService5 {

	public Review5 save(Review5 review5,String username);

	public List<Review5> getAllReviewDetails();

	public int deleteReviewDetailsById(Long id);
	
	public List<Review5> showAllRequest();
}
