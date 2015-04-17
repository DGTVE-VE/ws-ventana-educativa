package com.appspot.wsventanaeducativa.dao;

import java.util.List;
import java.util.Date;
import com.appspot.wsventanaeducativa.dao.dto.Institucion;
public interface InstitucionDAO{
	Institucion load(final Long id) throws Exception;

	public int delete(final Long id) throws Exception;

	public int update(final Institucion data) throws Exception;

	public long insert(final Institucion data) throws Exception;


	public List<Institucion> queryAll()throws Exception;



	public List<Institucion> queryByIdInstitucion(Long idInstitucion)throws Exception;
	public List<Institucion> queryByNombre(String nombre)throws Exception;
	public List<Institucion> queryByContacto(String contacto)throws Exception;
	public List<Institucion> queryByTelefono(String telefono)throws Exception;
	public List<Institucion> queryByCorreo(String correo)throws Exception;
	public List<Institucion> queryByAbreviatura(String abreviatura)throws Exception;
	public List<Institucion> queryByFechaCreacion(String fechaCreacion)throws Exception;
	public List<Institucion> queryByFechaModificacion(String fechaModificacion)throws Exception;

	}