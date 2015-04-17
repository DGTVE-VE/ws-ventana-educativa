package com.appspot.wsventanaeducativa.dao;

import java.util.List;
import java.util.Date;
import com.appspot.wsventanaeducativa.dao.dto.Escuela;
public interface EscuelaDAO{
	Escuela load(final Long id) throws Exception;

	public int delete(final Long id) throws Exception;

	public int update(final Escuela data) throws Exception;

	public long insert(final Escuela data) throws Exception;


	public List<Escuela> queryAll()throws Exception;



	public List<Escuela> queryByIdEscuela(Long idEscuela)throws Exception;
	public List<Escuela> queryByNombre(String nombre)throws Exception;
	public List<Escuela> queryByDireccion(String direccion)throws Exception;
	public List<Escuela> queryByColonia(String colonia)throws Exception;
	public List<Escuela> queryByMunicipio(String municipio)throws Exception;
	public List<Escuela> queryByEstado(String estado)throws Exception;
	public List<Escuela> queryByCodigoPostal(String codigoPostal)throws Exception;
	public List<Escuela> queryByClave(String clave)throws Exception;
	public List<Escuela> queryByPrivada(Long privada)throws Exception;
	public List<Escuela> queryByNivel(String nivel)throws Exception;
	public List<Escuela> queryByInstitucion(String institucion)throws Exception;
	public List<Escuela> queryByFechaCreacion(String fechaCreacion)throws Exception;
	public List<Escuela> queryByFechaModificacion(String fechaModificacion)throws Exception;

	}