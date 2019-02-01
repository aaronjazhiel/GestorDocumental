package com.websystique.springsecurity.dao;

import java.util.List;

import com.websystique.springsecurity.model.User;

public interface UserDao {

	void save(User user);
	
	User findById(int id);
	
	User findBySSO(String sso);
	List<User> findAll();
	
}

