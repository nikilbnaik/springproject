package com.example.springproject.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springproject.model.Review;
import com.example.springproject.model.Review6;
import com.example.springproject.repo.ReviewRepo6;
import com.example.springproject.service.ReviewService6;

@Service
public class ReviewServiceImpl6 implements ReviewService6{

	@Autowired
	ReviewRepo6 reviewRepo6;
	    
	   public Review6 save(Review6 review6, String username) {
		    review6.setUsername(username);
			return reviewRepo6.save(review6);
		}

		public List<Review6> getAllUserDetails() {
			return reviewRepo6.findAll();
		}

		public int deleteReviewDetailsById(Long id) {
			return reviewRepo6.deleteReviewDetailsById(id);
		}
	   //User Repository Function

		@Override
		public List<Review6> getAllReviewDetails() {
			// TODO Auto-generated method stub
			return reviewRepo6.findAll();
		}
		
		public List<Review6> showAllRequest(){
			List<Review6> reviews6 = new ArrayList<Review6>();
			for(Review6 review6 : reviewRepo6.findAll()) {
			reviews6.add(review6);
			}
			return reviews6;
		}
}
