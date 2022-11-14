package com.bhawna.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private int rolleno;
	private String name;
	private String address;
	public int getRolleno() {
		return rolleno;
	}
	public void setRolleno(int rolleno) {
		this.rolleno = rolleno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [rolleno=" + rolleno + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
