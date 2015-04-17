package com.appspot.wsventanaeducativa.dao.mysql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Date;

import com.appspot.wsventanaeducativa.dao.dto.OpinionSerie;
import com.appspot.wsventanaeducativa.dao.OpinionSerieDAO;
import com.appspot.wsventanaeducativa.dao.sql.BaseDAO;
import com.appspot.wsventanaeducativa.dao.sql.DAOCache;
import com.appspot.wsventanaeducativa.dao.sql.PreparedStatementSetter;
import com.appspot.wsventanaeducativa.dao.sql.ResultSetExtractor;

public  class OpinionSerieDAOImpl extends BaseDAO implements OpinionSerieDAO{
	public static final DAOCache cache = new DAOCache();

	public DAOCache getCache() {
		return cache;
	}

	protected void clearCacheOnInsert(OpinionSerie data){}

	public OpinionSerie load(final Long id) throws Exception{
		String sql = "SELECT * FROM opinion_serie WHERE id=?";
		return (OpinionSerie) getRow(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, id);
			}
		}, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			OpinionSerie row  = new OpinionSerie();
				row.setIdContenido(rs.getLong("id_contenido"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setOpinion(rs.getString("opinion"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	public int delete(final Long id) throws Exception{
		//cache.clear(id);
		String sql = "DELETE FROM opinion_serie WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, id);
			}
		});
	}

	public int update(final OpinionSerie data) throws Exception{
		//cache.clear(data.getId());
		String sql = "UPDATE opinion_serie SET id_usuario = ?, opinion = ?, calificacion = ?, fecha_creacion = ?, fecha_modificacion = ? WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, data.getIdUsuario());
				ps.setString(2, data.getOpinion());
				ps.setLong(3, data.getCalificacion());
				ps.setString(4, data.getFechaCreacion());
				ps.setString(5, data.getFechaModificacion());
				ps.setLong(6, data.getIdContenido());
			}
	});
	}

	public ResultSetExtractor getDefaultExtractor() throws Exception{
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			OpinionSerie row  = new OpinionSerie();
				row.setIdContenido(rs.getLong("id_contenido"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setOpinion(rs.getString("opinion"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public long insert(final OpinionSerie data) throws Exception{
		clearCacheOnInsert(data);
		String sql = "INSERT INTO opinion_serie ( id_usuario, opinion, calificacion, fecha_creacion, fecha_modificacion) VALUES (?, ?, ?, ?, ? )";
		long id = executeInsert(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, data.getIdUsuario());
				ps.setString(2, data.getOpinion());
				ps.setLong(3, data.getCalificacion());
				ps.setString(4, data.getFechaCreacion());
				ps.setString(5, data.getFechaModificacion());
			}
		});
		data.setIdContenido(id);
		return id;
	}

	public List<OpinionSerie> queryAll()throws Exception{
		String sql = "SELECT * FROM opinion_serie";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				OpinionSerie row = new OpinionSerie();
				row.setIdContenido(rs.getLong("id_contenido"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setOpinion(rs.getString("opinion"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	 public ResultSetExtractor getListResultSetExtractor(){
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				OpinionSerie row = new OpinionSerie();
				row.setIdContenido(rs.getLong("id_contenido"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setOpinion(rs.getString("opinion"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public List<OpinionSerie> queryByIdContenido(Long idContenido)throws Exception{
		String sql = "SELECT * FROM opinion_serie WHERE id_contenido='"+idContenido+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				OpinionSerie row = new OpinionSerie();
				row.setIdContenido(rs.getLong("id_contenido"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setOpinion(rs.getString("opinion"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<OpinionSerie> queryByIdUsuario(Long idUsuario)throws Exception{
		String sql = "SELECT * FROM opinion_serie WHERE id_usuario='"+idUsuario+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				OpinionSerie row = new OpinionSerie();
				row.setIdContenido(rs.getLong("id_contenido"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setOpinion(rs.getString("opinion"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<OpinionSerie> queryByOpinion(String opinion)throws Exception{
		String sql = "SELECT * FROM opinion_serie WHERE opinion='"+opinion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				OpinionSerie row = new OpinionSerie();
				row.setIdContenido(rs.getLong("id_contenido"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setOpinion(rs.getString("opinion"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<OpinionSerie> queryByCalificacion(Long calificacion)throws Exception{
		String sql = "SELECT * FROM opinion_serie WHERE calificacion='"+calificacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				OpinionSerie row = new OpinionSerie();
				row.setIdContenido(rs.getLong("id_contenido"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setOpinion(rs.getString("opinion"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<OpinionSerie> queryByFechaCreacion(String fechaCreacion)throws Exception{
		String sql = "SELECT * FROM opinion_serie WHERE fecha_creacion='"+fechaCreacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				OpinionSerie row = new OpinionSerie();
				row.setIdContenido(rs.getLong("id_contenido"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setOpinion(rs.getString("opinion"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<OpinionSerie> queryByFechaModificacion(String fechaModificacion)throws Exception{
		String sql = "SELECT * FROM opinion_serie WHERE fecha_modificacion='"+fechaModificacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				OpinionSerie row = new OpinionSerie();
				row.setIdContenido(rs.getLong("id_contenido"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setOpinion(rs.getString("opinion"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	}