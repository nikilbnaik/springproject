package com.example.springproject.service;

import java.util.List;


import com.example.springproject.model.Review3;

public interface ReviewService3 {

	public Review3 save(Review3 review3,String username);

	public List<Review3> getAllReviewDetails();

	public int deleteReviewDetailsById(Long id);
	
	public List<Review3> showAllRequest();
}
