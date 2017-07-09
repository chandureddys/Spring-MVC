package com.spring.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Registration")
public class UserRegistrationdto {
	@Id
	@Column(name = "id")
	private int subscriberid;
	@Column(name = "username")
	private String username;

	@Column(name = "email")
	private String email;

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

	public int getSubscriberid() {
		return subscriberid;
	}

	public void setSubscriberid(int subscriberid) {
		this.subscriberid = subscriberid;
	}

	@Override
	public String toString() {
		return "UserRegistrationdto [subscriberid=" + subscriberid + ", username=" + username + ", email=" + email
				+ "]";
	}

}
