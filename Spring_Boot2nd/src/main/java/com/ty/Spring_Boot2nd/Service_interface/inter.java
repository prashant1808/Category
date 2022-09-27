package com.ty.Spring_Boot2nd.Service_interface;

import java.util.List;
import java.util.Optional;

import com.ty.Spring_Boot2nd.Entity.category;

public interface inter {
	public category add(category c);
	
	public List<category> getcategory(int pageno,int pagesize);
	
	public Optional<category> getid(int id);
	
	public boolean delete(int id);
	
	public category update(category c);
}
