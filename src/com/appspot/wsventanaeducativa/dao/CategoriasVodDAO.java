package com.appspot.wsventanaeducativa.dao;

import java.util.List;
import java.util.Date;
import com.appspot.wsventanaeducativa.dao.dto.CategoriasVod;
public interface CategoriasVodDAO{
	CategoriasVod load(final String id) throws Exception;

	public int delete(final String id) throws Exception;

	public int update(final CategoriasVod data) throws Exception;

	public long insert(final CategoriasVod data) throws Exception;


	public List<CategoriasVod> queryAll()throws Exception;



	public List<CategoriasVod> queryByCategoriasCategoria(String categoriasCategoria)throws Exception;
	public List<CategoriasVod> queryByVodIdVod(Long vodIdVod)throws Exception;
	public List<CategoriasVod> queryByFechaCreacion(String fechaCreacion)throws Exception;
	public List<CategoriasVod> queryByFechaModificacion(String fechaModificacion)throws Exception;

	}