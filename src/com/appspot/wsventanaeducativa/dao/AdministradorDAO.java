package com.appspot.wsventanaeducativa.dao;

import java.util.List;
import java.util.Date;
import com.appspot.wsventanaeducativa.dao.dto.Administrador;
public interface AdministradorDAO{
	Administrador load(final Long id) throws Exception;

	public int delete(final Long id) throws Exception;

	public int update(final Administrador data) throws Exception;

	public long insert(final Administrador data) throws Exception;


	public List<Administrador> queryAll()throws Exception;



	public List<Administrador> queryByIdAdministrador(Long idAdministrador)throws Exception;
	public List<Administrador> queryByNombre(String nombre)throws Exception;
	public List<Administrador> queryByCorreo(String correo)throws Exception;
	public List<Administrador> queryByTelefono(String telefono)throws Exception;
	public List<Administrador> queryByCargo(String cargo)throws Exception;
	public List<Administrador> queryByDependencia(String dependencia)throws Exception;
	public List<Administrador> queryByPassword(String password)throws Exception;
	public List<Administrador> queryByIdInstitucion(Long idInstitucion)throws Exception;
	public List<Administrador> queryBySuperadministrador(Long superadministrador)throws Exception;
	public List<Administrador> queryByFechaCreacion(String fechaCreacion)throws Exception;
	public List<Administrador> queryByFechaModificacion(String fechaModificacion)throws Exception;

	}