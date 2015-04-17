package com.appspot.wsventanaeducativa.dao;

import java.util.List;
import java.util.Date;
import com.appspot.wsventanaeducativa.dao.dto.LogEventosAdministrador;
public interface LogEventosAdministradorDAO{
	LogEventosAdministrador load(final Long id) throws Exception;

	public int delete(final Long id) throws Exception;

	public int update(final LogEventosAdministrador data) throws Exception;

	public long insert(final LogEventosAdministrador data) throws Exception;


	public List<LogEventosAdministrador> queryAll()throws Exception;



	public List<LogEventosAdministrador> queryByIdLogEventosAdministrador(Long idLogEventosAdministrador)throws Exception;
	public List<LogEventosAdministrador> queryByIdAdministrador(Long idAdministrador)throws Exception;
	public List<LogEventosAdministrador> queryByLog(String log)throws Exception;
	public List<LogEventosAdministrador> queryByTipoEvento(String tipoEvento)throws Exception;
	public List<LogEventosAdministrador> queryByDireccionIp(String direccionIp)throws Exception;
	public List<LogEventosAdministrador> queryByFechaCreacion(String fechaCreacion)throws Exception;
	public List<LogEventosAdministrador> queryByFechaModificacion(String fechaModificacion)throws Exception;

	}