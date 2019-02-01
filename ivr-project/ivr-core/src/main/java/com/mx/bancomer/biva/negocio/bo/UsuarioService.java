package com.mx.bancomer.biva.negocio.bo;
import java.util.List;

import com.mx.bancomer.biva.application.vo.CatUsuarioVO;
import com.mx.bancomer.biva.domain.User;

public interface UsuarioService {

	
	/**
	 *  @category Service 
	 *  @return
	 */
	public List<User> getListUsuario();

	/**
	 * @param user
	 * @return
	 */
	public User addUser(User user);
	
	/**
	 * @param id
	 * @return
	 */
	public User findById(Integer id);
}
