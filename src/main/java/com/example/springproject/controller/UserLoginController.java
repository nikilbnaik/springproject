package com.example.springproject.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.springproject.model.Review;
import com.example.springproject.model.Review2;
import com.example.springproject.model.Review3;
import com.example.springproject.model.Review4;
import com.example.springproject.model.Review5;
import com.example.springproject.model.Review6;
import com.example.springproject.model.Review7;
import com.example.springproject.model.Review8;
import com.example.springproject.model.Review9;
import com.example.springproject.model.User;
import com.example.springproject.repo.ReviewRepo;
import com.example.springproject.repo.UserRepo;
import com.example.springproject.service.ReviewService;
import com.example.springproject.service.ReviewService2;
import com.example.springproject.service.ReviewService3;
import com.example.springproject.service.ReviewService4;
import com.example.springproject.service.ReviewService5;
import com.example.springproject.service.ReviewService6;
import com.example.springproject.service.ReviewService7;
import com.example.springproject.service.ReviewService8;
import com.example.springproject.service.ReviewService9;
import com.example.springproject.service.UserLoginService;
import com.example.springproject.serviceimpl.ReviewServiceImpl;

import java.util.List;


@Controller
public class UserLoginController {
	
	@Autowired
	UserLoginService userLoginService;
	
	@Autowired
	ReviewRepo reviewRepo;
	
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	ReviewServiceImpl reviewServiceImpl;
	
	@Autowired
	ReviewService reviewService;
	
	@Autowired
	ReviewService2 reviewService2;
	
	@Autowired
	ReviewService3 reviewService3;
	
	@Autowired
	ReviewService4 reviewService4;
	
	@Autowired
	ReviewService5 reviewService5;
	
	@Autowired
	ReviewService6 reviewService6;
	
	@Autowired
	ReviewService7 reviewService7;
	
	@Autowired
	ReviewService8 reviewService8;
	
	@Autowired
	ReviewService9 reviewService9;
	
	public User user;

