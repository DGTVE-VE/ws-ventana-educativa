package com.appspot.wsventanaeducativa.dao.mysql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Date;

import com.appspot.wsventanaeducativa.dao.dto.SerieCategoria;
import com.appspot.wsventanaeducativa.dao.SerieCategoriaDAO;
import com.appspot.wsventanaeducativa.dao.sql.BaseDAO;
import com.appspot.wsventanaeducativa.dao.sql.DAOCache;
import com.appspot.wsventanaeducativa.dao.sql.PreparedStatementSetter;
import com.appspot.wsventanaeducativa.dao.sql.ResultSetExtractor;

public  class SerieCategoriaDAOImpl extends BaseDAO implements SerieCategoriaDAO{
	public static final DAOCache cache = new DAOCache();

	public DAOCache getCache() {
		return cache;
	}

	protected void clearCacheOnInsert(SerieCategoria data){}

	public SerieCategoria load(final Long id) throws Exception{
		String sql = "SELECT * FROM serie_categorias WHERE id=?";
		return (SerieCategoria) getRow(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, id);
			}
		}, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			SerieCategoria row  = new SerieCategoria();
				row.setIdSerie(rs.getLong("id_serie"));
				row.setCategoria(rs.getString("categoria"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	public int delete(final Long id) throws Exception{
		//cache.clear(id);
		String sql = "DELETE FROM serie_categorias WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, id);
			}
		});
	}

	public int update(final SerieCategoria data) throws Exception{
		//cache.clear(data.getId());
		String sql = "UPDATE serie_categorias SET categoria = ?, fecha_creacion = ?, fecha_modificacion = ? WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setString(1, data.getCategoria());
				ps.setString(2, data.getFechaCreacion());
				ps.setString(3, data.getFechaModificacion());
				ps.setLong(4, data.getIdSerie());
			}
	});
	}

	public ResultSetExtractor getDefaultExtractor() throws Exception{
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			SerieCategoria row  = new SerieCategoria();
				row.setIdSerie(rs.getLong("id_serie"));
				row.setCategoria(rs.getString("categoria"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public long insert(final SerieCategoria data) throws Exception{
		clearCacheOnInsert(data);
		String sql = "INSERT INTO serie_categorias ( categoria, fecha_creacion, fecha_modificacion) VALUES (?, ?, ? )";
		long id = executeInsert(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setString(1, data.getCategoria());
				ps.setString(2, data.getFechaCreacion());
				ps.setString(3, data.getFechaModificacion());
			}
		});
		data.setIdSerie(id);
		return id;
	}

	public List<SerieCategoria> queryAll()throws Exception{
		String sql = "SELECT * FROM serie_categorias";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				SerieCategoria row = new SerieCategoria();
				row.setIdSerie(rs.getLong("id_serie"));
				row.setCategoria(rs.getString("categoria"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	 public ResultSetExtractor getListResultSetExtractor(){
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				SerieCategoria row = new SerieCategoria();
				row.setIdSerie(rs.getLong("id_serie"));
				row.setCategoria(rs.getString("categoria"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public List<SerieCategoria> queryByIdSerie(Long idSerie)throws Exception{
		String sql = "SELECT * FROM serie_categorias WHERE id_serie='"+idSerie+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				SerieCategoria row = new SerieCategoria();
				row.setIdSerie(rs.getLong("id_serie"));
				row.setCategoria(rs.getString("categoria"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<SerieCategoria> queryByCategoria(String categoria)throws Exception{
		String sql = "SELECT * FROM serie_categorias WHERE categoria='"+categoria+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				SerieCategoria row = new SerieCategoria();
				row.setIdSerie(rs.getLong("id_serie"));
				row.setCategoria(rs.getString("categoria"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<SerieCategoria> queryByFechaCreacion(String fechaCreacion)throws Exception{
		String sql = "SELECT * FROM serie_categorias WHERE fecha_creacion='"+fechaCreacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				SerieCategoria row = new SerieCategoria();
				row.setIdSerie(rs.getLong("id_serie"));
				row.setCategoria(rs.getString("categoria"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<SerieCategoria> queryByFechaModificacion(String fechaModificacion)throws Exception{
		String sql = "SELECT * FROM serie_categorias WHERE fecha_modificacion='"+fechaModificacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				SerieCategoria row = new SerieCategoria();
				row.setIdSerie(rs.getLong("id_serie"));
				row.setCategoria(rs.getString("categoria"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	}