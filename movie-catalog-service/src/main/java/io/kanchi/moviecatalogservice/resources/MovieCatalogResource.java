package io.kanchi.moviecatalogservice.resources;

import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.kanchi.moviecatalogservice.model.CatalogItem;
import io.kanchi.moviecatalogservice.model.Movie;
import io.kanchi.moviecatalogservice.model.Ratings;
import io.kanchi.moviecatalogservice.model.UserRating;


@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	
	@Autowired
	RestTemplate rest;
	
	@RequestMapping("/{userid}")
	public List<CatalogItem> getItem(@PathVariable("userid") String userid){
		//getAllratedmovies
		UserRating ratings = rest.getForObject("http://ratings-data-service/ratings/users/"+ userid, UserRating.class);
		List<CatalogItem> result = ratings.getUserlist().stream().map(rating -> {
			Movie movie = rest.getForObject("http://movie-info-service/movies/"+rating.getMovieId(), Movie.class);
			return new CatalogItem(movie.getName(), rating.getRating());
		}).collect(Collectors.toList());
		return result;
		
	}

}
