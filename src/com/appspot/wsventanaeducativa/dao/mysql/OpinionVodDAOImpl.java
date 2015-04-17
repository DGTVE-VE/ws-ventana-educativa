package com.appspot.wsventanaeducativa.dao.mysql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Date;

import com.appspot.wsventanaeducativa.dao.dto.OpinionVod;
import com.appspot.wsventanaeducativa.dao.OpinionVodDAO;
import com.appspot.wsventanaeducativa.dao.sql.BaseDAO;
import com.appspot.wsventanaeducativa.dao.sql.DAOCache;
import com.appspot.wsventanaeducativa.dao.sql.PreparedStatementSetter;
import com.appspot.wsventanaeducativa.dao.sql.ResultSetExtractor;

public  class OpinionVodDAOImpl extends BaseDAO implements OpinionVodDAO{
	public static final DAOCache cache = new DAOCache();

	public DAOCache getCache() {
		return cache;
	}

	protected void clearCacheOnInsert(OpinionVod data){}

	public OpinionVod load(final Long id) throws Exception{
		String sql = "SELECT * FROM opinion_vod WHERE id=?";
		return (OpinionVod) getRow(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, id);
			}
		}, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			OpinionVod row  = new OpinionVod();
				row.setUsuarioIdUsuario(rs.getLong("usuario_id_usuario"));
				row.setVodIdVod(rs.getLong("vod_id_vod"));
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
		String sql = "DELETE FROM opinion_vod WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, id);
			}
		});
	}

	public int update(final OpinionVod data) throws Exception{
		//cache.clear(data.getId());
		String sql = "UPDATE opinion_vod SET vod_id_vod = ?, opinion = ?, calificacion = ?, fecha_creacion = ?, fecha_modificacion = ? WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, data.getVodIdVod());
				ps.setString(2, data.getOpinion());
				ps.setLong(3, data.getCalificacion());
				ps.setString(4, data.getFechaCreacion());
				ps.setString(5, data.getFechaModificacion());
				ps.setLong(6, data.getUsuarioIdUsuario());
			}
	});
	}

	public ResultSetExtractor getDefaultExtractor() throws Exception{
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			OpinionVod row  = new OpinionVod();
				row.setUsuarioIdUsuario(rs.getLong("usuario_id_usuario"));
				row.setVodIdVod(rs.getLong("vod_id_vod"));
				row.setOpinion(rs.getString("opinion"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public long insert(final OpinionVod data) throws Exception{
		clearCacheOnInsert(data);
		String sql = "INSERT INTO opinion_vod ( vod_id_vod, opinion, calificacion, fecha_creacion, fecha_modificacion) VALUES (?, ?, ?, ?, ? )";
		long id = executeInsert(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, data.getVodIdVod());
				ps.setString(2, data.getOpinion());
				ps.setLong(3, data.getCalificacion());
				ps.setString(4, data.getFechaCreacion());
				ps.setString(5, data.getFechaModificacion());
			}
		});
		data.setUsuarioIdUsuario(id);
		return id;
	}

	public List<OpinionVod> queryAll()throws Exception{
		String sql = "SELECT * FROM opinion_vod";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				OpinionVod row = new OpinionVod();
				row.setUsuarioIdUsuario(rs.getLong("usuario_id_usuario"));
				row.setVodIdVod(rs.getLong("vod_id_vod"));
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
				OpinionVod row = new OpinionVod();
				row.setUsuarioIdUsuario(rs.getLong("usuario_id_usuario"));
				row.setVodIdVod(rs.getLong("vod_id_vod"));
				row.setOpinion(rs.getString("opinion"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public List<OpinionVod> queryByUsuarioIdUsuario(Long usuarioIdUsuario)throws Exception{
		String sql = "SELECT * FROM opinion_vod WHERE usuario_id_usuario='"+usuarioIdUsuario+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				OpinionVod row = new OpinionVod();
				row.setUsuarioIdUsuario(rs.getLong("usuario_id_usuario"));
				row.setVodIdVod(rs.getLong("vod_id_vod"));
				row.setOpinion(rs.getString("opinion"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<OpinionVod> queryByVodIdVod(Long vodIdVod)throws Exception{
		String sql = "SELECT * FROM opinion_vod WHERE vod_id_vod='"+vodIdVod+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				OpinionVod row = new OpinionVod();
				row.setUsuarioIdUsuario(rs.getLong("usuario_id_usuario"));
				row.setVodIdVod(rs.getLong("vod_id_vod"));
				row.setOpinion(rs.getString("opinion"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<OpinionVod> queryByOpinion(String opinion)throws Exception{
		String sql = "SELECT * FROM opinion_vod WHERE opinion='"+opinion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				OpinionVod row = new OpinionVod();
				row.setUsuarioIdUsuario(rs.getLong("usuario_id_usuario"));
				row.setVodIdVod(rs.getLong("vod_id_vod"));
				row.setOpinion(rs.getString("opinion"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<OpinionVod> queryByCalificacion(Long calificacion)throws Exception{
		String sql = "SELECT * FROM opinion_vod WHERE calificacion='"+calificacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				OpinionVod row = new OpinionVod();
				row.setUsuarioIdUsuario(rs.getLong("usuario_id_usuario"));
				row.setVodIdVod(rs.getLong("vod_id_vod"));
				row.setOpinion(rs.getString("opinion"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<OpinionVod> queryByFechaCreacion(String fechaCreacion)throws Exception{
		String sql = "SELECT * FROM opinion_vod WHERE fecha_creacion='"+fechaCreacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				OpinionVod row = new OpinionVod();
				row.setUsuarioIdUsuario(rs.getLong("usuario_id_usuario"));
				row.setVodIdVod(rs.getLong("vod_id_vod"));
				row.setOpinion(rs.getString("opinion"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<OpinionVod> queryByFechaModificacion(String fechaModificacion)throws Exception{
		String sql = "SELECT * FROM opinion_vod WHERE fecha_modificacion='"+fechaModificacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				OpinionVod row = new OpinionVod();
				row.setUsuarioIdUsuario(rs.getLong("usuario_id_usuario"));
				row.setVodIdVod(rs.getLong("vod_id_vod"));
				row.setOpinion(rs.getString("opinion"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	}