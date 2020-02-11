package io.kanchi.movieinfoservice.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.kanchi.movieinfoservice.model.Movie;

@RestController
@RequestMapping("/movies")
public class MovieResource {
	
	@RequestMapping("/{movieId}")
	public Movie getMovie(@PathVariable("movieId") String id) {
		return new Movie(5, "MoviefromMovieInfoService");
	}

}
