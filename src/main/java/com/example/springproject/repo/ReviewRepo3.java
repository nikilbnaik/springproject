package com.example.springproject.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.springproject.model.Review3;

public interface ReviewRepo3 extends JpaRepository<Review3, Long>{

	public int deleteReviewDetailsById(Long id);
	
	public List<Review3> findAll();
}
