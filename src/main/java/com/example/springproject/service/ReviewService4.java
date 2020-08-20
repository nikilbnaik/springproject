package com.example.springproject.service;

import java.util.List;


import com.example.springproject.model.Review4;

public interface ReviewService4 {

	public Review4 save(Review4 review4,String username);

	public List<Review4> getAllReviewDetails();

	public int deleteReviewDetailsById(Long id);
	
	public List<Review4> showAllRequest();
}
