package io.kanchi.moviecatalogservice.model;

public class CatalogItem {
	
	private String name;
	private Integer rating;
	
	
	public CatalogItem(String name, Integer rating) {
		super();
		this.name = name;
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	
	

}
