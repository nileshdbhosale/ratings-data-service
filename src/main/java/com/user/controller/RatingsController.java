package com.user.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.model.Rating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsController {

	@GetMapping("/{movieId}")
	public Rating getRating(@PathVariable String movieId) {
		return new Rating(movieId, 5);
	}
	
	@GetMapping("/users/{userId}")
	public List<Rating> getUserRating(@PathVariable String userId) {
		List<Rating> userRating = Arrays.asList(
				 new Rating("12345", 5),
				 new Rating("56789", 6)
				); 
		return userRating;
	}
	
//	@GetMapping("/users/{userId}")
//	public UserRating getUserRating(@PathVariable String userId) {
//		//UserRating userRating = new UserRating();
//		List<Rating> userRatingList = Arrays.asList(
//				 new Rating("12345", 5),
//				 new Rating("56789", 6)
//				); 
//		return new UserRating(userRatingList);
//	}
}
