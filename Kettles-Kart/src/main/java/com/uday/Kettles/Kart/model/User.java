package com.uday.Kettles.Kart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String password;
	private long phoneNo;
	private String email;
	private String address;
	private boolean isVendor;
	private boolean isCustomer;
	
	
	
	public User(int id, String name, String password, long phoneNo, String email, String address, boolean isVendor,
			boolean isCustomer) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.phoneNo = phoneNo;
		this.email = email;
		this.address = address;
		this.isVendor = isVendor;
		this.isCustomer = isCustomer;
	}
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
		
		
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isVendor() {
		return isVendor;
	}
	public void setVendor(boolean isVendor) {
		this.isVendor = isVendor;
	}
	public boolean isCustomer() {
		return isCustomer;
	}
	public void setCustomer(boolean isCustomer) {
		this.isCustomer = isCustomer;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", phoneNo=" + phoneNo + ", email="
				+ email + ", address=" + address + ", isVendor=" + isVendor + ", isCustomer=" + isCustomer + "]";
	}
	
	

}
