package com.ty.Spring_Boot2nd.Service_interface;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.ty.Spring_Boot2nd.Entity.Product;
import com.ty.Spring_Boot2nd.Entity.category;
import com.ty.Spring_Boot2nd.dao.category_Dao;
import com.ty.Spring_Boot2nd.dao.product_Dao;


@Service
public class Service_Impl implements inter{
	
	
	
	@Autowired
	private category_Dao dao;
	@Autowired
	private product_Dao dao2;
	
	public category add(category c) {
		dao.save(c);
		return c;
	}
	
	public List<category> getcategory(int pageno,int pagesize) {
		
		Pageable p=PageRequest.of(pageno, pagesize);
		
		Page<category> pagecategory=this.dao.findAll(p);
		
		
		return pagecategory.toList() ;
	}
	
	public List<category> getAll(){
		
		return (List<category>) dao.findAll();
	}

	public Optional<category> getid(int c_id) {
		
		return dao.findById(c_id);
	}

	public boolean delete(int id) {
		
		dao.deleteById(id);
		return true;
	}
	
	public category update(category c) {
		
		return dao.save(c);
		
	}

	//==================================================================================================================================================

	public Product addproduct(Product p) {
		dao2.save(p);
		return p;
	}

	public List<Product> getproduct(int pageno,int pagesize) {
		
		Pageable p=PageRequest.of(pageno, pagesize);
		
		Page<Product> pagecategory=this.dao2.findAll(p);
		
		List<Product> Allproduct=pagecategory.getContent();
		
		return Allproduct;
	}

	public Optional<Product> getbyid(int p_id) {
		
		return dao2.findById(p_id);
	}

	public boolean delete_product(int id) {
		
		dao2.deleteById(id);
		return true;
	}
	
	public Product update_product(Product p) {
		
		return dao2.save(p);
		
	}

	
}
