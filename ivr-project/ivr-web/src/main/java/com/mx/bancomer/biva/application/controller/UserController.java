package com.mx.bancomer.biva.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.mx.bancomer.biva.domain.User;
import com.mx.bancomer.biva.negocio.bo.UsuarioService;




@Controller
@RequestMapping("/user")
public class UserController {
	
	
	private static final String COMMAND="usuarioVO";
	private UsuarioService catUsuarioService;
	
	
	@Autowired	
	public UserController(UsuarioService catUsuarioService) {
		super();
		this.catUsuarioService = catUsuarioService;
	}

	@RequestMapping(value = "/get", method = RequestMethod.GET,produces="application/json")
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<User> findAll(){
		
		return catUsuarioService.getListUsuario();
	}
	
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET,produces="application/json")
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public User findById(@PathVariable("id") Integer id ){
		
		return catUsuarioService.findById(id);
	}
	
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public User  addUser(@RequestBody @Validated @ModelAttribute(COMMAND) User catUsuarioVO,BindingResult binding){
		
		 catUsuarioService.addUser(catUsuarioVO);
		 return catUsuarioVO;
	}


	
	
	

}
