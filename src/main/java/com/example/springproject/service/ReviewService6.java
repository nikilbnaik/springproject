package com.example.springproject.service;

import java.util.List;


import com.example.springproject.model.Review6;

public interface ReviewService6 {

	public Review6 save(Review6 review6,String username);

	public List<Review6> getAllReviewDetails();

	public int deleteReviewDetailsById(Long id);
	
	public List<Review6> showAllRequest();
}
