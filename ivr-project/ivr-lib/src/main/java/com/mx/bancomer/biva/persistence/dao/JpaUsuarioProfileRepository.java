package com.mx.bancomer.biva.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.bancomer.biva.domain.UserProfile;

public interface JpaUsuarioProfileRepository extends JpaRepository<UserProfile, Integer>{	
}
