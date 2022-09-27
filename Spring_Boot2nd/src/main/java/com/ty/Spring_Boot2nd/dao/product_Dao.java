package com.ty.Spring_Boot2nd.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.Spring_Boot2nd.Entity.Product;

public interface product_Dao extends JpaRepository<Product, Integer>{

}
