package com.websystique.springsecurity.service;

import java.util.List;

import com.websystique.springsecurity.model.Dependece;

public interface DependeceService {

	void save(Dependece user);
	
	Dependece findById(int id);
	
	List<Dependece> findAll();
	
	
	
}