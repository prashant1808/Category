package com.ty.Spring_Boot2nd.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.Spring_Boot2nd.Entity.Product;
import com.ty.Spring_Boot2nd.Entity.category;
import com.ty.Spring_Boot2nd.Service_interface.Service_Impl;

@RestController
public class Category_Controller {
	
	@Autowired
	Service_Impl impl;
	
	@PostMapping("/Category")
	public category Add_category(@RequestBody category c) {
		return this.impl.add(c);
		
	}
	 
	@GetMapping("/Category/{pageno}/{pagesize}")
	public List<category> home(@PathVariable int pageno,@PathVariable int pagesize) {
		return impl.getcategory(pageno, pagesize);
	}
	
	@GetMapping("/getall")
	public List<category> getall(){
		
		return this.impl.getAll();
	}
	
	@GetMapping("/Category/{c_id}")
	public Optional<category> getcourse(@PathVariable int c_id) {
		
		return this.impl.getid(c_id);
		
	}
	
	@DeleteMapping("/{c_id}")
	public void Delete(@PathVariable int c_id) {
		 this.impl.delete(c_id);
	}
	
	@PutMapping("/Category")
	public category update(category c) {
		return impl.update(c);
	}
	
	
	
}