	@RequestMapping(value="/", method = RequestMethod.GET)
    public String showVeiwUserDetails(ModelMap model){
		return "login";
    }
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model){
		return "login"; 
    }
	
	@RequestMapping("/userRegistration")    
    public String showform(ModelMap model){    
		model.put("command", new User());  
        return "userRegistration";   
    }    

	@RequestMapping(value="/addUserDetails", method = RequestMethod.POST)
    public String addUserDetails(@ModelAttribute("user") User user) {
		User newUser =  userLoginService.save(user);
		if(newUser != null){
			return "redirect:/login";
		}else{
			return "redirect:/userRegistration";
		}
    }

	
	@RequestMapping(value="/verifyLoginDetails", method = RequestMethod.GET)
    public String validateUser(ModelMap model, @RequestParam String username, @RequestParam String password){
		System.out.println("Entering - LoginController.validateUser(ModelMap, String, String) - username : "+username+" | password : "+password);
        boolean isValidUser = userLoginService.validateUser(username, password);
        if (!isValidUser) {
            model.put("errorMessage", "Invalid Credentials");
            return "login";
        }
        user = userRepo.findByUsername(username);
        model.put("username", user.getUsername());
        
        return "welcome";
    }
	
	@RequestMapping(value="/welcome", method = RequestMethod.GET)
	public String welcome(ModelMap model) {
		return "welcome";
	}
	
	@RequestMapping(value="/profile", method = RequestMethod.GET)
	public String profile(ModelMap model) {
		model.put("username", user.getUsername());
		model.put("fname", user.getfname());
		model.put("lname", user.getlname());
		model.put("email", user.getEmail());
		model.put("qualification", user.getqualification());
		model.put("profession", user.getprofession());
		return "profile";
	}
	
	@RequestMapping(value="/review", method = RequestMethod.GET)
	public String review(ModelMap model) {
		return "review";
	}
	
	@RequestMapping(value="/dashboard", method = RequestMethod.GET)
	public String dashboard(ModelMap model) {
		return "dashboard";
	}
	
	@RequestMapping(value="/review1", method = RequestMethod.GET)
	public String review1(ModelMap model) {
		return "review1";
	}
	
	@RequestMapping(value="/review2", method = RequestMethod.GET)
	public String review2(ModelMap model) {
		return "review2";
	}
	
	@RequestMapping(value="/review3", method = RequestMethod.GET)
	public String review3(ModelMap model) {
		return "review3";
	}
	
	@RequestMapping(value="/review4", method = RequestMethod.GET)
	public String review4(ModelMap model) {
		return "review4";
	}
	
	@RequestMapping(value="/review5", method = RequestMethod.GET)
	public String review5(ModelMap model) {
		return "review5";
	}
	
	@RequestMapping(value="/review6", method = RequestMethod.GET)
	public String review6(ModelMap model) {
		return "review6";
	}
	
	@RequestMapping(value="/review7", method = RequestMethod.GET)
	public String review7(ModelMap model) {
		return "review7";
	}
	
	@RequestMapping(value="/review8", method = RequestMethod.GET)
	public String review8(ModelMap model) {
		return "review8";
	}
	
	@RequestMapping(value="/review9", method = RequestMethod.GET)
	public String review9(ModelMap model) {
		return "review9";
	}
	
	@RequestMapping(value="/feed1", method = RequestMethod.GET)
	public String feed1(ModelMap model) {
		
		return "feed1";
	}
	
	@RequestMapping(value="/feed2", method = RequestMethod.GET)
	public String feed2(ModelMap model) {
		return "feed2";
	}
	
	@RequestMapping(value="/feed3", method = RequestMethod.GET)
	public String feed3(ModelMap model) {
		return "feed3";
	}
	
	@RequestMapping(value="/feed4", method = RequestMethod.GET)
	public String feed4(ModelMap model) {
		return "feed4";
	}
	
	@RequestMapping(value="/feed5", method = RequestMethod.GET)
	public String feed5(ModelMap model) {
		return "feed5";
	}
	
	@RequestMapping(value="/feed6", method = RequestMethod.GET)
	public String feed6(ModelMap model) {
		return "feed6";
	}
	
	@RequestMapping(value="/feed7", method = RequestMethod.GET)
	public String feed7(ModelMap model) {
		return "feed7";
	}
	
	@RequestMapping(value="/feed8", method = RequestMethod.GET)
	public String feed8(ModelMap model) {
		return "feed8";
	}
	
	@RequestMapping(value="/feed9", method = RequestMethod.GET)
	public String feed9(ModelMap model) {
		return "feed9";
	}
	
	@PostMapping(value="/save-review")
	public String saverequest(@ModelAttribute Review review,BindingResult bindingResult,HttpServletRequest request) {
	Review newReview = reviewService.save(review,user.getUsername());
	return "redirect:/review1";
	}
	
	@PostMapping(value="/save-review2")
	public String saverequest2(@ModelAttribute Review2 review2,BindingResult bindingResult,HttpServletRequest request) {
	Review2 newReview2 = reviewService2.save(review2,user.getUsername());
	return "redirect:/review2";
	}
	
	@PostMapping(value="/save-review3")
	public String saverequest3(@ModelAttribute Review3 review3,BindingResult bindingResult,HttpServletRequest request) {
	Review3 newReview3 = reviewService3.save(review3,user.getUsername());
	return "redirect:/review3";
	}
	
	@PostMapping(value="/save-review4")
	public String saverequest4(@ModelAttribute Review4 review4,BindingResult bindingResult,HttpServletRequest request) {
	Review4 newReview4 = reviewService4.save(review4,user.getUsername());
	return "redirect:/review4";
	}
	
	@PostMapping(value="/save-review5")
	public String saverequest5(@ModelAttribute Review5 review5,BindingResult bindingResult,HttpServletRequest request) {
	Review5 newReview5 = reviewService5.save(review5,user.getUsername());
	return "redirect:/review5";
	}
	
	@PostMapping(value="/save-review6")
	public String saverequest6(@ModelAttribute Review6 review6,BindingResult bindingResult,HttpServletRequest request) {
	Review6 newReview6 = reviewService6.save(review6,user.getUsername());
	return "redirect:/review6";
	}
	
	@PostMapping(value="/save-review7")
	public String saverequest7(@ModelAttribute Review7 review7,BindingResult bindingResult,HttpServletRequest request) {
	Review7 newReview7 = reviewService7.save(review7,user.getUsername());
	return "redirect:/review7";
	}
	
	@PostMapping(value="/save-review8")
	public String saverequest8(@ModelAttribute Review8 review8,BindingResult bindingResult,HttpServletRequest request) {
	Review8 newReview8 = reviewService8.save(review8,user.getUsername());
	return "redirect:/review8";
	}
	
	@PostMapping(value="/save-review9")
	public String saverequest9(@ModelAttribute Review9 review9,BindingResult bindingResult,HttpServletRequest request) {
	Review9 newReview9 = reviewService9.save(review9,user.getUsername());
	return "redirect:/review9";
	}
	
	@RequestMapping(value="/ReviewDashboard1")
	public String ReviewDashboard1(HttpServletRequest request) {
		//request.setAttribute("mode", "ALL_REQUESTS");
	    request.setAttribute("reviews", reviewService.showAllRequest());
	    return "ReviewDashboard1";
	}
	
	@RequestMapping(value="/ReviewDashboard2")
	public String ReviewDashboard2(HttpServletRequest request) {
	    request.setAttribute("reviews2", reviewService2.showAllRequest());
	    return "ReviewDashboard2";
	}
	
	@RequestMapping(value="/ReviewDashboard3")
	public String ReviewDashboard3(HttpServletRequest request) {
	    request.setAttribute("reviews3", reviewService3.showAllRequest());
	    return "ReviewDashboard3";
	}
	
	@RequestMapping(value="/ReviewDashboard4")
	public String ReviewDashboard4(HttpServletRequest request) {
	    request.setAttribute("reviews4", reviewService4.showAllRequest());
	    return "ReviewDashboard4";
	}
	
	@RequestMapping(value="/ReviewDashboard5")
	public String ReviewDashboard5(HttpServletRequest request) {
	    request.setAttribute("reviews5", reviewService5.showAllRequest());
	    return "ReviewDashboard5";
	}
	
	@RequestMapping(value="/ReviewDashboard6")
	public String ReviewDashboard6(HttpServletRequest request) {
	    request.setAttribute("reviews6", reviewService6.showAllRequest());
	    return "ReviewDashboard6";
	}
	
	@RequestMapping(value="/ReviewDashboard7")
	public String ReviewDashboard7(HttpServletRequest request) {
	    request.setAttribute("reviews7", reviewService7.showAllRequest());
	    return "ReviewDashboard7";
	}
	
	@RequestMapping(value="/ReviewDashboard8")
	public String ReviewDashboard8(HttpServletRequest request) {
	    request.setAttribute("reviews8", reviewService8.showAllRequest());
	    return "ReviewDashboard8";
	}
	
	@RequestMapping(value="/ReviewDashboard9")
	public String ReviewDashboard9(HttpServletRequest request) {
	    request.setAttribute("reviews9", reviewService9.showAllRequest());
	    return "ReviewDashboard9";
	}
	
	/*@RequestMapping(value="/ReviewDashboard1", method = RequestMethod.GET)
	public String ReviewDashboard1(ModelMap model) {
		List<Review> Review1 = reviewRepo.findAll();
		model.put("reviews" , Review1);
	//	request.setAttribute("reviews", Review1);
		return "ReviewDashboard1";
	}*/
	
}
