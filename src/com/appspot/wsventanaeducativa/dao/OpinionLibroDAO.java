package com.appspot.wsventanaeducativa.dao;

import java.util.List;
import java.util.Date;
import com.appspot.wsventanaeducativa.dao.dto.OpinionLibro;
public interface OpinionLibroDAO{
	OpinionLibro load(final Long id) throws Exception;

	public int delete(final Long id) throws Exception;

	public int update(final OpinionLibro data) throws Exception;

	public long insert(final OpinionLibro data) throws Exception;


	public List<OpinionLibro> queryAll()throws Exception;



	public List<OpinionLibro> queryByIdLibro(Long idLibro)throws Exception;
	public List<OpinionLibro> queryByIdUsuario(Long idUsuario)throws Exception;
	public List<OpinionLibro> queryByOpinion(String opinion)throws Exception;
	public List<OpinionLibro> queryByCalificacion(Long calificacion)throws Exception;
	public List<OpinionLibro> queryByFechaCreacion(String fechaCreacion)throws Exception;
	public List<OpinionLibro> queryByFechaModificacion(String fechaModificacion)throws Exception;

	}