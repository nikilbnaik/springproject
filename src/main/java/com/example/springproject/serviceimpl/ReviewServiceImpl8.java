package com.example.springproject.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springproject.model.Review;
import com.example.springproject.model.Review8;
import com.example.springproject.repo.ReviewRepo8;
import com.example.springproject.service.ReviewService8;

@Service
public class ReviewServiceImpl8 implements ReviewService8{

	@Autowired
	ReviewRepo8 reviewRepo8;
	    
	   public Review8 save(Review8 review8, String username) {
		    review8.setUsername(username);
			return reviewRepo8.save(review8);
		}

		public List<Review8> getAllUserDetails() {
			return reviewRepo8.findAll();
		}

		public int deleteReviewDetailsById(Long id) {
			return reviewRepo8.deleteReviewDetailsById(id);
		}
	   //User Repository Function

		@Override
		public List<Review8> getAllReviewDetails() {
			// TODO Auto-generated method stub
			return reviewRepo8.findAll();
		}
		
		public List<Review8> showAllRequest(){
			List<Review8> reviews8 = new ArrayList<Review8>();
			for(Review8 review8 : reviewRepo8.findAll()) {
			reviews8.add(review8);
			}
			return reviews8;
		}
}
