package com.appspot.wsventanaeducativa.dao;

import java.util.List;
import java.util.Date;
import com.appspot.wsventanaeducativa.dao.dto.TipoPantalla;
public interface TipoPantallaDAO{
	TipoPantalla load(final String id) throws Exception;

	public int delete(final String id) throws Exception;

	public int update(final TipoPantalla data) throws Exception;

	public long insert(final TipoPantalla data) throws Exception;


	public List<TipoPantalla> queryAll()throws Exception;



	public List<TipoPantalla> queryByTipoPantalla(String tipoPantalla)throws Exception;
	public List<TipoPantalla> queryByDescripcion(String descripcion)throws Exception;
	public List<TipoPantalla> queryByFechaCreacion(String fechaCreacion)throws Exception;
	public List<TipoPantalla> queryByFechaModificacion(String fechaModificacion)throws Exception;

	}