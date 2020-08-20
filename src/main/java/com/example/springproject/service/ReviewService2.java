package com.example.springproject.service;

import java.util.List;

import com.example.springproject.model.Review2;



public interface ReviewService2 {

	public Review2 save(Review2 review2,String username);

	public List<Review2> getAllReviewDetails();

	public int deleteReviewDetailsById(Long id);
	
	public List<Review2> showAllRequest();
}
