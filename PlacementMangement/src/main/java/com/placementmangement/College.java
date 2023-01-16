package com.placementmangement;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class College {

	@Id
	private Integer id;
	private String collegename;
	private String location;
	
	//Default Constructor
	public College() {
		super();		
		
	}
  //parameterized constructor
	public College(Integer id, String collegeadmin, String collegename, String location) {
		super();
		this.id = id;
		this.collegename = collegename;
		this.location = location;
	}
	//Getters and Setters Method
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "College [id=" + id +   ", collegename=" + collegename + ", location="
				+ location + "]";
	}
	
	
	
}