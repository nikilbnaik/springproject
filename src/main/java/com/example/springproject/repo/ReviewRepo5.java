package com.example.springproject.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.springproject.model.Review5;

public interface ReviewRepo5 extends JpaRepository<Review5, Long>{

	public int deleteReviewDetailsById(Long id);
	
	public List<Review5> findAll();
}
