package com.example.springproject.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.springproject.model.Review;



public interface ReviewRepo extends JpaRepository<Review, Long>{


	public int deleteReviewDetailsById(Long id);
	
	//@Query("SELECT r FROM reviews r")
	public List<Review> findAll();
	
}