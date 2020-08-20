package com.example.springproject.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springproject.model.Review4;

public interface ReviewRepo4 extends JpaRepository<Review4, Long>{

	public int deleteReviewDetailsById(Long id);
	
	public List<Review4> findAll();
}
