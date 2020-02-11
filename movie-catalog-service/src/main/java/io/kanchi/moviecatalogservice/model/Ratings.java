package io.kanchi.moviecatalogservice.model;

public class Ratings {

	private Integer movieId;
	private Integer rating;
	
	public Ratings(){}
	
	public Ratings(Integer movieId, Integer rating) {
		super();
		this.movieId = movieId;
		this.rating = rating;
	}
	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}	
}
