package com.mx.bancomer.biva.negocio.bo.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.bancomer.biva.application.vo.CatUsuarioVO;
import com.mx.bancomer.biva.domain.User;
import com.mx.bancomer.biva.negocio.bo.UsuarioService;
import com.mx.bancomer.biva.persistence.dao.JpaUsuarioRepository;
import com.mx.bancomer.biva.util.TypeCast;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private JpaUsuarioRepository usuarioDAO;

	@Transactional(readOnly=true)
	@Override
	public List<User> getListUsuario() {

		List<User> userList = usuarioDAO.findAll();

		
		return userList;
	}

	@Transactional
	@Override
	public User addUser(User userEntity) {

		usuarioDAO.save(userEntity);
		return userEntity;
	}
	@Transactional
	@Override
	public User findById(Integer id) {
		
		User usuer = usuarioDAO.findOne(id);
		
		return usuer;
	}

}
