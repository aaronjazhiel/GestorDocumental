package com.mx.tcs.usuario.controller.junit;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.MockitoAnnotations.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mx.bancomer.biva.application.controller.UserController;
import com.mx.bancomer.biva.application.vo.CatUsuarioVO;
import com.mx.bancomer.biva.negocio.bo.UsuarioService;
import com.mx.tcs.usuario.controller.config.PSYSConfiguration;

@RunWith(MockitoJUnitRunner.class)
@ContextConfiguration(classes=PSYSConfiguration.class)
@WebAppConfiguration
public class EmployeeControlerTest {
	private MockMvc mockMvc;
	@InjectMocks
	private UserController controller;
	
	
	
	@Mock
	private UsuarioService usuarioService;
	
	
	
	
	@Before
	public void setup() {

	    MockitoAnnotations.initMocks(this);
	    this.mockMvc = MockMvcBuilders.standaloneSetup(controller).build();

	}
	@Test
	public void createCatUsuario() throws Exception{
		CatUsuarioVO usuariVO=new CatUsuarioVO();
		usuariVO.setAge(1);
		usuariVO.setNsUsuario("Yamil");
		usuariVO.setUsuarioId(1);
		
		ObjectMapper objectMapper = new ObjectMapper();
System.out.println(objectMapper.writeValueAsString(usuariVO));
		
		MvcResult mvcResult = mockMvc.perform(post("/employee/add")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(usuariVO)))
        .andExpect(status().isCreated())
        .andReturn();
		


		
		
		System.out.println(usuarioService.getListUsuario().size());
		
	}

}
