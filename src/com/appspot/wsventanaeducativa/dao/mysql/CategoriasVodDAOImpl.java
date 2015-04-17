package com.appspot.wsventanaeducativa.dao.mysql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Date;

import com.appspot.wsventanaeducativa.dao.dto.CategoriasVod;
import com.appspot.wsventanaeducativa.dao.CategoriasVodDAO;
import com.appspot.wsventanaeducativa.dao.sql.BaseDAO;
import com.appspot.wsventanaeducativa.dao.sql.DAOCache;
import com.appspot.wsventanaeducativa.dao.sql.PreparedStatementSetter;
import com.appspot.wsventanaeducativa.dao.sql.ResultSetExtractor;

public  class CategoriasVodDAOImpl extends BaseDAO implements CategoriasVodDAO{
	public static final DAOCache cache = new DAOCache();

	public DAOCache getCache() {
		return cache;
	}

	protected void clearCacheOnInsert(CategoriasVod data){}

	public CategoriasVod load(final String id) throws Exception{
		String sql = "SELECT * FROM categorias_vod WHERE id=?";
		return (CategoriasVod) getRow(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setString(1, id);
			}
		}, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			CategoriasVod row  = new CategoriasVod();
				row.setCategoriasCategoria(rs.getString("categorias_categoria"));
				row.setVodIdVod(rs.getLong("vod_id_vod"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	public int delete(final String id) throws Exception{
		//cache.clear(id);
		String sql = "DELETE FROM categorias_vod WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setString(1, id);
			}
		});
	}

	public int update(final CategoriasVod data) throws Exception{
		//cache.clear(data.getId());
		String sql = "UPDATE categorias_vod SET vod_id_vod = ?, fecha_creacion = ?, fecha_modificacion = ? WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, data.getVodIdVod());
				ps.setString(2, data.getFechaCreacion());
				ps.setString(3, data.getFechaModificacion());
				ps.setString(4, data.getCategoriasCategoria());
			}
	});
	}

	public ResultSetExtractor getDefaultExtractor() throws Exception{
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			CategoriasVod row  = new CategoriasVod();
				row.setCategoriasCategoria(rs.getString("categorias_categoria"));
				row.setVodIdVod(rs.getLong("vod_id_vod"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public long insert(final CategoriasVod data) throws Exception{
		clearCacheOnInsert(data);
		String sql = "INSERT INTO categorias_vod (categorias_categoria, vod_id_vod, fecha_creacion, fecha_modificacion) VALUES (?, ?, ? )";
		long id = executeInsert(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setString(1, data.getCategoriasCategoria());
				ps.setLong(2, data.getVodIdVod());
				ps.setString(3, data.getFechaCreacion());
				ps.setString(4, data.getFechaModificacion());
			}
		});
		
		return id;
	}

	public List<CategoriasVod> queryAll()throws Exception{
		String sql = "SELECT * FROM categorias_vod";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				CategoriasVod row = new CategoriasVod();
				row.setCategoriasCategoria(rs.getString("categorias_categoria"));
				row.setVodIdVod(rs.getLong("vod_id_vod"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	 public ResultSetExtractor getListResultSetExtractor(){
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				CategoriasVod row = new CategoriasVod();
				row.setCategoriasCategoria(rs.getString("categorias_categoria"));
				row.setVodIdVod(rs.getLong("vod_id_vod"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public List<CategoriasVod> queryByCategoriasCategoria(String categoriasCategoria)throws Exception{
		String sql = "SELECT * FROM categorias_vod WHERE categorias_categoria='"+categoriasCategoria+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				CategoriasVod row = new CategoriasVod();
				row.setCategoriasCategoria(rs.getString("categorias_categoria"));
				row.setVodIdVod(rs.getLong("vod_id_vod"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<CategoriasVod> queryByVodIdVod(Long vodIdVod)throws Exception{
		String sql = "SELECT * FROM categorias_vod WHERE vod_id_vod='"+vodIdVod+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				CategoriasVod row = new CategoriasVod();
				row.setCategoriasCategoria(rs.getString("categorias_categoria"));
				row.setVodIdVod(rs.getLong("vod_id_vod"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<CategoriasVod> queryByFechaCreacion(String fechaCreacion)throws Exception{
		String sql = "SELECT * FROM categorias_vod WHERE fecha_creacion='"+fechaCreacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				CategoriasVod row = new CategoriasVod();
				row.setCategoriasCategoria(rs.getString("categorias_categoria"));
				row.setVodIdVod(rs.getLong("vod_id_vod"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<CategoriasVod> queryByFechaModificacion(String fechaModificacion)throws Exception{
		String sql = "SELECT * FROM categorias_vod WHERE fecha_modificacion='"+fechaModificacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				CategoriasVod row = new CategoriasVod();
				row.setCategoriasCategoria(rs.getString("categorias_categoria"));
				row.setVodIdVod(rs.getLong("vod_id_vod"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	}