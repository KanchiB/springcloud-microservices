package io.kanchi.moviecatalogservice.model;

import java.util.List;

public class UserRating {
	
	private List<Ratings> userlist;
	
	public UserRating() {
		
	}

	public UserRating(List<Ratings> userlist) {
		super();
		this.userlist = userlist;
	}

	public List<Ratings> getUserlist() {
		return userlist;
	}

	public void setUserlist(List<Ratings> userlist) {
		this.userlist = userlist;
	}
	
	

}
