package com.example.springproject.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springproject.model.Review;
import com.example.springproject.model.Review7;
import com.example.springproject.repo.ReviewRepo7;
import com.example.springproject.service.ReviewService7;

@Service
public class ReviewServiceImpl7 implements ReviewService7{

	@Autowired
	ReviewRepo7 reviewRepo7;
	    
	   public Review7 save(Review7 review7, String username) {
		    review7.setUsername(username);
			return reviewRepo7.save(review7);
		}

		public List<Review7> getAllUserDetails() {
			return reviewRepo7.findAll();
		}

		public int deleteReviewDetailsById(Long id) {
			return reviewRepo7.deleteReviewDetailsById(id);
		}
	   //User Repository Function

		@Override
		public List<Review7> getAllReviewDetails() {
			// TODO Auto-generated method stub
			return reviewRepo7.findAll();
		}
		
		public List<Review7> showAllRequest(){
			List<Review7> reviews7 = new ArrayList<Review7>();
			for(Review7 review7 : reviewRepo7.findAll()) {
			reviews7.add(review7);
			}
			return reviews7;
		}
}
