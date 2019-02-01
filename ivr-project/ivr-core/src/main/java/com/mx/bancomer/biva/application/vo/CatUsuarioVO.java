
package com.mx.bancomer.biva.application.vo;

import javax.validation.constraints.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * An item in an order
 */
@XmlRootElement(name="Usuario",namespace="http://com.evertect/usuario")
public class CatUsuarioVO {
	
	
	private Integer usuarioId;
	private String nsUsuario;
	private Integer age;

	@NotNull
	@Digits( integer=10, fraction = 0)
	public Integer getUsuarioId() {
		return usuarioId;
	}

  
	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
	}
   
	@NotNull
	public String getNsUsuario() {
		return nsUsuario;
	}


	public void setNsUsuario(String nsUsuario) {
		this.nsUsuario = nsUsuario;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public CatUsuarioVO() {
		super();
	}


	public CatUsuarioVO(Integer usuarioId, String nsUsuario, Integer age) {
		super();
		this.usuarioId = usuarioId;
		this.nsUsuario = nsUsuario;
		this.age = age;
	}


	
}
