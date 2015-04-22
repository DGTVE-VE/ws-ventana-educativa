package com.appspot.wsventanaeducativa.dao;

import java.util.List;
import java.util.Date;

import com.appspot.wsventanaeducativa.dao.dto.Vod;
public interface VodDAO{
	Vod load(final Long id) throws Exception;

	public int delete(final Long id) throws Exception;

	public int update(final Vod data) throws Exception;

	public long insert(final Vod data) throws Exception;


	public List<Vod> queryAll()throws Exception;



	public List<Vod> queryByIdVod(Long idVod)throws Exception;
	public List<Vod> queryByIdInstitucion(Long idInstitucion)throws Exception;
	public List<Vod> queryByAutor(String autor)throws Exception;
	public List<Vod> queryByProductor(String productor)throws Exception;
	public List<Vod> queryByDerechoAutor(String derechoAutor)throws Exception;
	public List<Vod> queryBySerie(String serie)throws Exception;
	public List<Vod> queryByTitulo(String titulo)throws Exception;
	public List<Vod> queryBySubserie(String subserie)throws Exception;
	public List<Vod> queryBySubtitulo(String subtitulo)throws Exception;
	public List<Vod> queryByTituloTraducido(String tituloTraducido)throws Exception;
	public List<Vod> queryByClaveIdentificacion(String claveIdentificacion)throws Exception;
	public List<Vod> queryByNumeroObra(Long numeroObra)throws Exception;
	public List<Vod> queryByNumeroSerie(Long numeroSerie)throws Exception;
	public List<Vod> queryByFormato(String formato)throws Exception;
	public List<Vod> queryByNnnov(String nnnov)throws Exception;
	public List<Vod> queryByCredito(String credito)throws Exception;
	public List<Vod> queryByLugarProduccion(String lugarProduccion)throws Exception;
	public List<Vod> queryByTema(String tema)throws Exception;
	public List<Vod> queryBySinopsi(String sinopsi)throws Exception;
	public List<Vod> queryByDuracion(String duracion)throws Exception;
	public List<Vod> queryByAnioProduccion(String anioProduccion)throws Exception;
	public List<Vod> queryByIdioma(String idioma)throws Exception;
	public List<Vod> queryByVersione(String versione)throws Exception;
	public List<Vod> queryBySistemaGrabacion(String sistemaGrabacion)throws Exception;
	public List<Vod> queryByColor(String color)throws Exception;
	public List<Vod> queryBySonido(String sonido)throws Exception;
	public List<Vod> queryByDisponibilidad(String disponibilidad)throws Exception;
	public List<Vod> queryByObservacione(String observacione)throws Exception;
	public List<Vod> queryByDisponibleHasta(Date disponibleHasta)throws Exception;
	public List<Vod> queryByEpisodio(Long episodio)throws Exception;
	public List<Vod> queryByTemporada(Long temporada)throws Exception;
	public List<Vod> queryByCalificacion(Long calificacion)throws Exception;
	public List<Vod> queryByTag(String tag)throws Exception;
	public List<Vod> queryByIdSerie(Long idSerie)throws Exception;
	public List<Vod> queryByUrl(String url)throws Exception;
	public List<Vod> queryByThumbnail(String thumbnail)throws Exception;
	public List<Vod> queryByVisible(Long visible)throws Exception;
	public List<Vod> queryByYoutubeListId(String youtubeListId)throws Exception;
	public List<Vod> queryByYoutubeId(String youtubeId)throws Exception;
	public List<Vod> queryByFechaCreacion(String fechaCreacion)throws Exception;
	public List<Vod> queryByFechaModificacion(String fechaModificacion)throws Exception;

	}