package com.example.springproject.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springproject.model.Review7;

public interface ReviewRepo7 extends JpaRepository<Review7, Long>{

	public int deleteReviewDetailsById(Long id);
	
	public List<Review7> findAll();
}
