package com.example.springproject.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springproject.model.Review;
import com.example.springproject.model.Review2;
import com.example.springproject.repo.ReviewRepo2;
import com.example.springproject.service.ReviewService2;



@Service
public class ReviewServiceImpl2 implements ReviewService2{
	
	@Autowired
	ReviewRepo2 reviewRepo2;
	    
	   public Review2 save(Review2 review2, String username) {
		    review2.setUsername(username);
			return reviewRepo2.save(review2);
		}

		public List<Review2> getAllUserDetails() {
			return reviewRepo2.findAll();
		}

		public int deleteReviewDetailsById(Long id) {
			return reviewRepo2.deleteReviewDetailsById(id);
		}
	   //User Repository Function

		@Override
		public List<Review2> getAllReviewDetails() {
			// TODO Auto-generated method stub
			return reviewRepo2.findAll();
		}

		public List<Review2> showAllRequest(){
			List<Review2> reviews2 = new ArrayList<Review2>();
			for(Review2 review2 : reviewRepo2.findAll()) {
			reviews2.add(review2);
			}
			return reviews2;
		}

}
