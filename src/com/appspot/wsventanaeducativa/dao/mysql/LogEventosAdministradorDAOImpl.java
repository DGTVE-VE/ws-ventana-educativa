package com.appspot.wsventanaeducativa.dao.mysql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Date;

import com.appspot.wsventanaeducativa.dao.dto.LogEventosAdministrador;
import com.appspot.wsventanaeducativa.dao.LogEventosAdministradorDAO;
import com.appspot.wsventanaeducativa.dao.sql.BaseDAO;
import com.appspot.wsventanaeducativa.dao.sql.DAOCache;
import com.appspot.wsventanaeducativa.dao.sql.PreparedStatementSetter;
import com.appspot.wsventanaeducativa.dao.sql.ResultSetExtractor;

public  class LogEventosAdministradorDAOImpl extends BaseDAO implements LogEventosAdministradorDAO{
	public static final DAOCache cache = new DAOCache();

	public DAOCache getCache() {
		return cache;
	}

	protected void clearCacheOnInsert(LogEventosAdministrador data){}

	public LogEventosAdministrador load(final Long id) throws Exception{
		String sql = "SELECT * FROM log_eventos_administrador WHERE id=?";
		return (LogEventosAdministrador) getRow(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, id);
			}
		}, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			LogEventosAdministrador row  = new LogEventosAdministrador();
				row.setIdLogEventosAdministrador(rs.getLong("id_log_eventos_administrador"));
				row.setIdAdministrador(rs.getLong("id_administrador"));
				row.setLog(rs.getString("log"));
				row.setTipoEvento(rs.getString("tipo_evento"));
				row.setDireccionIp(rs.getString("direccion_ip"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	public int delete(final Long id) throws Exception{
		//cache.clear(id);
		String sql = "DELETE FROM log_eventos_administrador WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, id);
			}
		});
	}

	public int update(final LogEventosAdministrador data) throws Exception{
		//cache.clear(data.getId());
		String sql = "UPDATE log_eventos_administrador SET id_administrador = ?, log = ?, tipo_evento = ?, direccion_ip = ?, fecha_creacion = ?, fecha_modificacion = ? WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, data.getIdAdministrador());
				ps.setString(2, data.getLog());
				ps.setString(3, data.getTipoEvento());
				ps.setString(4, data.getDireccionIp());
				ps.setString(5, data.getFechaCreacion());
				ps.setString(6, data.getFechaModificacion());
				ps.setLong(7, data.getIdLogEventosAdministrador());
			}
	});
	}

	public ResultSetExtractor getDefaultExtractor() throws Exception{
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			LogEventosAdministrador row  = new LogEventosAdministrador();
				row.setIdLogEventosAdministrador(rs.getLong("id_log_eventos_administrador"));
				row.setIdAdministrador(rs.getLong("id_administrador"));
				row.setLog(rs.getString("log"));
				row.setTipoEvento(rs.getString("tipo_evento"));
				row.setDireccionIp(rs.getString("direccion_ip"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public long insert(final LogEventosAdministrador data) throws Exception{
		clearCacheOnInsert(data);
		String sql = "INSERT INTO log_eventos_administrador ( id_administrador, log, tipo_evento, direccion_ip, fecha_creacion, fecha_modificacion) VALUES (?, ?, ?, ?, ?, ? )";
		long id = executeInsert(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, data.getIdAdministrador());
				ps.setString(2, data.getLog());
				ps.setString(3, data.getTipoEvento());
				ps.setString(4, data.getDireccionIp());
				ps.setString(5, data.getFechaCreacion());
				ps.setString(6, data.getFechaModificacion());
			}
		});
		data.setIdLogEventosAdministrador(id);
		return id;
	}

	public List<LogEventosAdministrador> queryAll()throws Exception{
		String sql = "SELECT * FROM log_eventos_administrador";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				LogEventosAdministrador row = new LogEventosAdministrador();
				row.setIdLogEventosAdministrador(rs.getLong("id_log_eventos_administrador"));
				row.setIdAdministrador(rs.getLong("id_administrador"));
				row.setLog(rs.getString("log"));
				row.setTipoEvento(rs.getString("tipo_evento"));
				row.setDireccionIp(rs.getString("direccion_ip"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	 public ResultSetExtractor getListResultSetExtractor(){
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				LogEventosAdministrador row = new LogEventosAdministrador();
				row.setIdLogEventosAdministrador(rs.getLong("id_log_eventos_administrador"));
				row.setIdAdministrador(rs.getLong("id_administrador"));
				row.setLog(rs.getString("log"));
				row.setTipoEvento(rs.getString("tipo_evento"));
				row.setDireccionIp(rs.getString("direccion_ip"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public List<LogEventosAdministrador> queryByIdLogEventosAdministrador(Long idLogEventosAdministrador)throws Exception{
		String sql = "SELECT * FROM log_eventos_administrador WHERE id_log_eventos_administrador='"+idLogEventosAdministrador+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				LogEventosAdministrador row = new LogEventosAdministrador();
				row.setIdLogEventosAdministrador(rs.getLong("id_log_eventos_administrador"));
				row.setIdAdministrador(rs.getLong("id_administrador"));
				row.setLog(rs.getString("log"));
				row.setTipoEvento(rs.getString("tipo_evento"));
				row.setDireccionIp(rs.getString("direccion_ip"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<LogEventosAdministrador> queryByIdAdministrador(Long idAdministrador)throws Exception{
		String sql = "SELECT * FROM log_eventos_administrador WHERE id_administrador='"+idAdministrador+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				LogEventosAdministrador row = new LogEventosAdministrador();
				row.setIdLogEventosAdministrador(rs.getLong("id_log_eventos_administrador"));
				row.setIdAdministrador(rs.getLong("id_administrador"));
				row.setLog(rs.getString("log"));
				row.setTipoEvento(rs.getString("tipo_evento"));
				row.setDireccionIp(rs.getString("direccion_ip"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<LogEventosAdministrador> queryByLog(String log)throws Exception{
		String sql = "SELECT * FROM log_eventos_administrador WHERE log='"+log+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				LogEventosAdministrador row = new LogEventosAdministrador();
				row.setIdLogEventosAdministrador(rs.getLong("id_log_eventos_administrador"));
				row.setIdAdministrador(rs.getLong("id_administrador"));
				row.setLog(rs.getString("log"));
				row.setTipoEvento(rs.getString("tipo_evento"));
				row.setDireccionIp(rs.getString("direccion_ip"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<LogEventosAdministrador> queryByTipoEvento(String tipoEvento)throws Exception{
		String sql = "SELECT * FROM log_eventos_administrador WHERE tipo_evento='"+tipoEvento+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				LogEventosAdministrador row = new LogEventosAdministrador();
				row.setIdLogEventosAdministrador(rs.getLong("id_log_eventos_administrador"));
				row.setIdAdministrador(rs.getLong("id_administrador"));
				row.setLog(rs.getString("log"));
				row.setTipoEvento(rs.getString("tipo_evento"));
				row.setDireccionIp(rs.getString("direccion_ip"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<LogEventosAdministrador> queryByDireccionIp(String direccionIp)throws Exception{
		String sql = "SELECT * FROM log_eventos_administrador WHERE direccion_ip='"+direccionIp+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				LogEventosAdministrador row = new LogEventosAdministrador();
				row.setIdLogEventosAdministrador(rs.getLong("id_log_eventos_administrador"));
				row.setIdAdministrador(rs.getLong("id_administrador"));
				row.setLog(rs.getString("log"));
				row.setTipoEvento(rs.getString("tipo_evento"));
				row.setDireccionIp(rs.getString("direccion_ip"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<LogEventosAdministrador> queryByFechaCreacion(String fechaCreacion)throws Exception{
		String sql = "SELECT * FROM log_eventos_administrador WHERE fecha_creacion='"+fechaCreacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				LogEventosAdministrador row = new LogEventosAdministrador();
				row.setIdLogEventosAdministrador(rs.getLong("id_log_eventos_administrador"));
				row.setIdAdministrador(rs.getLong("id_administrador"));
				row.setLog(rs.getString("log"));
				row.setTipoEvento(rs.getString("tipo_evento"));
				row.setDireccionIp(rs.getString("direccion_ip"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<LogEventosAdministrador> queryByFechaModificacion(String fechaModificacion)throws Exception{
		String sql = "SELECT * FROM log_eventos_administrador WHERE fecha_modificacion='"+fechaModificacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				LogEventosAdministrador row = new LogEventosAdministrador();
				row.setIdLogEventosAdministrador(rs.getLong("id_log_eventos_administrador"));
				row.setIdAdministrador(rs.getLong("id_administrador"));
				row.setLog(rs.getString("log"));
				row.setTipoEvento(rs.getString("tipo_evento"));
				row.setDireccionIp(rs.getString("direccion_ip"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	}