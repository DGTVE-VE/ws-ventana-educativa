package com.appspot.wsventanaeducativa.dao;

import java.util.List;
import java.util.Date;
import com.appspot.wsventanaeducativa.dao.dto.Categoria;
public interface CategoriaDAO{
	Categoria load(final String id) throws Exception;

	public int delete(final String id) throws Exception;

	public int update(final Categoria data) throws Exception;

	public long insert(final Categoria data) throws Exception;


	public List<Categoria> queryAll()throws Exception;



	public List<Categoria> queryByCategoria(String categoria)throws Exception;
	public List<Categoria> queryByDescripcion(String descripcion)throws Exception;
	public List<Categoria> queryByCategoriaPadre(String categoriaPadre)throws Exception;
	public List<Categoria> queryByFechaCreacion(String fechaCreacion)throws Exception;
	public List<Categoria> queryByFechaModificacion(String fechaModificacion)throws Exception;

	}