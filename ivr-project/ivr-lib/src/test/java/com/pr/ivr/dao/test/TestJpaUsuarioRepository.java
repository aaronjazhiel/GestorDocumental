package com.pr.ivr.dao.test;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.mx.bancomer.biva.domain.User;
import com.mx.bancomer.biva.persistence.dao.JpaUsuarioRepository;

@ContextConfiguration(locations={"classpath:application-config.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestJpaUsuarioRepository {
	
	@Autowired
	private JpaUsuarioRepository userRepository;
	
	
//	@Transactional
//	@Test
//	public void saveUserTest() {
//		User user=new User();
//	   user.set
//		userRepository.persist(user);
//	}
	
	@Transactional(readOnly=true)
	@Test
	public void findAllUser() {
		List<User> userList = userRepository.findAll();
		for(User users:userList){
			System.out.println("User Email :"+users.getEmail());
			System.out.println("User FirstName:"   +users.getFirstName());
			System.out.println("User LastName:"  +users.getLastName());
		}
	}

}
