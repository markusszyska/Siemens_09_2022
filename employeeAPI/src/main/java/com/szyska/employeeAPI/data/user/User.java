package com.szyska.employeeAPI.data.user;

public class User {
	private String user;
	private String token;
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	@Override
	public String toString() {
		return "User [user=" + user + ", token=" + token + "]";
	}
	
	
}
