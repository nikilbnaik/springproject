package com.example.springproject.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.springproject.model.Review9;

public interface ReviewRepo9 extends JpaRepository<Review9, Long>{

	public int deleteReviewDetailsById(Long id);
	
	public List<Review9> findAll();
}
