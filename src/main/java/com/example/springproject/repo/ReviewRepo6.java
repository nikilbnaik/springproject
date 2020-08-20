package com.example.springproject.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.springproject.model.Review6;

public interface ReviewRepo6 extends JpaRepository<Review6, Long>{

	public int deleteReviewDetailsById(Long id);
	
	public List<Review6> findAll();
}
