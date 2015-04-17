package com.appspot.wsventanaeducativa.dao;

import java.util.List;
import java.util.Date;
import com.appspot.wsventanaeducativa.dao.dto.UsuarioEscuela;
public interface UsuarioEscuelaDAO{
	UsuarioEscuela load(final Long id) throws Exception;

	public int delete(final Long id) throws Exception;

	public int update(final UsuarioEscuela data) throws Exception;

	public long insert(final UsuarioEscuela data) throws Exception;


	public List<UsuarioEscuela> queryAll()throws Exception;



	public List<UsuarioEscuela> queryByIdUsuario(Long idUsuario)throws Exception;
	public List<UsuarioEscuela> queryByIdEscuela(Long idEscuela)throws Exception;
	public List<UsuarioEscuela> queryByInicio(Date inicio)throws Exception;
	public List<UsuarioEscuela> queryByFin(Date fin)throws Exception;
	public List<UsuarioEscuela> queryByCursaActualmente(Long cursaActualmente)throws Exception;
	public List<UsuarioEscuela> queryByTitulo(String titulo)throws Exception;
	public List<UsuarioEscuela> queryByFechaCreacionl(String fechaCreacionl)throws Exception;
	public List<UsuarioEscuela> queryByFechaModificacion(String fechaModificacion)throws Exception;

	}