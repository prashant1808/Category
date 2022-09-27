package com.ty.Spring_Boot2nd.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Generated;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;

@Entity
public class category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int C_id;
	private String C_Name;
	
	@OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Product> products;

	public int getC_id() {
		return C_id;
	}

	public void setC_id(int c_id) {
		C_id = c_id;
	}

	public String getC_Name() {
		return C_Name;
	}

	public void setC_Name(String c_Name) {
		C_Name = c_Name;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public category(int c_id, String c_Name, List<Product> products) {
		super();
		C_id = c_id;
		C_Name = c_Name;
		this.products = products;
	}

	public category() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
