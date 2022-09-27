package com.ty.Spring_Boot2nd.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	
	@Id
	private int id;
	private String name;
	
	@ManyToOne(targetEntity = category.class,cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "idc")
	private category c;

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

	public category getC() {
		return c;
	}

	public void setC(category c) {
		this.c = c;
	}
	
	
}
