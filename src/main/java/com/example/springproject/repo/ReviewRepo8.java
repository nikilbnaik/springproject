package com.example.springproject.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.springproject.model.Review8;

public interface ReviewRepo8 extends JpaRepository<Review8, Long>{

	public int deleteReviewDetailsById(Long id);
	
	public List<Review8> findAll();
}
