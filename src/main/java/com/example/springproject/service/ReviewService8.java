package com.example.springproject.service;

import java.util.List;


import com.example.springproject.model.Review8;

public interface ReviewService8 {

	public Review8 save(Review8 review8,String username);

	public List<Review8> getAllReviewDetails();

	public int deleteReviewDetailsById(Long id);
	
	public List<Review8> showAllRequest();
}
