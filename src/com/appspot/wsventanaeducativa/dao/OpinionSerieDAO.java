package com.appspot.wsventanaeducativa.dao;

import java.util.List;
import java.util.Date;
import com.appspot.wsventanaeducativa.dao.dto.OpinionSerie;
public interface OpinionSerieDAO{
	OpinionSerie load(final Long id) throws Exception;

	public int delete(final Long id) throws Exception;

	public int update(final OpinionSerie data) throws Exception;

	public long insert(final OpinionSerie data) throws Exception;


	public List<OpinionSerie> queryAll()throws Exception;



	public List<OpinionSerie> queryByIdContenido(Long idContenido)throws Exception;
	public List<OpinionSerie> queryByIdUsuario(Long idUsuario)throws Exception;
	public List<OpinionSerie> queryByOpinion(String opinion)throws Exception;
	public List<OpinionSerie> queryByCalificacion(Long calificacion)throws Exception;
	public List<OpinionSerie> queryByFechaCreacion(String fechaCreacion)throws Exception;
	public List<OpinionSerie> queryByFechaModificacion(String fechaModificacion)throws Exception;

	}