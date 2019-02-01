package com.websystique.springsecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.springsecurity.dao.DepenceDao;
import com.websystique.springsecurity.model.Dependece;

@Service("dependeceService")
@Transactional
public class DependenceServiceImpl implements DependeceService{

	@Autowired
	private DepenceDao dao;

	public void save(Dependece dependece) {
		dao.save(dependece);
		
	}

	public Dependece findById(int id) {
		return dao.findById(id);
	}

	public List<Dependece> findAll() {
		return dao.findAll();
	}
	
	
}
