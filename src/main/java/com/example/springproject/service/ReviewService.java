package com.example.springproject.service;

import java.util.List;

import com.example.springproject.model.Review;
import com.example.springproject.repo.ReviewRepo;


public interface ReviewService {

	public Review save(Review review,String username);

	public List<Review> getAllReviewDetails();

	public int deleteReviewDetailsById(Long id);
	
	public List<Review> showAllRequest();
}
