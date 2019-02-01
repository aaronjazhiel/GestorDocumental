package com.websystique.springsecurity.dao;

import java.util.List;

import com.websystique.springsecurity.model.Dependece;

public interface DepenceDao {

	void save(Dependece dependece);
	
	Dependece findById(int id);
	
	List<Dependece> findAll();
	
	
	
}

