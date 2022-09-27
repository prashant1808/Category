package com.ty.Spring_Boot2nd.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.Spring_Boot2nd.Entity.Product;
import com.ty.Spring_Boot2nd.Service_interface.Service_Impl;

@RestController
public class product_Controller {
	
	@Autowired
	Service_Impl impl;
	
	@PostMapping("/product")
	public Product Add_product(@RequestBody Product p) {
		return this.impl.addproduct(p);		
	}
	 
	@GetMapping("/product")
	public List<Product> homeproduct(
			@RequestParam(value = "pageno",defaultValue = "3",required = false)int pageno,
			@RequestParam(value = "pagesize",defaultValue = "2",required = false)int pagesize
		){
		return this.impl.getproduct(pageno, pagesize);
	}
	
	@GetMapping("/product/{id}")
	public Optional<Product> getproduct(@PathVariable int id) {
		
		return this.impl.getbyid(id);
		
	}
	
	@DeleteMapping("/{id}")
	public void Deleteproduct(@PathVariable int id) {
		 this.impl.delete_product(id);
	}
	
	@PutMapping("/product")
	public Product updateproduct(Product p) {
		return this.impl.update_product(p);
	}
	
}
