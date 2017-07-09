package com.spring.dto;

public class UserRegistration {

	private String username;

	private int subscriberid;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private String email;

	@Override
	public String toString() {
		return "UserRegistration [username=" + username + ", email=" + email + "]";
	}

	public int getSubscriberid() {
		return subscriberid;
	}

	public void setSubscriberid(int subscriberid) {
		this.subscriberid = subscriberid;
	}
}
