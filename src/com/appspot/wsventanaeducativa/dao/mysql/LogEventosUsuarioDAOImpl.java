package com.appspot.wsventanaeducativa.dao.mysql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Date;

import com.appspot.wsventanaeducativa.dao.dto.LogEventosUsuario;
import com.appspot.wsventanaeducativa.dao.LogEventosUsuarioDAO;
import com.appspot.wsventanaeducativa.dao.sql.BaseDAO;
import com.appspot.wsventanaeducativa.dao.sql.DAOCache;
import com.appspot.wsventanaeducativa.dao.sql.PreparedStatementSetter;
import com.appspot.wsventanaeducativa.dao.sql.ResultSetExtractor;

public  class LogEventosUsuarioDAOImpl extends BaseDAO implements LogEventosUsuarioDAO{
	public static final DAOCache cache = new DAOCache();

	public DAOCache getCache() {
		return cache;
	}

	protected void clearCacheOnInsert(LogEventosUsuario data){}

	public LogEventosUsuario load(final Long id) throws Exception{
		String sql = "SELECT * FROM log_eventos_usuario WHERE id=?";
		return (LogEventosUsuario) getRow(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, id);
			}
		}, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			LogEventosUsuario row  = new LogEventosUsuario();
				row.setIdLogEventosUsuario(rs.getLong("id_log_eventos_usuario"));
				row.setIdUsuario(rs.getLong("id_usuario"));
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
		String sql = "DELETE FROM log_eventos_usuario WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, id);
			}
		});
	}

	public int update(final LogEventosUsuario data) throws Exception{
		//cache.clear(data.getId());
		String sql = "UPDATE log_eventos_usuario SET id_usuario = ?, log = ?, tipo_evento = ?, direccion_ip = ?, fecha_creacion = ?, fecha_modificacion = ? WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, data.getIdUsuario());
				ps.setString(2, data.getLog());
				ps.setString(3, data.getTipoEvento());
				ps.setString(4, data.getDireccionIp());
				ps.setString(5, data.getFechaCreacion());
				ps.setString(6, data.getFechaModificacion());
				ps.setLong(7, data.getIdLogEventosUsuario());
			}
	});
	}

	public ResultSetExtractor getDefaultExtractor() throws Exception{
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			LogEventosUsuario row  = new LogEventosUsuario();
				row.setIdLogEventosUsuario(rs.getLong("id_log_eventos_usuario"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setLog(rs.getString("log"));
				row.setTipoEvento(rs.getString("tipo_evento"));
				row.setDireccionIp(rs.getString("direccion_ip"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public long insert(final LogEventosUsuario data) throws Exception{
		clearCacheOnInsert(data);
		String sql = "INSERT INTO log_eventos_usuario ( id_usuario, log, tipo_evento, direccion_ip, fecha_creacion, fecha_modificacion) VALUES (?, ?, ?, ?, ?, ? )";
		long id = executeInsert(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, data.getIdUsuario());
				ps.setString(2, data.getLog());
				ps.setString(3, data.getTipoEvento());
				ps.setString(4, data.getDireccionIp());
				ps.setString(5, data.getFechaCreacion());
				ps.setString(6, data.getFechaModificacion());
			}
		});
		data.setIdLogEventosUsuario(id);
		return id;
	}

	public List<LogEventosUsuario> queryAll()throws Exception{
		String sql = "SELECT * FROM log_eventos_usuario";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				LogEventosUsuario row = new LogEventosUsuario();
				row.setIdLogEventosUsuario(rs.getLong("id_log_eventos_usuario"));
				row.setIdUsuario(rs.getLong("id_usuario"));
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
				LogEventosUsuario row = new LogEventosUsuario();
				row.setIdLogEventosUsuario(rs.getLong("id_log_eventos_usuario"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setLog(rs.getString("log"));
				row.setTipoEvento(rs.getString("tipo_evento"));
				row.setDireccionIp(rs.getString("direccion_ip"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public List<LogEventosUsuario> queryByIdLogEventosUsuario(Long idLogEventosUsuario)throws Exception{
		String sql = "SELECT * FROM log_eventos_usuario WHERE id_log_eventos_usuario='"+idLogEventosUsuario+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				LogEventosUsuario row = new LogEventosUsuario();
				row.setIdLogEventosUsuario(rs.getLong("id_log_eventos_usuario"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setLog(rs.getString("log"));
				row.setTipoEvento(rs.getString("tipo_evento"));
				row.setDireccionIp(rs.getString("direccion_ip"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<LogEventosUsuario> queryByIdUsuario(Long idUsuario)throws Exception{
		String sql = "SELECT * FROM log_eventos_usuario WHERE id_usuario='"+idUsuario+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				LogEventosUsuario row = new LogEventosUsuario();
				row.setIdLogEventosUsuario(rs.getLong("id_log_eventos_usuario"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setLog(rs.getString("log"));
				row.setTipoEvento(rs.getString("tipo_evento"));
				row.setDireccionIp(rs.getString("direccion_ip"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<LogEventosUsuario> queryByLog(String log)throws Exception{
		String sql = "SELECT * FROM log_eventos_usuario WHERE log='"+log+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				LogEventosUsuario row = new LogEventosUsuario();
				row.setIdLogEventosUsuario(rs.getLong("id_log_eventos_usuario"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setLog(rs.getString("log"));
				row.setTipoEvento(rs.getString("tipo_evento"));
				row.setDireccionIp(rs.getString("direccion_ip"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<LogEventosUsuario> queryByTipoEvento(String tipoEvento)throws Exception{
		String sql = "SELECT * FROM log_eventos_usuario WHERE tipo_evento='"+tipoEvento+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				LogEventosUsuario row = new LogEventosUsuario();
				row.setIdLogEventosUsuario(rs.getLong("id_log_eventos_usuario"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setLog(rs.getString("log"));
				row.setTipoEvento(rs.getString("tipo_evento"));
				row.setDireccionIp(rs.getString("direccion_ip"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<LogEventosUsuario> queryByDireccionIp(String direccionIp)throws Exception{
		String sql = "SELECT * FROM log_eventos_usuario WHERE direccion_ip='"+direccionIp+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				LogEventosUsuario row = new LogEventosUsuario();
				row.setIdLogEventosUsuario(rs.getLong("id_log_eventos_usuario"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setLog(rs.getString("log"));
				row.setTipoEvento(rs.getString("tipo_evento"));
				row.setDireccionIp(rs.getString("direccion_ip"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<LogEventosUsuario> queryByFechaCreacion(String fechaCreacion)throws Exception{
		String sql = "SELECT * FROM log_eventos_usuario WHERE fecha_creacion='"+fechaCreacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				LogEventosUsuario row = new LogEventosUsuario();
				row.setIdLogEventosUsuario(rs.getLong("id_log_eventos_usuario"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setLog(rs.getString("log"));
				row.setTipoEvento(rs.getString("tipo_evento"));
				row.setDireccionIp(rs.getString("direccion_ip"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<LogEventosUsuario> queryByFechaModificacion(String fechaModificacion)throws Exception{
		String sql = "SELECT * FROM log_eventos_usuario WHERE fecha_modificacion='"+fechaModificacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				LogEventosUsuario row = new LogEventosUsuario();
				row.setIdLogEventosUsuario(rs.getLong("id_log_eventos_usuario"));
				row.setIdUsuario(rs.getLong("id_usuario"));
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