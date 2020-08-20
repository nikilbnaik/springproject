package com.example.springproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Reviews2")
public class Review2 {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private long id;
	
	@Column(name="username")
	private String username;
	
	@Column(name="display")
    private String display;
	
	@Column(name="performance")
    private String performance;
	
	@Column(name="battery")
    private String battery;
	
	@Column(name="ram")
    private String ram;
	
	@Column(name="storage")
    private String storage;
	
	@Column(name="interfaces")
    private String interfaces;
 
    protected Review2() {
    	super();
    }
 
    public Review2(String username, String display, String performance, String battery, String ram, String storage, String interfaces) {
		super();
		this.username = username;
		this.display = display;
		this.performance = performance;
		this.battery = battery;
		this.ram = ram;
		this.storage = storage;
		this.interfaces = interfaces;
	}
    
    public long getId() {
        return id;
    }
     
    // other getters and setters are hidden for brevity
    public String getUsername() {
    	return this.username;
    }
    
    public void setUsername(String username) {
    	this.username = username;
    }
    
    public String getdisplay() {
        return this.display;
    }
 
    public void setdisplay(String display) {
        this.display = display;
    }

	public String getperformance() {
        return this.performance;
    }
 
    public void setperformance(String performance) {
        this.performance = performance;
    }
    
    public String getbattery() {
        return this.battery;
    }
 
    public void setbattery(String battery) {
        this.battery = battery;
    }
    
    public String getram() {
        return this.ram;
    }
 
    public void setram(String ram) {
        this.ram = ram;
    }
    
    public String getstorage() {
        return this.storage;
    }
 
    public void setstorage(String storage) {
        this.storage = storage;
    }
    
    public String getinterfaces() {
        return this.interfaces;
    }
 
    public void setinterfaces(String interfaces) {
        this.interfaces = interfaces;
    }

	@Override
	public String toString() {
		return "Review2 [id=" + id + ", username=" + username + ", display=" + display + ", performance=" + performance
				+ ", battery=" + battery + ", ram=" + ram + ", storage=" + storage + ", interfaces=" + interfaces + "]";
	}

	
}
