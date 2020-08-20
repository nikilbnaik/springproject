package com.example.springproject.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springproject.model.Review;
import com.example.springproject.model.Review4;
import com.example.springproject.repo.ReviewRepo4;
import com.example.springproject.service.ReviewService4;

@Service
public class ReviewServiceImpl4 implements ReviewService4{

	@Autowired
	ReviewRepo4 reviewRepo4;
	    
	   public Review4 save(Review4 review4, String username) {
		    review4.setUsername(username);
			return reviewRepo4.save(review4);
		}

		public List<Review4> getAllUserDetails() {
			return reviewRepo4.findAll();
		}

		public int deleteReviewDetailsById(Long id) {
			return reviewRepo4.deleteReviewDetailsById(id);
		}
	   //User Repository Function

		@Override
		public List<Review4> getAllReviewDetails() {
			// TODO Auto-generated method stub
			return reviewRepo4.findAll();
		}
		
		public List<Review4> showAllRequest(){
			List<Review4> reviews4 = new ArrayList<Review4>();
			for(Review4 review4 : reviewRepo4.findAll()) {
			reviews4.add(review4);
			}
			return reviews4;
		}
}
