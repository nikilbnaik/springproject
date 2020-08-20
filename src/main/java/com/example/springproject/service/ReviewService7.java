package com.example.springproject.service;

import java.util.List;


import com.example.springproject.model.Review7;

public interface ReviewService7 {

	public Review7 save(Review7 review7,String username);

	public List<Review7> getAllReviewDetails();

	public int deleteReviewDetailsById(Long id);
	
	public List<Review7> showAllRequest();
}
