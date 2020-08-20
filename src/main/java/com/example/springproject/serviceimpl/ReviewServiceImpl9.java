package com.example.springproject.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springproject.model.Review;
import com.example.springproject.model.Review9;
import com.example.springproject.repo.ReviewRepo9;
import com.example.springproject.service.ReviewService9;

@Service
public class ReviewServiceImpl9 implements ReviewService9{

	@Autowired
	ReviewRepo9 reviewRepo9;
	    
	   public Review9 save(Review9 review9, String username) {
		    review9.setUsername(username);
			return reviewRepo9.save(review9);
		}

		public List<Review9> getAllUserDetails() {
			return reviewRepo9.findAll();
		}

		public int deleteReviewDetailsById(Long id) {
			return reviewRepo9.deleteReviewDetailsById(id);
		}
	   //User Repository Function

		@Override
		public List<Review9> getAllReviewDetails() {
			// TODO Auto-generated method stub
			return reviewRepo9.findAll();
		}
		
		public List<Review9> showAllRequest(){
			List<Review9> reviews9 = new ArrayList<Review9>();
			for(Review9 review9 : reviewRepo9.findAll()) {
			reviews9.add(review9);
			}
			return reviews9;
		}
}
