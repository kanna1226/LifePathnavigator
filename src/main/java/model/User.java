package model;

import java.io.Serializable;

public class User implements Serializable {
	private String userId;
	private String userName;
	private String mail;
	private String pass;
	
	public User() {}
	public User(String userId, String userName, String mail, String pass) {
		this.userId = userId;
		this.userName = userName;
		this.mail = mail;
		this.pass = pass;
	}
	
	public String getUserId() { return userId; }
	public String getUserName() { return userName; }
	public String getMail() { return mail; }
	public String getPass() { return pass; }
}
