package com.mx.bancomer.biva.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.mx.bancomer.biva.domain.User;

public interface JpaUsuarioRepository extends JpaRepository<User, Integer>{	
}
