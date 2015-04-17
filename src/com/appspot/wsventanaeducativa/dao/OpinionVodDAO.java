package com.appspot.wsventanaeducativa.dao;

import java.util.List;
import java.util.Date;
import com.appspot.wsventanaeducativa.dao.dto.OpinionVod;
public interface OpinionVodDAO{
	OpinionVod load(final Long id) throws Exception;

	public int delete(final Long id) throws Exception;

	public int update(final OpinionVod data) throws Exception;

	public long insert(final OpinionVod data) throws Exception;


	public List<OpinionVod> queryAll()throws Exception;



	public List<OpinionVod> queryByUsuarioIdUsuario(Long usuarioIdUsuario)throws Exception;
	public List<OpinionVod> queryByVodIdVod(Long vodIdVod)throws Exception;
	public List<OpinionVod> queryByOpinion(String opinion)throws Exception;
	public List<OpinionVod> queryByCalificacion(Long calificacion)throws Exception;
	public List<OpinionVod> queryByFechaCreacion(String fechaCreacion)throws Exception;
	public List<OpinionVod> queryByFechaModificacion(String fechaModificacion)throws Exception;

	}