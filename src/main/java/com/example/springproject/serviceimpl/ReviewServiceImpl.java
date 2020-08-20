package com.example.springproject.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springproject.model.Review;

import com.example.springproject.repo.ReviewRepo;
import com.example.springproject.service.ReviewService;

import java.util.ArrayList;
import java.util.List;


@Service
public class ReviewServiceImpl implements ReviewService{
	   @Autowired
	   ReviewRepo reviewRepo;
	    
	   public Review save(Review review, String username) {
		    review.setUsername(username);
			return reviewRepo.save(review);
		}

		public List<Review> getAllUserDetails() {
			return reviewRepo.findAll();
		}

		public int deleteReviewDetailsById(Long id) {
			return reviewRepo.deleteReviewDetailsById(id);
		}
	   //User Repository Function

		@Override
		public List<Review> getAllReviewDetails() {
			// TODO Auto-generated method stub
			return reviewRepo.findAll();
		}
		
		public List<Review> showAllRequest(){
			List<Review> reviews = new ArrayList<Review>();
			for(Review review : reviewRepo.findAll()) {
			reviews.add(review);
			}
			return reviews;
		}
	   

}
