package com.appspot.wsventanaeducativa.dao.mysql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Date;

import com.appspot.wsventanaeducativa.dao.dto.OpinionLibro;
import com.appspot.wsventanaeducativa.dao.OpinionLibroDAO;
import com.appspot.wsventanaeducativa.dao.sql.BaseDAO;
import com.appspot.wsventanaeducativa.dao.sql.DAOCache;
import com.appspot.wsventanaeducativa.dao.sql.PreparedStatementSetter;
import com.appspot.wsventanaeducativa.dao.sql.ResultSetExtractor;

public  class OpinionLibroDAOImpl extends BaseDAO implements OpinionLibroDAO{
	public static final DAOCache cache = new DAOCache();

	public DAOCache getCache() {
		return cache;
	}

	protected void clearCacheOnInsert(OpinionLibro data){}

	public OpinionLibro load(final Long id) throws Exception{
		String sql = "SELECT * FROM opinion_libro WHERE id=?";
		return (OpinionLibro) getRow(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, id);
			}
		}, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			OpinionLibro row  = new OpinionLibro();
				row.setIdLibro(rs.getLong("id_libro"));
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
		String sql = "DELETE FROM opinion_libro WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, id);
			}
		});
	}

	public int update(final OpinionLibro data) throws Exception{
		//cache.clear(data.getId());
		String sql = "UPDATE opinion_libro SET id_usuario = ?, opinion = ?, calificacion = ?, fecha_creacion = ?, fecha_modificacion = ? WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, data.getIdUsuario());
				ps.setString(2, data.getOpinion());
				ps.setLong(3, data.getCalificacion());
				ps.setString(4, data.getFechaCreacion());
				ps.setString(5, data.getFechaModificacion());
				ps.setLong(6, data.getIdLibro());
			}
	});
	}

	public ResultSetExtractor getDefaultExtractor() throws Exception{
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			OpinionLibro row  = new OpinionLibro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setOpinion(rs.getString("opinion"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public long insert(final OpinionLibro data) throws Exception{
		clearCacheOnInsert(data);
		String sql = "INSERT INTO opinion_libro ( id_usuario, opinion, calificacion, fecha_creacion, fecha_modificacion) VALUES (?, ?, ?, ?, ? )";
		long id = executeInsert(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, data.getIdUsuario());
				ps.setString(2, data.getOpinion());
				ps.setLong(3, data.getCalificacion());
				ps.setString(4, data.getFechaCreacion());
				ps.setString(5, data.getFechaModificacion());
			}
		});
		data.setIdLibro(id);
		return id;
	}

	public List<OpinionLibro> queryAll()throws Exception{
		String sql = "SELECT * FROM opinion_libro";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				OpinionLibro row = new OpinionLibro();
				row.setIdLibro(rs.getLong("id_libro"));
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
				OpinionLibro row = new OpinionLibro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setOpinion(rs.getString("opinion"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public List<OpinionLibro> queryByIdLibro(Long idLibro)throws Exception{
		String sql = "SELECT * FROM opinion_libro WHERE id_libro='"+idLibro+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				OpinionLibro row = new OpinionLibro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setOpinion(rs.getString("opinion"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<OpinionLibro> queryByIdUsuario(Long idUsuario)throws Exception{
		String sql = "SELECT * FROM opinion_libro WHERE id_usuario='"+idUsuario+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				OpinionLibro row = new OpinionLibro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setOpinion(rs.getString("opinion"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<OpinionLibro> queryByOpinion(String opinion)throws Exception{
		String sql = "SELECT * FROM opinion_libro WHERE opinion='"+opinion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				OpinionLibro row = new OpinionLibro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setOpinion(rs.getString("opinion"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<OpinionLibro> queryByCalificacion(Long calificacion)throws Exception{
		String sql = "SELECT * FROM opinion_libro WHERE calificacion='"+calificacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				OpinionLibro row = new OpinionLibro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setOpinion(rs.getString("opinion"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<OpinionLibro> queryByFechaCreacion(String fechaCreacion)throws Exception{
		String sql = "SELECT * FROM opinion_libro WHERE fecha_creacion='"+fechaCreacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				OpinionLibro row = new OpinionLibro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setOpinion(rs.getString("opinion"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<OpinionLibro> queryByFechaModificacion(String fechaModificacion)throws Exception{
		String sql = "SELECT * FROM opinion_libro WHERE fecha_modificacion='"+fechaModificacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				OpinionLibro row = new OpinionLibro();
				row.setIdLibro(rs.getLong("id_libro"));
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