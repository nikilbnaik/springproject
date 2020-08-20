package com.example.springproject.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springproject.model.Review;
import com.example.springproject.model.Review3;
import com.example.springproject.repo.ReviewRepo3;
import com.example.springproject.service.ReviewService3;

@Service
public class ReviewServiceImpl3 implements ReviewService3{

	@Autowired
	ReviewRepo3 reviewRepo3;
	    
	   public Review3 save(Review3 review3, String username) {
		    review3.setUsername(username);
			return reviewRepo3.save(review3);
		}

		public List<Review3> getAllUserDetails() {
			return reviewRepo3.findAll();
		}

		public int deleteReviewDetailsById(Long id) {
			return reviewRepo3.deleteReviewDetailsById(id);
		}
	   //User Repository Function

		@Override
		public List<Review3> getAllReviewDetails() {
			// TODO Auto-generated method stub
			return reviewRepo3.findAll();
		}
		
		public List<Review3> showAllRequest(){
			List<Review3> reviews3 = new ArrayList<Review3>();
			for(Review3 review3 : reviewRepo3.findAll()) {
			reviews3.add(review3);
			}
			return reviews3;
		}
}
