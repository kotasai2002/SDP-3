package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="share")
public class Share 
{
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 
	 @Column(nullable=false, unique=true, length=45)
	 private String email;
	 
	 @Column(nullable=false, length=45)
	 private String name;
	 
	 @Column(nullable=false, length=10)
	 private String mobile;
	 
	 @Column(nullable=false, length=45)
	 private String age;
	 
	 @Column(nullable=false, length=45)
	 private String city;

	 @Column(nullable=false, length=1000)
	 private String address;
	 
//	 @Column(nullable=false, length=1000)
//	 private String address;
	 
	 @Column(nullable=false,length=50)
	 private String quantityoffood;

	 public String getQuantityoffood() {
		return quantityoffood;
	}

	public void setQuantityoffood(String quantityoffood) {
		this.quantityoffood = quantityoffood;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	 
	 public Long getId() {
	  return id;
	 }

	 public void setId(Long id) {
	  this.id = id;
	 }

	 public String getEmail() {
	  return email;
	 }

	 public void setEmail(String email) {
	  this.email = email;
	 }
	 
	 public String getName() {
	  return name;
	 }

	 public void setName(String name) {
	  this.name = name;
	 }
	}