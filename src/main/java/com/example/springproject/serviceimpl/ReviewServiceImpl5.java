package com.example.springproject.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springproject.model.Review;
import com.example.springproject.model.Review5;
import com.example.springproject.repo.ReviewRepo5;
import com.example.springproject.service.ReviewService5;

@Service
public class ReviewServiceImpl5 implements ReviewService5{

	@Autowired
	ReviewRepo5 reviewRepo5;
	    
	   public Review5 save(Review5 review5, String username) {
		    review5.setUsername(username);
			return reviewRepo5.save(review5);
		}

		public List<Review5> getAllUserDetails() {
			return reviewRepo5.findAll();
		}

		public int deleteReviewDetailsById(Long id) {
			return reviewRepo5.deleteReviewDetailsById(id);
		}
	   //User Repository Function

		@Override
		public List<Review5> getAllReviewDetails() {
			// TODO Auto-generated method stub
			return reviewRepo5.findAll();
		}
		
		public List<Review5> showAllRequest(){
			List<Review5> reviews5 = new ArrayList<Review5>();
			for(Review5 review5 : reviewRepo5.findAll()) {
			reviews5.add(review5);
			}
			return reviews5;
		}
}
