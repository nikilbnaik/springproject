package com.example.springproject.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.springproject.model.Review2;


public interface ReviewRepo2 extends JpaRepository<Review2, Long>{

	public int deleteReviewDetailsById(Long id);
	
	public List<Review2> findAll();
}
