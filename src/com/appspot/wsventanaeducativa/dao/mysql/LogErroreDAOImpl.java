package com.appspot.wsventanaeducativa.dao.mysql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Date;

import com.appspot.wsventanaeducativa.dao.dto.LogErrore;
import com.appspot.wsventanaeducativa.dao.LogErroreDAO;
import com.appspot.wsventanaeducativa.dao.sql.BaseDAO;
import com.appspot.wsventanaeducativa.dao.sql.DAOCache;
import com.appspot.wsventanaeducativa.dao.sql.PreparedStatementSetter;
import com.appspot.wsventanaeducativa.dao.sql.ResultSetExtractor;

public  class LogErroreDAOImpl extends BaseDAO implements LogErroreDAO{
	public static final DAOCache cache = new DAOCache();

	public DAOCache getCache() {
		return cache;
	}

	protected void clearCacheOnInsert(LogErrore data){}

	public LogErrore load(final Long id) throws Exception{
		String sql = "SELECT * FROM log_errores WHERE id=?";
		return (LogErrore) getRow(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, id);
			}
		}, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			LogErrore row  = new LogErrore();
				row.setIdLogError(rs.getLong("id_log_error"));
				row.setLog(rs.getString("log"));
				row.setTipoError(rs.getString("tipo_error"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	public int delete(final Long id) throws Exception{
		//cache.clear(id);
		String sql = "DELETE FROM log_errores WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, id);
			}
		});
	}

	public int update(final LogErrore data) throws Exception{
		//cache.clear(data.getId());
		String sql = "UPDATE log_errores SET log = ?, tipo_error = ?, fecha_creacion = ?, fecha_modificacion = ? WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setString(1, data.getLog());
				ps.setString(2, data.getTipoError());
				ps.setString(3, data.getFechaCreacion());
				ps.setString(4, data.getFechaModificacion());
				ps.setLong(5, data.getIdLogError());
			}
	});
	}

	public ResultSetExtractor getDefaultExtractor() throws Exception{
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			LogErrore row  = new LogErrore();
				row.setIdLogError(rs.getLong("id_log_error"));
				row.setLog(rs.getString("log"));
				row.setTipoError(rs.getString("tipo_error"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public long insert(final LogErrore data) throws Exception{
		clearCacheOnInsert(data);
		String sql = "INSERT INTO log_errores ( log, tipo_error, fecha_creacion, fecha_modificacion) VALUES (?, ?, ?, ? )";
		long id = executeInsert(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setString(1, data.getLog());
				ps.setString(2, data.getTipoError());
				ps.setString(3, data.getFechaCreacion());
				ps.setString(4, data.getFechaModificacion());
			}
		});
		data.setIdLogError(id);
		return id;
	}

	public List<LogErrore> queryAll()throws Exception{
		String sql = "SELECT * FROM log_errores";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				LogErrore row = new LogErrore();
				row.setIdLogError(rs.getLong("id_log_error"));
				row.setLog(rs.getString("log"));
				row.setTipoError(rs.getString("tipo_error"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	 public ResultSetExtractor getListResultSetExtractor(){
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				LogErrore row = new LogErrore();
				row.setIdLogError(rs.getLong("id_log_error"));
				row.setLog(rs.getString("log"));
				row.setTipoError(rs.getString("tipo_error"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public List<LogErrore> queryByIdLogError(Long idLogError)throws Exception{
		String sql = "SELECT * FROM log_errores WHERE id_log_error='"+idLogError+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				LogErrore row = new LogErrore();
				row.setIdLogError(rs.getLong("id_log_error"));
				row.setLog(rs.getString("log"));
				row.setTipoError(rs.getString("tipo_error"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<LogErrore> queryByLog(String log)throws Exception{
		String sql = "SELECT * FROM log_errores WHERE log='"+log+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				LogErrore row = new LogErrore();
				row.setIdLogError(rs.getLong("id_log_error"));
				row.setLog(rs.getString("log"));
				row.setTipoError(rs.getString("tipo_error"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<LogErrore> queryByTipoError(String tipoError)throws Exception{
		String sql = "SELECT * FROM log_errores WHERE tipo_error='"+tipoError+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				LogErrore row = new LogErrore();
				row.setIdLogError(rs.getLong("id_log_error"));
				row.setLog(rs.getString("log"));
				row.setTipoError(rs.getString("tipo_error"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<LogErrore> queryByFechaCreacion(String fechaCreacion)throws Exception{
		String sql = "SELECT * FROM log_errores WHERE fecha_creacion='"+fechaCreacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				LogErrore row = new LogErrore();
				row.setIdLogError(rs.getLong("id_log_error"));
				row.setLog(rs.getString("log"));
				row.setTipoError(rs.getString("tipo_error"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<LogErrore> queryByFechaModificacion(String fechaModificacion)throws Exception{
		String sql = "SELECT * FROM log_errores WHERE fecha_modificacion='"+fechaModificacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				LogErrore row = new LogErrore();
				row.setIdLogError(rs.getLong("id_log_error"));
				row.setLog(rs.getString("log"));
				row.setTipoError(rs.getString("tipo_error"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	}