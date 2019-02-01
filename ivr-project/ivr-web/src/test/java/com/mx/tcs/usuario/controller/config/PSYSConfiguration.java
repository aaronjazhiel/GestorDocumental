package com.mx.tcs.usuario.controller.config;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mx.bancomer.biva.negocio.bo.UsuarioService;
import com.mx.bancomer.biva.negocio.bo.impl.UsuarioServiceImpl;
import com.mx.bancomer.biva.persistence.dao.JpaUsuarioRepository;

@Configuration
public class PSYSConfiguration {
	@Bean(name="usuarioService")
	public UsuarioService getUsuarioService(){
		
		return Mockito.mock(UsuarioServiceImpl.class);
	}

	@Bean(name="usuarioRepository")
	public JpaUsuarioRepository getUsuarioRepository(){
		
		JpaUsuarioRepository usuarioRepository= Mockito.mock(JpaUsuarioRepository.class);
		
		return usuarioRepository;
		
	}
}
