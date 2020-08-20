package com.example.springproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="uid")
    private long uid;
	
	@Column(name="fname")
    private String fname;
	
	@Column(name="lname")
    private String lname;
	
	@Column(name="username")
    private String username;
	
	@Column(name="password")
    private String password;
	
	@Column(name="email")
    private String email;
	
	@Column(name="qualification")
    private String qualification;
	
	@Column(name="profession")
    private String profession;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String username, String password, String email, String fname, String lname, String qualification, String profession) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.username = username;
		this.password = password;
		this.email = email;
		this.qualification = qualification;
		this.profession = profession;
	}
	public long getUid() {
		return uid;
	}
	public void setUid(long uid) {
		this.uid = uid;
	}
	public String getfname() {
		return fname;
	}
	public void setfname(String fname) {
		this.fname = fname;
	}
	public String getlname() {
		return lname;
	}
	public void setlname(String lname) {
		this.lname = lname;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getqualification() {
		return qualification;
	}
	public void setqualification(String qualification) {
		this.qualification = qualification;
	}
	public String getprofession() {
		return profession;
	}
	public void setprofession(String profession) {
		this.profession = profession;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", fname=" + fname +  ", lname=" + lname + ", username=" + username + ", password=" + password + ", email=" + email + ", qualification=" + qualification +  ", profession=" + profession +  "]";
	}
}
