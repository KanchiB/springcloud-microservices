package io.kanchi.ratingsdataservice.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.kanchi.ratingsdataservice.resource.model.Ratings;
import io.kanchi.ratingsdataservice.resource.model.UserRating;


@RestController
@RequestMapping("/ratings")

public class RatingsDataResource {
	
	@RequestMapping("/{movieId}")
	
	public Ratings getRating(@PathVariable("movieId") String id) {
		return new Ratings(5, 5);
	}
	
	@RequestMapping("/users/{userId}")
	public UserRating getUserRating(@PathVariable("userId") String id) {
		List<Ratings> ratings = Arrays.asList(new Ratings(5, 5), new Ratings(1, 4));//movieId, rating
		UserRating result = new UserRating(ratings);
		return result;
	}
	
	

}
