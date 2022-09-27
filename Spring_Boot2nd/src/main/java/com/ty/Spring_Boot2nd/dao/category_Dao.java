package com.ty.Spring_Boot2nd.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.ty.Spring_Boot2nd.Entity.category;

public interface category_Dao extends PagingAndSortingRepository<category, Integer>{

	}
