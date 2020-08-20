package com.example.springproject.service;

import java.util.List;


import com.example.springproject.model.Review9;

public interface ReviewService9 {

	public Review9 save(Review9 review9,String username);

	public List<Review9> getAllReviewDetails();

	public int deleteReviewDetailsById(Long id);
	
	public List<Review9> showAllRequest();
}
