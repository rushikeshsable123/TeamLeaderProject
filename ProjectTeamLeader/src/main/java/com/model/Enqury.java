package com.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Enqury {
	
	@Id
	private int customerID;
	private String firstName;
	private String lastName;
	private int age;
	private String email;
	private long mobno;
	private String pancardNo;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Cibil cibilScore;
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobno() {
		return mobno;
	}
	public void setMobno(long mobno) {
		this.mobno = mobno;
	}
	public String getPancardNo() {
		return pancardNo;
	}
	public void setPancardNo(String pancardNo) {
		this.pancardNo = pancardNo;
	}
	public Cibil getCibilScore() {
		return cibilScore;
	}
	public void setCibilScore(Cibil cibilScore) {
		this.cibilScore = cibilScore;
	}
	
	


}
