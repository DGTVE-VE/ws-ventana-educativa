package com.appspot.wsventanaeducativa.dao;

import java.util.List;
import java.util.Date;
import com.appspot.wsventanaeducativa.dao.dto.SerieCategoria;
public interface SerieCategoriaDAO{
	SerieCategoria load(final Long id) throws Exception;

	public int delete(final Long id) throws Exception;

	public int update(final SerieCategoria data) throws Exception;

	public long insert(final SerieCategoria data) throws Exception;


	public List<SerieCategoria> queryAll()throws Exception;



	public List<SerieCategoria> queryByIdSerie(Long idSerie)throws Exception;
	public List<SerieCategoria> queryByCategoria(String categoria)throws Exception;
	public List<SerieCategoria> queryByFechaCreacion(String fechaCreacion)throws Exception;
	public List<SerieCategoria> queryByFechaModificacion(String fechaModificacion)throws Exception;

	}