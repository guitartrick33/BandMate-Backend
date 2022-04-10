package com.bezkoder.spring.login.payload.response;

import com.bezkoder.spring.login.models.Genre;

import java.util.Date;
import java.util.List;
import java.util.Set;

public class UserInfoResponse {
	private Long id;
	private String username;
	private String email;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String country;
	private String description;
	private List<Genre> genres;
	private List<String> roles;

	public UserInfoResponse(Long id, String username, String email, String firstName, String lastName, Date dateOfBirth, String country, String description,List<Genre> genres, List<String> roles) {
		this.id = id;
		this.username = username;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.country = country;
		this.description = description;
		this.genres = genres;
		this.roles = roles;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() { return firstName; }

	public void setFirstName(String firstName) { this.firstName = firstName; }

	public String getLastName() { return lastName; }

	public void setLastName(String lastName) { this.lastName = lastName; }

	public Date getDateOfBirth() { return dateOfBirth; }

	public void setDateOfBirth(Date dateOfBirth) { this.dateOfBirth = dateOfBirth; }

	public String getCountry() {
		return country;
	}

	public void setCountry(String country){
		this.country = country;
	}

	public String getDescription(){
		return description;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<String> getRoles() {
		return roles;
	}

	public List<Genre> getGenres(){
		return genres;
	}

	public void setGenres(List<Genre> genres){
		this.genres = genres;
	}
}
