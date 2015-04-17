package com.appspot.wsventanaeducativa.dao;

import java.util.List;
import java.util.Date;
import com.appspot.wsventanaeducativa.dao.dto.LogErrore;
public interface LogErroreDAO{
	LogErrore load(final Long id) throws Exception;

	public int delete(final Long id) throws Exception;

	public int update(final LogErrore data) throws Exception;

	public long insert(final LogErrore data) throws Exception;


	public List<LogErrore> queryAll()throws Exception;



	public List<LogErrore> queryByIdLogError(Long idLogError)throws Exception;
	public List<LogErrore> queryByLog(String log)throws Exception;
	public List<LogErrore> queryByTipoError(String tipoError)throws Exception;
	public List<LogErrore> queryByFechaCreacion(String fechaCreacion)throws Exception;
	public List<LogErrore> queryByFechaModificacion(String fechaModificacion)throws Exception;

	}