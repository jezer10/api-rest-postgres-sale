package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "usertab")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long iduser;
	private String username;
	private String password;

	public User() {
		super();
	}

	public User(Long iduser, String username, String password) {
		super();
		this.iduser = iduser;
		this.username = username;
		this.password = password;
	}

	public Long getIduser() {
		return iduser;
	}

	public void setIduser(Long iduser) {
		this.iduser = iduser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	
	

}
