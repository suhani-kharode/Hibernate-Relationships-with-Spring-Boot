package com.sit.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	@OneToOne(cascade=CascadeType.ALL)
	private Address adr;
	
	
	public Student(int id, String name, Address adr) {
		this.id = id;
		this.name = name;
		this.adr = adr;
	}


	public Student() {
		super();
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


	public Address getAdr() {
		return adr;
	}


	public void setAdr(Address adr) {
		this.adr = adr;
	}
	
	
	
	
	
	
	
	
	

}
