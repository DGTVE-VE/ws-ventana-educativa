package com.appspot.wsventanaeducativa.dao;

import java.util.List;
import java.util.Date;
import com.appspot.wsventanaeducativa.dao.dto.Serie;
public interface SerieDAO{
	Serie load(final Long id) throws Exception;

	public int delete(final Long id) throws Exception;

	public int update(final Serie data) throws Exception;

	public long insert(final Serie data) throws Exception;


	public List<Serie> queryAll()throws Exception;



	public List<Serie> queryByIdSerie(Long idSerie)throws Exception;
	public List<Serie> queryByIdInstitucion(Long idInstitucion)throws Exception;
	public List<Serie> queryByTitulo(String titulo)throws Exception;
	public List<Serie> queryByDescripcion(String descripcion)throws Exception;
	public List<Serie> queryByThumbnail(String thumbnail)throws Exception;
	public List<Serie> queryByTag(String tag)throws Exception;
	public List<Serie> queryByTemporada(Long temporada)throws Exception;
	public List<Serie> queryByCalificacion(Long calificacion)throws Exception;
	public List<Serie> queryByVisible(Long visible)throws Exception;
	public List<Serie> queryByYoutubeListUrl(String youtubeListUrl)throws Exception;
	public List<Serie> queryByFechaCreacion(String fechaCreacion)throws Exception;
	public List<Serie> queryByFechaModificacion(String fechaModificacion)throws Exception;

	}