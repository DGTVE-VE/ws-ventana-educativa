package com.appspot.wsventanaeducativa.dao;

import java.util.List;
import java.util.Date;
import com.appspot.wsventanaeducativa.dao.dto.Usuario;
public interface UsuarioDAO{
	Usuario load(final Long id) throws Exception;

	public int delete(final Long id) throws Exception;

	public int update(final Usuario data) throws Exception;

	public long insert(final Usuario data) throws Exception;


	public List<Usuario> queryAll()throws Exception;



	public List<Usuario> queryByIdUsuario(Long idUsuario)throws Exception;
	public List<Usuario> queryByNombre(String nombre)throws Exception;
	public List<Usuario> queryBySexo(String sexo)throws Exception;
	public List<Usuario> queryByNacimiento(Date nacimiento)throws Exception;
	public List<Usuario> queryByNacionalidad(String nacionalidad)throws Exception;
	public List<Usuario> queryByPai(String pai)throws Exception;
	public List<Usuario> queryByRegion(String region)throws Exception;
	public List<Usuario> queryByCiudad(String ciudad)throws Exception;
	public List<Usuario> queryByCorreo(String correo)throws Exception;
	public List<Usuario> queryByFacebook(String facebook)throws Exception;
	public List<Usuario> queryByGoogle(String google)throws Exception;
	public List<Usuario> queryByLive(String live)throws Exception;
	public List<Usuario> queryByTwitter(String twitter)throws Exception;
	public List<Usuario> queryByAvatar(String avatar)throws Exception;
	public List<Usuario> queryByBackground(String background)throws Exception;
	public List<Usuario> queryByFechaCreacion(String fechaCreacion)throws Exception;
	public List<Usuario> queryByFechaModificacion(String fechaModificacion)throws Exception;

	}