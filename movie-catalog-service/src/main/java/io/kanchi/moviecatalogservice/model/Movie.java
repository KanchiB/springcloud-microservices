package io.kanchi.moviecatalogservice.model;


public class Movie {
	
	private Integer movieId;
	private String name;
	
	public Movie() {
		
	}
	public Movie(Integer movieId, String name) {
		super();
		this.movieId = movieId;
		this.name = name;
	}
	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

