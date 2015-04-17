package com.appspot.wsventanaeducativa.dao;

import java.util.List;
import java.util.Date;
import com.appspot.wsventanaeducativa.dao.dto.LogEventosUsuario;
public interface LogEventosUsuarioDAO{
	LogEventosUsuario load(final Long id) throws Exception;

	public int delete(final Long id) throws Exception;

	public int update(final LogEventosUsuario data) throws Exception;

	public long insert(final LogEventosUsuario data) throws Exception;


	public List<LogEventosUsuario> queryAll()throws Exception;



	public List<LogEventosUsuario> queryByIdLogEventosUsuario(Long idLogEventosUsuario)throws Exception;
	public List<LogEventosUsuario> queryByIdUsuario(Long idUsuario)throws Exception;
	public List<LogEventosUsuario> queryByLog(String log)throws Exception;
	public List<LogEventosUsuario> queryByTipoEvento(String tipoEvento)throws Exception;
	public List<LogEventosUsuario> queryByDireccionIp(String direccionIp)throws Exception;
	public List<LogEventosUsuario> queryByFechaCreacion(String fechaCreacion)throws Exception;
	public List<LogEventosUsuario> queryByFechaModificacion(String fechaModificacion)throws Exception;

	}